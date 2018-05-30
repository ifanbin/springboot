package com.smarts.springboot.controller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {
    @Test
    public void testSayHello() {
        //用于比较预期和实际是否有差异
        assertEquals("hello world!",new HomeController().sayHello());
    }
}
