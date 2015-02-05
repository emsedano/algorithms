package com.algorithms;

public class Problem {

	private Comparable[] input;
	private Comparable[] output;
	
	public static final Problem sortedProblem = new Problem (new Comparable[] { 1,11,15,18,24,31,48,51,62,65,76,81,88,95,99 } );
	public static final Problem unsortedProblem  = new Problem (new Comparable[] { 45,78,12,89,56,25,63,20,2,99,41,55,49,72,88,15 } );
	
	public Problem(Comparable[] input){
		this.input = input;
		this.output = new Comparable[input.length];
	}
	
	public Comparable[] getInput() {
		return input;
	}
	public void setInput(Comparable[] input) {
		this.input = input;
	}
	public Comparable[] getOutput() {
		return output;
	}
	public void setOutput(Comparable[] output) {
		this.output = output;
	}
	
	
}
