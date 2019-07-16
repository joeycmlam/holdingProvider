package com.mysys.services.holdingProvider.holdingProvider;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTests {

    @Test
    public void homeTest() {
        Controller a = new HoldingProviderApplication();
        String actValue = a.home();
        Assert.assertEquals("version 1.0", actValue);

    }

    @Test
    public void healthCheckTest() {
        Controller a = new HoldingProviderApplication();
        String actValue = a.healthCheck();
        Assert.assertEquals("Springboot started.", actValue);
    }
}