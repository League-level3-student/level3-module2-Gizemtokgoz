package _03_More_Algorithms;

import java.util.Iterator;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int newnum = num1*num2;
    	return null;
       
    }
    
    public static boolean isPrime(int numm) {
    	if (numm/2 == 0 && numm/17 == 0) {
			return false;
		}
    	if (numm/2 != 0) {
			return true;
		}
    	return false;
    }
    
    public static String isSquare(int num1, int num2) {
    	int newnum = num1*num2;
    	return null;
       
    }
    
    public static String isCube(int num1, int num2) {
    	int newnum = num1*num2;
    	return null;
       
    }
    
     
    public static int findBrokenEgg(List<String> eggs) {
    	for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
        return 0;
    }

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int numoy = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				numoy += 1;
			}
		}
		return numoy;
	}
	
	public static int findTallest(List<Double> peeps) {
		for (int i = 0; i < peeps.size(); i++) {
			
		}
		
		return 0;
	}
}
