package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
    	String[] testA = {"q", "w", "e", "r", "t", "y"};
    	assertEquals(4, _01_LinearSearch.linearSearch(testA, "t"));
    	assertEquals(-1, _01_LinearSearch.linearSearch(testA, "z"));
        // 1. Use the assertEquals() method to test your linear search method
    }

    @Test
    public void testBinarySearch() {
    	int[] testB = {4, 5, 8, 12, 13, 16};
    	assertEquals(2, _02_BinarySearch.binarySearch(testB, 0, 5, 8));
    	assertEquals(-1, _02_BinarySearch.binarySearch(testB, 0, 5, 9));
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    }
}
