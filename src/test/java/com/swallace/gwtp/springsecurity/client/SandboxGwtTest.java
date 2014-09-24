package com.swallace.gwtp.springsecurity.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.swallace.gwtp.spring.security.GwtpSpringSecurity";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
