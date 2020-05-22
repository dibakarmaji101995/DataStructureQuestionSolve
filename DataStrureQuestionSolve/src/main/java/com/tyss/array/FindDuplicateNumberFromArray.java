package com.tyss.array;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class FindDuplicateNumberFromArray {
	private Integer[] numArray;

	public FindDuplicateNumberFromArray(Integer size) {
		numArray = new Integer[size];
	}
	
	public void findDuplicateNumber() {
		log.info("Duplicate Numbers ::");
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i+1; j < numArray.length; j++) {
				if ((numArray[i] != null && numArray[j] != null) && numArray[i].equals(numArray[j])) {
					log.info(" "+numArray[i]);
					break;
				}
			}
		}
	}

}
