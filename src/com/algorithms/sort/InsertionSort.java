package com.algorithms.sort;

public class InsertionSort implements Sorter{

	@Override  
	public String sortType()
	{
		return "Insertion Sort";
	}

	@Override  
	public int[] sort(int inputArray[], int length){
		int[] sortedArray = inputArray;
		for (int i = 1; i < length; i++){
			int j = i;
			int b = sortedArray[i];
			while ((j > 0) && (sortedArray[j-1] > b)){
				sortedArray[j] = sortedArray[j-1];
				j--;
			}
			sortedArray[j] = b;
		}
		return sortedArray;
	}	

}
