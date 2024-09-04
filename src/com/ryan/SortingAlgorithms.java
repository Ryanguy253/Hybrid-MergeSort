package com.ryan;

import java.util.Arrays;

class Comparisons {
    int count = 0;
}

public class SortingAlgorithms {

	public static void hybridMergeSort(int slot[],int l,int r, int S,Comparisons comparisons) {
		
		int mid = (l+r)/2;
		if(r-l<=0) {
			return;
		}
		
		// length of array is smaller than S, call insertionSort
		if(r-l+1 < S) {
			System.out.println("Insertion Sort Called");
			SortingAlgorithms.insertionSort(slot,l,r,comparisons);
			// in place sorting
			return;
		}
		else {
			// else we merge
			hybridMergeSort(slot,l,mid,S,comparisons);
			hybridMergeSort(slot,mid+1,r,S,comparisons);
			
			merge(slot,l,mid,r,comparisons);	
		}	
	
	}
	
	public static void merge(int slot[],int l, int m, int r,Comparisons comparisons) {
		// Merges two subarrays of arr[].
	    // First subarray is arr[l..m]
	    // Second subarray is arr[m+1..r]
		
		// Find length of 2 subarrays to be merged
		//size of left
		int size1 = m-l+1;
		
		//size of right
		int size2 = r-m;
		
		// Create auxillary arrays
		int L[] = new int[size1];
		int R[] = new int[size2];

		for(int i = 0;i<size1;i++) {
			L[i] = slot[l + i];
		}
		
		for(int i = 0;i<size2;i++) {
			R[i] = slot[m + 1 + i];
		}
		
		// compare head to head ; toe to toe
		// indexes of the subarray
		//left
		int i =0;
		
		//right
		int j =0;
		
		//index of original array
		int k =l;
		
		while(i<size1&&j<size2) {
			
			//since we know that the L and R arrays are sorted aldy,
			if(R[j]>=L[i]) {
				comparisons.count++;
				slot[k] = L[i];
				i++;
			}
			else {
				comparisons.count++;
				slot[k] = R[j];
				j++;
			}
			
			k++;
			
		}
		
		// add the remaining array elements into the original array (sorted)
		
		while(i<size1) {
			slot[k]=L[i];
			i++;
			k++;
		}
		
		while(j<size1) {
			slot[k]=R[j];
			j++;
			k++;
		}
	}	
	
	public static void insertionSort(int slot [],int l, int r,Comparisons comparisons) {
		/* n - length of the array
		 * array[] - the array to be sorted
		 * l - left index
		 * r -right index
		 * 
		 * This Insertion sort algorithm sorts the array in place - does not create new array
		 * swap is implemented later
		 * */
		
		for(int i=l;i<=r;i++) {
			for(int j=i;j>0;j--) {
				if(slot[j]<slot[j-1]) {
					comparisons.count++;
					SortingAlgorithms.swap(slot,j,j-1);
				}
				else break;
			}
		}

	}
	
	public static void swap(int slot[],int i,int j){
		int temp = slot[i] ;
		slot[i] = slot [j]; 
		slot[j] = temp;
	}
		
}
