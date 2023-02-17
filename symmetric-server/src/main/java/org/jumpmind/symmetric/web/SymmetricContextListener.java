/**
 * Licensed to JumpMind Inc under one or more contributor
 * license agreements.  See the NOTICE file distributed
 * with this work for additional information regarding
 * copyright ownership.  JumpMind Inc licenses this file
 * to you under the GNU General Public License, version 3.0 (GPLv3)
 * (the "License"); you may not use this file except in compliance
 * with the License.
 *
 * You should have received a copy of the GNU General Public License,
 * version 3.0 (GPLv3) along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jumpmind.symmetric.web;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.lang3.StringUtils;
import org.jumpmind.properties.TypedProperties;
import org.jumpmind.symmetric.common.SystemConstants;
import org.springframework.web.context.support.WebApplicationContextUtils;

//RNote MASTER STEP 1
//RNote 容器初始化后的钩子函数中配置 SymmetricEngineHolder
public class SymmetricContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        SymmetricEngineHolder engineHolder = new SymmetricEngineHolder();
        ServletContext ctx = sce.getServletContext();

        // RNote 配置 SymmetricEngineHolder 的参数，是在web.xml中配置的

        String autoStart = ctx.getInitParameter(WebConstants.INIT_PARAM_AUTO_START);
        engineHolder.setAutoStart(autoStart == null ? true : autoStart.equalsIgnoreCase("true"));

        String autoCreate = ctx.getInitParameter(WebConstants.INIT_PARAM_AUTO_CREATE);
        engineHolder.setAutoCreate(autoCreate == null ? true : autoCreate.equalsIgnoreCase("true"));

        //RNote multiServerMode 参数， 当“true”或配置了 engines 目录时， 其值设为true;
        //RNote 网闸中 此为true
        String multiServerMode = ctx.getInitParameter(WebConstants.INIT_PARAM_MULTI_SERVER_MODE);
        engineHolder.setMultiServerMode((multiServerMode != null && multiServerMode.equalsIgnoreCase("true")) ||
                StringUtils.isNotBlank(System.getProperty(SystemConstants.SYSPROP_ENGINES_DIR)));

        engineHolder.setSingleServerPropertiesFile(ctx
                .getInitParameter(WebConstants.INIT_SINGLE_SERVER_PROPERTIES_FILE));

        String staticEnginesMode = ctx.getInitParameter(WebConstants.INIT_PARAM_STATIC_ENGINES_MODE);
        engineHolder.setStaticEnginesMode(staticEnginesMode != null
                && staticEnginesMode.equalsIgnoreCase("true"));
        engineHolder.setDeploymentType(ctx.getInitParameter(WebConstants.INIT_PARAM_DEPLOYMENT_TYPE));
        ctx.setAttribute(WebConstants.ATTR_ENGINE_HOLDER, engineHolder);
        // RNote 网闸没配置，默认null
        String useWebApplicationContext = ctx.getInitParameter(WebConstants.INIT_SINGLE_USE_WEBAPP_CONTEXT);
        // RNote 网闸不入
        if ("true".equals(useWebApplicationContext)) {
            engineHolder.setSpringContext(WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext()));
        }
        // RNote 网闸不入
        if (!"true".equals(System.getProperty(SystemConstants.SYSPROP_LAUNCHER))) {
            URL serverPropertiesURL = getClass().getClassLoader().getResource("/symmetric-server.properties");
            if (serverPropertiesURL != null) {
                try (InputStream fis = serverPropertiesURL.openStream()) {
                    TypedProperties serverProperties = new TypedProperties();
                    serverProperties.load(fis);
                    serverProperties.merge(System.getProperties());
                    System.getProperties().putAll(serverProperties);
                } catch (IOException ex) {
                }
            }
        }
        // GNote 已经配置好的 SymmetricEngineHolder ，调用 start()
        //RNote MASTER STEP 2
        engineHolder.start();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        SymmetricEngineHolder engineHolder = (SymmetricEngineHolder) ctx
                .getAttribute(WebConstants.ATTR_ENGINE_HOLDER);
        if (engineHolder != null) {
            engineHolder.stop();
            ctx.removeAttribute(WebConstants.ATTR_ENGINE_HOLDER);
        }
    }
}
