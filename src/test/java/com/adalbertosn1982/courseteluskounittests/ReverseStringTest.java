package com.adalbertosn1982.courseteluskounittests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void testReverseString() {
        ReverseString reverseString = new ReverseString();
        String input = "Hello";
        String expected = "olleH";
        String actual = reverseString.reverse2(input);
        assertEquals(expected, actual);
    }
}