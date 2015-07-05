package ua.com.javaschool.homework.oop.lesson01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class SomeTest {

    @Test
    public void testSomemethod() throws Exception {
        String res = Some.somemethod("ku");
        assertEquals("kusome1", res);
    }
}