/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.lotr.people;

import com.lotr.enums.CharacterType;


public class OnePerson
{
    private final String characterName;
    private final Address homeAddress;
    private final CharacterType typeOfCharacter;

    public OnePerson(String name, String address, CharacterType type) {
        characterName = name;
        homeAddress = new Address(address);
        typeOfCharacter = type;
    }

    public String toString () {
        return characterName.toString() + " "
                + homeAddress.toString() + " "
                + typeOfCharacter.toString();
    }
}
