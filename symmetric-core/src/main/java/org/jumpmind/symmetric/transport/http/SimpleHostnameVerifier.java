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
package org.jumpmind.symmetric.transport.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import org.apache.commons.lang3.StringUtils;
import org.jumpmind.symmetric.common.Constants;

public class SimpleHostnameVerifier implements HostnameVerifier {
    private String httpSslVerifiedServerNames;

    public SimpleHostnameVerifier(final String httpSslVerifiedServerNames) {
        this.httpSslVerifiedServerNames = httpSslVerifiedServerNames;
    }

    @Override
    public boolean verify(String hostname, SSLSession session) {
        boolean verified = false;
        if (!StringUtils.isBlank(httpSslVerifiedServerNames)) {
            if (httpSslVerifiedServerNames.equalsIgnoreCase(Constants.TRANSPORT_HTTPS_VERIFIED_SERVERS_ALL)) {
                verified = true;
            } else {
                String[] names = httpSslVerifiedServerNames.split(",");
                for (String string : names) {
                    if (hostname != null && hostname.equals(string.trim())) {
                        verified = true;
                        break;
                    }
                }
            }
        }
        return verified;
    }
}
