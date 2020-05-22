package com.tyss.array.test;

import com.tyss.array.FindDuplicateNumberFromArray;
import com.tyss.array.FindSmallestAndLargestNumberFromArray;

import lombok.extern.java.Log;

@Log
public class FindSmallestAndLargestNumberFromArrayTest {
	public static void main(String[] args) {
     // create FindMissingNumberFromArray class object
     FindSmallestAndLargestNumberFromArray findSmallestAndLargestNumberFromArray = new FindSmallestAndLargestNumberFromArray(20);
		// get array
		Integer[] numArray = findSmallestAndLargestNumberFromArray.getNumArray();
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		numArray[4] = 50;
		numArray[5] = 60;
		
		// find smallest number
		Integer smallestNumber = findSmallestAndLargestNumberFromArray.findSmallestNumber();
		log.info("Smallest Number is "+smallestNumber);
		
		// find largest number
		Integer largestNumber = findSmallestAndLargestNumberFromArray.findLargestNumber();
		log.info("Largest Number is "+largestNumber);
		
	}
}
