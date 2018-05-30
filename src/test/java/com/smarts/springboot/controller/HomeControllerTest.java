package com.smarts.springboot.controller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {
    @Test
    public void testSayHello() {
        assertEquals("hello world!",new HomeController().sayHello());
    }
}
