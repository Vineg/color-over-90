/*
 * -----------------------------------------------------------------------
 * Copyright 2012 - Alistair Rutherford - www.netthreads.co.uk
 * -----------------------------------------------------------------------
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.jlabarca.sound;

public class SoundDefinition
{
	private String name;
	private String path;

	public SoundDefinition(String name, String path)
	{
		this.name = name;
		this.path = path;
	}

	/**
	 * Sound name.
	 * 
	 * @return The name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * The path to sound file.
	 * 
	 * @return The path to sound file.
	 */
	public String getPath()
	{
		return path;
	}

}
