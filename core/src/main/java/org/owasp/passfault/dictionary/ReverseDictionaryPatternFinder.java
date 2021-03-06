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

package org.owasp.passfault.dictionary;

import org.owasp.passfault.PasswordResults;

/**
 * ReverseDictionaryPatternFinder uses the BackwardsAnalysisAdapter to reverse
 * a password to find reverse passwords in a dictionary according to a strategy.
 * @author cam
 */
public class ReverseDictionaryPatternFinder extends DictionaryPatternsFinder {

  public ReverseDictionaryPatternFinder(Dictionary diction, DictionaryStrategy strategy) {
    super(diction, strategy);
  }

  @Override
  public void analyze(PasswordResults pass) throws Exception {
    super.analyze(new BackwardsAnalysisAdapter(pass));
  }
}
