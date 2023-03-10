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
package org.jumpmind.symmetric.model;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    public void testIsVersionGreaterThan() {
        Node test = new Node();
        test.setSymmetricVersion("1.5.0");
        assertTrue(test.isVersionGreaterThanOrEqualTo(1, 3, 0));
        assertFalse(test.isVersionGreaterThanOrEqualTo(2, 0, 0));
        assertFalse(test.isVersionGreaterThanOrEqualTo(2, 0, 0));
        assertTrue(test.isVersionGreaterThanOrEqualTo(1, 4, 9, 1));
        assertTrue(test.isVersionGreaterThanOrEqualTo(1, 5, 0));
        assertFalse(test.isVersionGreaterThanOrEqualTo(1, 5, 1));
        test.setSymmetricVersion("1.5.0-SNAPSHOT");
        assertTrue(test.isVersionGreaterThanOrEqualTo(1, 3, 0));
        assertFalse(test.isVersionGreaterThanOrEqualTo(2, 0, 0));
        assertTrue(test.isVersionGreaterThanOrEqualTo(1, 5, 0));
        test.setSymmetricVersion("development");
        assertTrue(test.isVersionGreaterThanOrEqualTo(1, 3, 0));
        assertTrue(test.isVersionGreaterThanOrEqualTo(2, 0, 0));
    }
}