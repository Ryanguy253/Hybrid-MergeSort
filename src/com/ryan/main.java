package com.ryan;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables
		int size = 8;
		int max_number = 100;
		int min_number = 1;
		int S = 3;
		
		int left = 0;
		int right = size -1;
		Comparisons comparisons = new Comparisons();
		
		//Generate test array
		int test[] = Tools.GenerateRandomArray(size, max_number);
		System.out.println(Arrays.toString(test));
		
		//Test insertion sort
		//SortingAlgorithms.insertionSort(test,left,right,comparisons);
		//System.out.println(Arrays.toString(test));
		
		//Hybrid Sort
		SortingAlgorithms.hybridMergeSort(test,left,right,S,comparisons);
		System.out.println(Arrays.toString(test));
		
		
		// Test if array is sorted
		if(Tools.isAscending(test)) {
			System.out.println("Array is sorted. Number of comparisons is "+ comparisons.count);
		}
		else {
			System.out.println("Unsorted Array");
		}
		
	}

}
