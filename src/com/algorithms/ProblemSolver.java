package com.algorithms;

public abstract class ProblemSolver {
	
	protected Problem problem;

	public ProblemSolver(Problem problem) {
		super();
		this.problem = problem;
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	
	public static void printIntput( Comparable[]input ){
		
		StringBuffer sb = new StringBuffer("[");
		
		for( int i=0; i < input.length; i++) {
			sb.append(input[i]);
			if (i < input.length - 1 ){
				sb.append(", ");
			}
		}
		sb.append("]\n");
		System.out.println(sb.toString());
	}
	
	
	protected static boolean less(Comparable<Comparable> a, Comparable<Comparable> b)
	{
		return a.compareTo(b) < 0;
	}
	
	public void plot(){
		for(Comparable item : getProblem().getInput()){
			System.out.print(item +  "	=>  ");
			for(int i = 0; i < (Integer)item; i++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	
}
