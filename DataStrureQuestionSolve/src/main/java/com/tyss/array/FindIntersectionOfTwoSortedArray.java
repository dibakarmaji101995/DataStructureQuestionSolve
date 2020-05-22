package com.tyss.array;

import lombok.Data;

@Data
public class FindIntersectionOfTwoSortedArray {
	private Integer[] numArray;
	private Integer[] numArray2;

	public FindIntersectionOfTwoSortedArray(Integer size) {
		numArray = new Integer[size];
		numArray2 = new Integer[size];
	}
	
	/**
	 * This method is used for find intersection between two sorted array
	 * @return
	 */
	public Integer[] findIntersectionOfTwoArray() {
		Integer[] intersectionArray = new Integer[numArray.length];
		Integer k = 0;
		// intersection find logic
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray.length; j++) {
				if(numArray[i].equals(numArray2[j])) {
					intersectionArray[k] = numArray[i];
					++k;
				}
			}
		}
		//return intersection array
	    return	intersectionArray;
	}
}
