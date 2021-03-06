/* ©Copyright 2011 Cameron Morris
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.owasp.passfault;

/**
 * This interface represents a password pattern finder.
 */
public interface PatternFinder {

  /**
   * A password is handed to the finder through this method and the results 
   * will be placed into the same object 
   * @param pass holds the password and any finders that will be found as the
   * result of analysis
   *
   * @throws Exception 
   */
  void analyze(PasswordResults pass) throws Exception;
}
