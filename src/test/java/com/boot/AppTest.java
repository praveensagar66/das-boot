package com.boot;

import com.boot.controller.HomeController;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testApp() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Hello Das - Reporting");
    }
}
