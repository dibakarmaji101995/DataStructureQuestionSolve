package com.tyss.array;

import lombok.Data;

@Data
public class FindMissingNumberFromArray {
    private Integer[] numArray;
   
	public FindMissingNumberFromArray(Integer size) {
		numArray = new Integer[size];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i+1;
		}
	}

    /**
     * This method is used for find missing number
     * @return
     */
	public Integer findMissingNumber() {
		Integer missingNumber = null;
		for (int i = 0; i < numArray.length; i++) {
			Integer checkNumber = i+1;
			if(!checkNumber.equals(numArray[i])) {
				missingNumber = checkNumber;
				break;
			}
		}
		return missingNumber;
	}
}
