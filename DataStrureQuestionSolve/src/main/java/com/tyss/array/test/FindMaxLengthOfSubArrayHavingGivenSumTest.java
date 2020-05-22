package com.tyss.array.test;

import java.util.Scanner;

import com.tyss.array.FindArrayElementPairWhoseSumIsEqualsToGivenNumber;
import com.tyss.array.FindMaxLengthOfSubArrayHavingGivenSum;

import lombok.extern.java.Log;

@Log
public class FindMaxLengthOfSubArrayHavingGivenSumTest {
	public static void main(String[] args) {
		// create Scanner class object
		Scanner sc = new Scanner(System.in);
		// create FindMissingNumberFromArray class object
		FindMaxLengthOfSubArrayHavingGivenSum FindMaxLengthOfSubArrayHavingGivenSum = new FindMaxLengthOfSubArrayHavingGivenSum(
				20);
		// get array
		Integer[] numArray = FindMaxLengthOfSubArrayHavingGivenSum.getNumArray();
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 10;
		numArray[3] = 5;
		numArray[4] = 5;
		numArray[5] = 5;
		numArray[6] = 5;

		// take number
		log.info("Enter Any Number ::");
		Integer number = sc.nextInt();

		// get pairs whose sum equals to given number
		Integer length = FindMaxLengthOfSubArrayHavingGivenSum.maxLengthOfSubArray(number);
		log.info("Longest Sub-Array Length is "+length );
	}
}
