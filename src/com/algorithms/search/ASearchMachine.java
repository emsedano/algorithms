package com.algorithms.search;

import com.algorithms.Problem;
import com.algorithms.ProblemSolver;

public abstract class ASearchMachine extends ProblemSolver{

	protected Comparable key;
	
	public ASearchMachine(Problem problem, Comparable key) {
		super(problem);
		this.key = key;
	}


	public Problem search(){
		
		Problem problem = getProblem();
		Comparable[] input = problem.getInput();
		problem.setOutput( new Comparable[]{search(key, input) });
		printOutput();
		return problem;
		
	};
	
	public abstract int search(Comparable key, Comparable[] input);
	
	public abstract void printOutput();
	
	public Comparable getKey() {
		return key;
	}


	public void setKey(Comparable key) {
		this.key = key;
	}
	
	
	public static Comparable[] split(Comparable[]input, int a){
		return split(input, 0, a+1);
	}
	
	
	public static Comparable[] split(Comparable[]input, int a, int b){
		Comparable[] s1 = new Comparable[input.length - (b - a - 1)];
		int index = 0;
		for(int i = a; i < b; i++){
			s1[index] = input[i];
			index++;
			if(index == s1.length)
				break;
		}
		
		return s1;
	}
	
	
	public static void printOutput(Problem problem, Comparable key){
		StringBuffer sb = new StringBuffer("output[");
		for(int i = 0; i<problem.getOutput().length; i++){
			sb.append(problem.getOutput()[i]).append("");
		}
		sb.append("] => ").append(key);
		System.out.println(sb.toString());
	}
	
}
