package org.jump.app;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class JumpExampleApp {

    final static Logger LOGGER = Logger.getLogger(JumpExampleApp.class);

    public static void main(String [] args) {
        if (StringUtils.isBlank("   ")) {
            LOGGER.info("Jump!");
        }
    }

}
