package com.tyss.array;

import lombok.Data;

@Data
public class RemoveDuplicatesFromArray {
	private Integer[] numArray;

	public RemoveDuplicatesFromArray(Integer size) {
		numArray = new Integer[size];
	}
	
	/**
	 * This method is used for remove duplicates from given array
	 */
	public void removeDuplicatesFromGivenArray() {
		Integer[] tempArray = new Integer[numArray.length];
		Integer j = 0;
		for (int i = 0; i < numArray.length; i++) {
			if( (i+1) < numArray.length && (!numArray[i].equals(numArray[i+1]))) {
		        tempArray[j] = numArray[i];		
		        ++j;
			}
		}
		// store last element to temporary array
		tempArray[j] = numArray[numArray.length-1];
		
		// modify numAraay
		for (int i = 0; i < tempArray.length; i++) {
			if(tempArray[i] != null){
				numArray[i] = tempArray[i];
			}else {
				numArray[i] = null;
			}
		}
	}
}
