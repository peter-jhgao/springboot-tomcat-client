package com.example.springboot.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Spring Boot HelloWorldController test - {@link HelloWorldController}
 */
public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello CCE from CSE!",new HelloWorldController().sayHello());
    }
}
