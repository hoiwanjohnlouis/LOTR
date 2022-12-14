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

package com.lotr;


import com.lotr.people.Cast;
import org.apache.logging.log4j.*;

public class Main {
    //private final String WHERE_AM_I = this.getClass().getSimpleName();
//    private static final Logger logger = LogManager.getRootLogger();
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Cast castList = new Cast();
        castList.loadCastOfLOTR();
        castList.printCast();
        castList.readCastFromJSONFile();
        castList.writeCastToJSONFile();
        castList.readCastFromTXTFile();
        castList.writeCastToTXTFile();

        logger.trace("Main is complete");
        logger.info("Main is complete");
        logger.warn("Main is complete");
        logger.error("Main is complete");
        logger.fatal("Main is complete");
        logger.debug("Main is complete");
    }
}
