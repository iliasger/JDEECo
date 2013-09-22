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
package cz.cuni.mff.d3s.deeco.knowledge.jini;

import net.jini.core.entry.Entry;

/**
 * Class used to represent a single entry in the tuple space
 * 
 * @author Michal Kit
 * 
 */
public class Tuple implements Entry {

	private static final long serialVersionUID = -5729672632918164790L;

	public String key;
	public Object value;
	public Long timestamp;

	public Tuple() {
	}

}
