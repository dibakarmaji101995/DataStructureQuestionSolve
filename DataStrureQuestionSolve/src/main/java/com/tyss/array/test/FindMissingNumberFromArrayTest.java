package com.tyss.array.test;

import com.tyss.array.FindMissingNumberFromArray;

import lombok.extern.java.Log;

@Log
public class FindMissingNumberFromArrayTest {

	public static void main(String[] args) {
        //create FindMissingNumberFromArray class object
		FindMissingNumberFromArray findMissingNumberFromArray = new FindMissingNumberFromArray(100);
		
		// create missing number
		Integer[] numArray = findMissingNumberFromArray.getNumArray();
		numArray[10] = null;
		
		//invoke findMissingNumber(-) method to get missing number
		Integer missingNumber = findMissingNumberFromArray.findMissingNumber();
		log.info("Missing Number Is "+missingNumber);
	}
}
