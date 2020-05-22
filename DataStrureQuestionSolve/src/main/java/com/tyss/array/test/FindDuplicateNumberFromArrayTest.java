package com.tyss.array.test;

import com.tyss.array.FindDuplicateNumberFromArray;

import lombok.extern.java.Log;

@Log
public class FindDuplicateNumberFromArrayTest {

	public static void main(String[] args) {
		// create FindMissingNumberFromArray class object
		FindDuplicateNumberFromArray findMissingNumberFromArray = new FindDuplicateNumberFromArray(20);
		// get array
		Integer[] numArray = findMissingNumberFromArray.getNumArray();
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		numArray[4] = 50;
		numArray[5] = 60;

		// invoke findMissingNumber(-) method to print duplicate numbers
		findMissingNumberFromArray.findDuplicateNumber();
	}
}
