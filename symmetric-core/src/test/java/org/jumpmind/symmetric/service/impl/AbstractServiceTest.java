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
package org.jumpmind.symmetric.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.Configurator;
import org.jumpmind.db.platform.IDatabasePlatform;
import org.jumpmind.db.platform.nuodb.NuoDbDatabasePlatform;
import org.jumpmind.db.sql.ISqlTemplate;
import org.jumpmind.db.sql.SqlUtils;
import org.jumpmind.symmetric.ISymmetricEngine;
import org.jumpmind.symmetric.db.ISymmetricDialect;
import org.jumpmind.symmetric.io.stage.IStagingManager;
import org.jumpmind.symmetric.service.IClusterService;
import org.jumpmind.symmetric.service.IConfigurationService;
import org.jumpmind.symmetric.service.IDataExtractorService;
import org.jumpmind.symmetric.service.IDataService;
import org.jumpmind.symmetric.service.IIncomingBatchService;
import org.jumpmind.symmetric.service.INodeService;
import org.jumpmind.symmetric.service.IOutgoingBatchService;
import org.jumpmind.symmetric.service.IParameterService;
import org.jumpmind.symmetric.service.IRegistrationService;
import org.jumpmind.symmetric.service.IRouterService;
import org.jumpmind.symmetric.service.ITriggerRouterService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("integration")
public abstract class AbstractServiceTest {
    static protected ISymmetricEngine engine;
    private final static Logger logger = LoggerFactory.getLogger(AbstractServiceTest.class);

    @BeforeAll
    public static void setup() throws Exception {
        if (engine == null) {
            // Level old = setLoggingLevelForTest(Level.DEBUG);
            SqlUtils.setCaptureOwner(true);
            try {
                Class<?> clazz = Class.forName("org.jumpmind.symmetric.test.TestSetupUtil");
                Method method = clazz.getMethod("prepareForServiceTests");
                engine = (ISymmetricEngine) method.invoke(clazz);
            } catch (InvocationTargetException ex) {
                Throwable cause = ex.getCause();
                logger.error(cause.getMessage(), cause);
                if (cause instanceof RuntimeException) {
                    throw (RuntimeException) cause;
                } else {
                    throw new IllegalStateException(cause);
                }
            } catch (Exception ex) {
                logger.error("", ex);
                Assert.fail(ex.getClass().getName() + ": " + ex.getMessage());
            }
            // setLoggingLevelForTest(old);
        }
    }

    protected static Level setLoggingLevelForTest(Level level) {
        Level old = LogManager.getLogger("org.jumpmind").getLevel();
        Configurator.setLevel("org.jumpmind", level);
        return old;
    }

    protected void logTestRunning() {
        logger.info("Running " + new Exception().getStackTrace()[1].getMethodName() + ". "
                + getSymmetricEngine().getSymmetricDialect().getPlatform().getName());
    }

    protected void logTestComplete() {
        logger.info("Completed running " + new Exception().getStackTrace()[1].getMethodName()
                + ". " + getSymmetricEngine().getSymmetricDialect().getPlatform().getName());
    }

    protected ISymmetricEngine getSymmetricEngine() {
        return engine;
    }

    protected IParameterService getParameterService() {
        return getSymmetricEngine().getParameterService();
    }

    protected ISymmetricDialect getDbDialect() {
        return getSymmetricEngine().getSymmetricDialect();
    }

    protected IConfigurationService getConfigurationService() {
        return getSymmetricEngine().getConfigurationService();
    }

    protected IRegistrationService getRegistrationService() {
        return getSymmetricEngine().getRegistrationService();
    }

    protected IDataExtractorService getDataExtractorService() {
        return getSymmetricEngine().getDataExtractorService();
    }

    protected IDataService getDataService() {
        return getSymmetricEngine().getDataService();
    }

    protected INodeService getNodeService() {
        return getSymmetricEngine().getNodeService();
    }

    protected IDatabasePlatform getPlatform() {
        return getSymmetricEngine().getSymmetricDialect().getPlatform();
    }

    protected IRouterService getRouterService() {
        return getSymmetricEngine().getRouterService();
    }

    protected ITriggerRouterService getTriggerRouterService() {
        return getSymmetricEngine().getTriggerRouterService();
    }

    protected IOutgoingBatchService getOutgoingBatchService() {
        return getSymmetricEngine().getOutgoingBatchService();
    }

