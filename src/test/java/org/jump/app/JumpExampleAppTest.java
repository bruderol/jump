package org.jump.app;

import org.junit.Assert;
import org.junit.Test;

public class JumpExampleAppTest {

    @Test
    public void testApp() {
        JumpExampleApp app = new JumpExampleApp();
        Assert.assertEquals("Jump", app.getJump());
    }

}
