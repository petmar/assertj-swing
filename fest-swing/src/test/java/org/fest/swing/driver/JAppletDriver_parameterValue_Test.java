/*
 * Created on Apr 3, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.swing.driver;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

/**
 * Tests for <code>{@link JAppletDriver#parameterValue(javax.swing.JApplet, String)}</code>.
 *
 * @author Alex Ruiz
 */
public class JAppletDriver_parameterValue_Test extends JAppletDriver_TestCase {

  @Test
  public void should_retrieve_parameter_value() {
    applet().addParameter("firstName", "Luke");
    String value = driver().parameterValue(applet(), "firstName");
    assertThat(value).isEqualTo("Luke");
    assertThat(applet().wasMethodCalledInEDT("getParameter('firstName')")).isTrue();
  }
}