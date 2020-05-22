package com.tyss.array.test;

import java.util.Scanner;

import com.tyss.array.FindArrayElementPairWhoseSumIsEqualsToGivenNumber;
import com.tyss.array.FindSmallestAndLargestNumberFromArray;

import lombok.extern.java.Log;

@Log
public class FindArrayElementPairWhoseSumIsEqualsToGivenNumberTest {
	public static void main(String[] args) {
		// create Scanner class object
		Scanner sc = new Scanner(System.in);
		// create FindMissingNumberFromArray class object
		FindArrayElementPairWhoseSumIsEqualsToGivenNumber findArrayElementPairWhoseSumIsEqualsToGivenNumber = new FindArrayElementPairWhoseSumIsEqualsToGivenNumber(
				20);
		// get array
		Integer[] numArray = findArrayElementPairWhoseSumIsEqualsToGivenNumber.getNumArray();
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		numArray[4] = 50;
		numArray[5] = 60;

		// take number
		log.info("Enter Any Number ::");
		Integer number = sc.nextInt();

		// get pairs whose sum equals to given number
		findArrayElementPairWhoseSumIsEqualsToGivenNumber.getElementsPair(number);
	}
}
