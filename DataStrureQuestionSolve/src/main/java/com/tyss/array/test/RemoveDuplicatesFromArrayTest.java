package com.tyss.array.test;

import java.util.Arrays;
import java.util.Scanner;

import com.tyss.array.FindMaxLengthOfSubArrayHavingGivenSum;
import com.tyss.array.RemoveDuplicatesFromArray;

import lombok.extern.java.Log;

@Log
public class RemoveDuplicatesFromArrayTest {
	public static void main(String[] args) {
		// create Scanner class object
		Scanner sc = new Scanner(System.in);
		// create FindMissingNumberFromArray class object
		RemoveDuplicatesFromArray removeDuplicatesFromGivenArray = new RemoveDuplicatesFromArray(
				7);
		// get array
		Integer[] numArray = removeDuplicatesFromGivenArray.getNumArray();
		// insert element to array
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 30;
		numArray[4] = 40;
		numArray[5] = 40;
		numArray[6] = 50;
		
		// remove duplicates from Array
		removeDuplicatesFromGivenArray.removeDuplicatesFromGivenArray();
		
		// print array after remove duplicates
	    log.info("After remove duplicates from array ::"+Arrays.asList(numArray).toString());
		

	}
}
