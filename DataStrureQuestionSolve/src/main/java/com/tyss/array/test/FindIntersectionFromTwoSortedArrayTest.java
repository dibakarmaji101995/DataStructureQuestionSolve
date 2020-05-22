package com.tyss.array.test;

import java.util.Arrays;
import java.util.Scanner;

import com.tyss.array.FindIntersectionOfTwoSortedArray;

import lombok.extern.java.Log;

@Log
public class FindIntersectionFromTwoSortedArrayTest {
	public static void main(String[] args) {
		// create Scanner class object
		Scanner sc = new Scanner(System.in);
		// create FindMissingNumberFromArray class object
		FindIntersectionOfTwoSortedArray findIntersectionOfTwoSortedArray = new FindIntersectionOfTwoSortedArray(5);
		// get arrays
		Integer[] numArray = findIntersectionOfTwoSortedArray.getNumArray();
		Integer[] numArray2 = findIntersectionOfTwoSortedArray.getNumArray2();
		// insert element to arrays
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		numArray[4] = 50;
		
		numArray2[0] = 20;
		numArray2[1] = 50;
		numArray2[2] = 70;
		numArray2[3] = 80;
		numArray2[4] = 90;
		
		// get intersection of two sorted arrays
		Integer[] intersectionArray = findIntersectionOfTwoSortedArray.findIntersectionOfTwoArray();
		log.info("Intersection of two arrays are "+Arrays.asList(intersectionArray).toString());
		
		// close sc
		sc.close();

	}
}
