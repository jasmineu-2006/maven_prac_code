package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPassCase() {
        App app = new App();
        assertEquals("A PASS", app.classifyResult(400, 5));
    }

    @Test
    public void testFailCase() {
        App app = new App();
        assertEquals("F FAIL", app.classifyResult(100, 5));
    }

    @Test
    public void testInvalidInput() {
        App app = new App();
        assertEquals("Invalid input", app.classifyResult(100, 0));
    }
}
