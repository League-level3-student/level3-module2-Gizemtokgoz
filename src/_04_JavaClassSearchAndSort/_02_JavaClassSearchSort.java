package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
		}	
    	return null;
    }
    
    public static List<Double> listSort(List<Double> list){
        for (int i = 0; i < list.size(); i++) {
			Collections.sort(list);
		}
        return null;
    }

    public static Boolean arraySearch(char[] arr, char key) {
    	for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			int arrSearch = Arrays.binarySearch(arr, key);
		}    	
        return null;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
    	for (int i = 0; i < list.size(); i++) {
			Collections.sort(list);
			int liSearch = Collections.binarySearch(list, key);
		}
        return null;
    }
}
