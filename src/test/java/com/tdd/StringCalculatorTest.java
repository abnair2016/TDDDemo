package com.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    /**
     * Create a simple String calculator with a method int Add(string numbers).
     *
     * 1: An empty string returns zero
     * 2: Null returns zero
     * 3: A single number returns the value
     * 4: Two numbers, comma delimited, returns the sum
     * 5: Two numbers, newline delimited, returns the sum
     * 6: Three numbers, delimited either way, returns the sum
     * 7: Negative numbers throw an exception
     * 8: Numbers greater than 1000 are ignored
     *
     */

    @Before
    public void setUp(){

    }

    @Test
    public void testName() throws Exception{
        assertEquals("","");
    }

}
