package com.test;

import java.util.Arrays;

public class CodeFightTest {
	
	public static void main(String args[]) {
		CodeFightTest codeFightTest = new CodeFightTest();

		// Level 1-2
		System.out.println(codeFightTest.centuryFromYear(1700));
		
		// Level 1-3
//		System.out.println(codeFightTest.checkPalindrome("Jim"));
		
		// Level 2-1
//		int[] testArray = {3, 6, -2, -5, 7, 3};
//		System.out.println(codeFightTest.adjacentElementsProduct(testArray));
		
		// Level 2-2
//		int number = 4;
//		System.out.println("Given: " + number);
//		System.out.println("Result: " + codeFightTest.shapeArea(number));
		
		// Level 2-3
//		int[] statues = {6, 2, 3, 8};
//		System.out.println(codeFightTest.makeArrayConsecutive2(statues));
	}
	
	// Level 2-3
	int makeArrayConsecutive2(int[] statues) {
		
		int countOfNewStatuesNeeded = 0;
		
		Arrays.sort(statues);
		
		for(int i = 0; i < statues.length - 1; i++) {
			countOfNewStatuesNeeded = countOfNewStatuesNeeded + (statues[i + 1] - statues[i] - 1);
		}
		
		return countOfNewStatuesNeeded;
	}

	
	// Level 2-2
	int shapeArea(int n) {
		
		return (n * ((n - 1) * 2) + 1);
	}

	
	// Level 2-1
	int adjacentElementsProduct(int[] inputArray) {
		int returnValue = -50;
		
		for(int i = 0; i < inputArray.length - 1; i++) {

			returnValue = returnValue > (inputArray[i] * inputArray[i + 1]) ? returnValue : (inputArray[i] * inputArray[i + 1]);
		}
		
		return returnValue;
	}

	// Level 1-3
	boolean checkPalindrome(String inputString) {
	    char[] charArray = inputString.toCharArray();
	    char[] reverseCharArray = new char[inputString.length()];
	   
	    for(int i = 0; i < inputString.length(); i++) {
	        reverseCharArray[i] = charArray[inputString.length() - 1 - i];
	    }
	    
	    return Arrays.equals(charArray, reverseCharArray);
	}
	
	// Level 1-2
	int centuryFromYear(int year) {
		return (year - 1) / 100 + 1;
	}


}
