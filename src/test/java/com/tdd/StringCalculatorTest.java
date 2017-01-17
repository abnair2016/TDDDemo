package com.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    /**
      * https://github.com/abnair2016/TDDDemo.git
     *
     * Create a simple String calculator with a method int Add(string numbers).
     *
     * 1: A single number returns the value
     * 2: Another single number returns respective value
     * 3: An empty string returns zero
     * 4: An empty string with whitespaces returns zero
     * 5: Null returns zero
     * 6: Two numbers, comma delimited, returns the sum
     * 7: Two numbers, newline delimited, returns the sum
     * 8: Three numbers, delimited either way, returns the sum
     * 9: Single Negative number, throw an exception and list the negative number
     * 10: Multiple Negative numbers, throw an exception and list all negative numbers
     * 11: Numbers greater than 1000 are ignored
     *
     */

    @Before
    public void setUp(){
    }

    @Test
    public void testName() throws Exception{
        assertEquals("", "");
    }

}
