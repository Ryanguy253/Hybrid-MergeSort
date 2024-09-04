package com.ryan;

import java.util.Random;

public class Tools {
	public static boolean isAscending(int array[]) {
		for(int i=0;i<array.length -1 ;i++) {
			if(i>i+1) {
				return false;
			}
		}	
		return true;
	}
	
	public static int[] GenerateRandomArray(int size, int max_number) {
		 // create instance of Random class
	    Random rand = new Random();
		
		int randArray[] = new int[size];
		
		for(int i=0;i<size;i++) {
			randArray[i] = rand.nextInt(max_number);	
		}
		
		return randArray;
	}
	
	public static int[] GenerateRandomArray(int size, int max_number, int min_number) {
		 // create instance of Random class
	    Random rand = new Random();
		
		int randArray[] = new int[size];
		
		for(int i=0;i<=max_number;i++) {
			randArray[i] = rand.nextInt(max_number - min_number) + min_number;	
		}
		
		return randArray;
	}
}
