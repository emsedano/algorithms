package com.algorithms.search;

import com.algorithms.Problem;

public class BinarySearch extends ASearchMachine {

	
	public BinarySearch(Problem problem, Comparable key) {
		super(problem, key);
	}

	@Override
	public int search(Comparable key, Comparable[] input) {
		
		printIntput(input);
		
		// Array must be sorted.
		int lo = 0;
		int hi = input.length - 1;
		 
		while (lo <= hi){ // Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (less(key,input[mid])) 
				hi = mid - 1;
			else if (less(input[mid], key) )
				lo = mid + 1;
			else 
				return mid;
		}
		return -1;

	}
	
	
	public static Comparable find(Comparable key, Comparable[] input)
	 { 
		printIntput(input);
		
		if(input.length > 1){
			
			int mid = input.length/2;
			
			if(input[mid] == key)
				return mid;
			else if(less(key, input[mid])){
				return find(key, split(input, mid));
			}else{
				return find(key, split(input, mid, input.length +1));
			}
			
		}else {
			return input[0];
		}
		
	 } 

	
	public void printOutput(){
		printOutput(problem, key);
	}
	
	
	
	public static void main(String[] args) {
		
		BinarySearch binarySearch = new BinarySearch(Problem.sortedProblem, 51);
		binarySearch.search();
		BinarySearch.find(95, Problem.sortedProblem.getInput());
	}
}
