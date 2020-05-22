package com.tyss.array;

import java.util.HashMap;

import lombok.Data;

@Data
public class FindMaxLengthOfSubArrayHavingGivenSum {
	private Integer[] numArray;

	public FindMaxLengthOfSubArrayHavingGivenSum(Integer size) {
		numArray = new Integer[size];
	}

	/**
	 * This method is used for get max length of sub-array which each element sum is equals to given number 
	 * @param number
	 * @return
	 */
	public Integer maxLengthOfSubArray(Integer number) {
		// HashMap to store (sum, index) tuples
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer sum = 0;
		Integer maxLength = 0;

		// traverse the given array
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] != null) {
				// get sum
				sum += numArray[i];

				// check sum is equals to number then initialize index+1 is length of sub-array
				if (sum == number)
					maxLength = i + 1;

				// each iteration sum is store in map as key and value is index
				if (!map.containsKey(sum)) {
					map.put(sum, i);
				}

				// check if sum-number is present in map or not
				if (map.containsKey(sum - number)) {

					// update maxLength if maxLength < i - map.get(sum - number)
					if (maxLength < (i - map.get(sum - number)))
						maxLength = i - map.get(sum - number);
				}
			}// end of null check if block

		} // end of for-loop
		// return maxLength
		return maxLength;
	}// end of maxLengthOfSubArray(-)
}
