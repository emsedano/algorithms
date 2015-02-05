package com.algorithms.sort;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import com.algorithms.Problem;
import com.algorithms.sort.ASortMachine;

public class MergeSort extends ASortMachine {

	static Comparable[] aux;
	
	public MergeSort(Problem problem) {
		super(problem);
	}

	@Override
	public Comparable[] sort(Comparable[] input) {
		// TODO Auto-generated method stub
		aux = new Comparable[ input.length ];
		System.out.println(Arrays.toString(input) );
		sort(input, 0, input.length);
		
		return input;
	}
	
	public static void sort(Comparable[] a, int lo, int hi){
		
		if(hi <= lo) 
			return;
		
		int mid = lo + (hi - lo)/2;
		
		printProblem(a, lo, mid);
		
		sort(a, lo, mid);
		
		printProblem(a, mid+1, hi);
		sort(a, mid+1, hi);
		
		merge(a, lo, mid, hi);
		System.out.println();
		
	}
	
	
	
	public static void merge(Comparable[]a, int lo, int mid, int hi){
		
		int i = lo, j = mid + 1;
		
		for(int k = lo; k <= hi; k++){
			aux[k] = a[k];
		}
		
		for(int k = lo; k <= hi; k++){
			if(i > mid)
				a[k] = aux[j++];
			else if(j > hi)
				a[k] = aux[i++];
			else if(less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
		System.out.print("\nMerged =>");
		System.out.println(Arrays.toString(a));
	}
	


	public static void main(String[]args){
		MergeSort mergeSort = new MergeSort(Problem.unsortedProblem);
		mergeSort.sort();
	}
	
}
