package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(10, 7 + 3);
        assertTrue(8 > 2);
        assertFalse(2 > 8);
        Object obj = null;
        assertNull(obj);
        Object nonNullObj = "OpenAI";
        assertNotNull(nonNullObj);
    }
}
