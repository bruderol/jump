package org.jump.app;

import org.apache.log4j.Logger;

public class JumpExampleApp {

    final static Logger LOGGER = Logger.getLogger(JumpExampleApp.class);

    public static void main(String [] args) {
        JumpExampleApp jumpApp = new JumpExampleApp();
        LOGGER.info(jumpApp.getJump());
    }

    public String getJump() {
        return "Jump";
    }

}