    protected IIncomingBatchService getIncomingBatchService() {
        return getSymmetricEngine().getIncomingBatchService();
    }

    protected IClusterService getClusterService() {
        return getSymmetricEngine().getClusterService();
    }

    protected ISqlTemplate getSqlTemplate() {
        return getSymmetricEngine().getSymmetricDialect().getPlatform().getSqlTemplate();
    }

    protected IStagingManager getStagingManager() {
        return getSymmetricEngine().getStagingManager();
    }

    protected void assertTrue(boolean condition, String message) {
        Assert.assertTrue(message, condition);
    }

    protected void assertFalse(boolean condition, String message) {
        Assert.assertFalse(message, condition);
    }

    protected void assertNotNull(Object condition, String message) {
        Assert.assertNotNull(message, condition);
    }

    protected void assertNull(Object condition) {
        Assert.assertNull(condition);
    }

    protected void assertNotNull(Object condition) {
        Assert.assertNotNull(condition);
    }

    protected void assertNull(Object condition, String message) {
        Assert.assertNull(message, condition);
    }

    protected void assertFalse(boolean condition) {
        Assert.assertFalse(condition);
    }

    protected void assertTrue(boolean condition) {
        Assert.assertTrue(condition);
    }

    protected void assertEquals(Object actual, Object expected) {
        Assert.assertEquals(expected, actual);
    }

    protected void assertEquals(Object actual, Object expected, String message) {
        Assert.assertEquals(message, expected, actual);
    }

    protected void assertNotSame(Object actual, Object expected, String message) {
        Assert.assertNotSame(message, expected, actual);
    }

    protected void assertNumberOfRows(int rows, String tableName) {
        Assert.assertEquals(tableName + " had an unexpected number of rows", rows, getSqlTemplate()
                .queryForInt("select count(*) from " + tableName));
    }

    protected void forceRebuildOfTrigers() {
        getTriggerRouterService().syncTriggers(true);
    }

    protected int countData() {
        return getDataService().countDataInRange(-1, Integer.MAX_VALUE);
    }

    protected String printDatabase() {
        return getSymmetricEngine().getSymmetricDialect().getPlatform().getName();
    }

    protected void assertNumberOfLinesThatStartWith(int expected, String startsWith, String text) {
        assertNumberOfLinesThatStartWith(expected, startsWith, text, false, false);
    }

    public static String formatTableName(String tableName, IDatabasePlatform platform) {
        if (platform instanceof NuoDbDatabasePlatform) {
            return String.format("%s%s%s", platform.getDefaultSchema(), ".", tableName);
        }
        return tableName;
    }

    protected void assertNumberOfLinesThatStartWith(int expected, String startsWith, String text,
            boolean ignoreCase, boolean atLeast) {
        int actual = 0;
        String[] lines = text.split("\n");
        for (String line : lines) {
            if (line.startsWith(startsWith)) {
                actual++;
            } else if (ignoreCase && line.toLowerCase().startsWith(startsWith.toLowerCase())) {
                actual++;
            }
        }
        if (atLeast) {
            Assert.assertTrue(String.format(
                    "There was less than the expected (%d) number of occurrences of: %s", expected,
                    startsWith), actual >= expected);
        } else {
            Assert.assertEquals("There were not the expected number of occurrences of: "
                    + startsWith, expected, actual);
        }
    }

    protected void routeAndCreateGaps() {
        // one to route unrouted data
        getRouterService().routeData(true);
        // one to create gaps
        getRouterService().routeData(true);
    }

    protected void resetGaps() {
        getSqlTemplate().update("delete from sym_data_gap");
    }

    protected void resetBatches() {
        routeAndCreateGaps();
        getSqlTemplate().update("update sym_outgoing_batch set status='OK' where status != 'OK'");
        long startId = getSqlTemplate().queryForLong("select max(start_id) from sym_data_gap");
        getSqlTemplate()
                .update("delete from sym_data_gap where start_id != ?", startId);
        checkForOpenResources();
    }

    protected void checkForOpenResources() {
        SqlUtils.logOpenResources();
        Assert.assertEquals("There should be no open cursors", 0, SqlUtils.getOpenSqlReadCursors().size());
        Assert.assertEquals("There should be no open transactions", 0, SqlUtils.getOpenTransactions().size());
    }
}
