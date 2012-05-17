/*******************************************************************************
 * Copyright 2012 Charles University in Prague
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package cz.cuni.mff.d3s.deeco.exceptions;

/**
 * Thrown whenever there is a type matching related problem, while retrieving
 * knowledge the knowledge repository.
 * 
 * @author Michal Kit
 * 
 */
public class KMIllegalArgumentException extends KMException {
	public KMIllegalArgumentException(String message) {
		super(message);
	}
}
