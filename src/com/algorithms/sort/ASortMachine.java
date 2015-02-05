package com.algorithms.sort;

import com.algorithms.Problem;
import com.algorithms.ProblemSolver;

public abstract class ASortMachine extends ProblemSolver  {
	
	
	public ASortMachine(Problem problem) {
		super(problem);
	}

	public Problem sort(){
		this.problem.setOutput(sort(this.problem.getInput()));
		return this.problem;
	}
	
	public abstract Comparable[] sort(Comparable[] input);
	
	
	
	public static void exch(Comparable[] a, int i, int j)
	{
		Comparable t = a[i]; a[i] = a[j]; a[j] = t;
	}
	
	public static void printProblem(Comparable[] a, int lo, int hi){
		
		StringBuffer sb = new StringBuffer("[");
		
		for(int i = lo; i< hi; i++){
			sb.append(a[i]).append(", ");
		}
		
		sb.append("] ");
		System.out.print(sb.toString());
		
	}
	
	
	
	
	
}
