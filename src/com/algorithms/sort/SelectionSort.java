package com.algorithms.sort;

import com.algorithms.Problem;

public class SelectionSort extends ASortMachine {

	public SelectionSort(Problem problem) {
		super(problem);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Comparable[] sort(Comparable[] input) {
		// TODO Auto-generated method stub
		System.out.println("INITIAL STAGE => ");
		plot();
		
		int minimum;
		for (int i = 0; i < input.length; i++ ){
			
			minimum = i;
			
			System.out.println("\nIteration =>" + (i+1));
			System.out.println("Minimum is => " + minimum + " , value => " + input[minimum]);
			
			for (int j = i+1; j < input.length; j++){
				
				if ( less(input[j], input[minimum]) ){
					minimum = j;
				}
			}
			
			exch(input, i, minimum);
			System.out.println("Exch performed: " + input[minimum] + " <=> " + input[i]);
			plot();
		}
		
		return input;
	}



	public static void main(String[]args){
		SelectionSort selectionSort = new SelectionSort(Problem.unsortedProblem);
		selectionSort.sort();
	}
}
