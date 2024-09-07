package com.adalbertosn1982.courseteluskounittests;

import org.junit.jupiter.api.*;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SortingArrayTest {

    int[] arr;

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void setUpAfterAll() {
        System.out.println("After all tests");
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arr = new int[]{5, 2, 8, 1, 9, 3};
        System.out.println("Before each test");
    }

    @Test
    void testSortArray() {
        //int[] arr = {5, 2, 8, 1, 9, 3};
        int[] expected = {1, 2, 3, 5, 8, 9};
        int[] result = SortingArray.sortArray(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSortArray2() {
       //int[] arr = {5, 2, 8, 1, 9, 3};
        int[] expected = {1, 2, 3, 5, 8, 9};
        int[] result = SortingArray.sortArray2(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNTimeSortingArray2() {
       // int[] arr = {5, 2, 8, 1, 9, 3};
        int[] expected = {1, 2, 3, 5, 8, 9};
        int[] result = SortingArray.nTimeSortingArray2(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNTimeSortingArray2Performance() {
        //int[] arr = {5, 2, 8, 1, 9, 3};
        int[] result = SortingArray.nTimeSortingArray2(arr);
        assertNotNull(result);
    }

    @Test
    void testSortArraySendingException() {
        int[] arr = {5, 2, 8, 1, 9, 3};
        assertThrows(Exception.class, ()->SortingArray.sortArraySendingException(arr));
    }

    @Test
    void testSortArrayPerformance2() {
        int[] unsorted = {5, 2, 8, 1, 9, 3};
        assertTimeout(Duration.ofMillis(10), ()->SortingArray.nTimeSortingArray2(arr));
    }

    @AfterEach
    void tearDown() {
        arr = null;
    }
}