package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void logTest() {

        Logger.getInstance().log("Log1");

        String result = Logger.getInstance().getLastLog();

        Assert.assertEquals("Log1", result);
    }
}
