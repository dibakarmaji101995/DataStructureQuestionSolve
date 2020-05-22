package com.tyss.array;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class FindArrayElementPairWhoseSumIsEqualsToGivenNumber {
	private Integer[] numArray;

	public FindArrayElementPairWhoseSumIsEqualsToGivenNumber(Integer size) {
		numArray = new Integer[size];
	}

	public void getElementsPair(Integer number) {
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray.length; j++) {
				if (numArray[i] != null && numArray[j] != null) {
					Integer sum = numArray[i] + numArray[j];
					if (sum != null && sum.equals(number)) {
						log.info(" {" + numArray[i] + "," + numArray[j] + "}");
					}
				}
			}
		}
	}
}
