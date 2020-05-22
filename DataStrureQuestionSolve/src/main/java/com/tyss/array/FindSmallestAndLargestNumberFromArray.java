package com.tyss.array;

import lombok.Data;

@Data
public class FindSmallestAndLargestNumberFromArray {
	private Integer[] numArray;

	public FindSmallestAndLargestNumberFromArray(Integer size) {
		numArray = new Integer[size];
	}

	/**
	 * This method is used for find smallest number from given array
	 * 
	 * @return
	 */
	public Integer findSmallestNumber() {
		// take base index element as smallest number
		Integer smallestNumber = numArray[0];
		// smallest number find logic
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] != null && numArray[i] < smallestNumber) {
				smallestNumber = numArray[i];
			}
		}
		// return smallest number from the given array
		return smallestNumber;
	}

	/**
	 * This method is used for find largest number from the given array
	 * 
	 * @return
	 */
	public Integer findLargestNumber() {
		// take base index element as largest number
		Integer largestNumber = numArray[0];
		// smallest number find logic
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] != null && numArray[i] > largestNumber) {
				largestNumber = numArray[i];
			}
		}
		// return smallest number from the given array
		return largestNumber;
	}
}
