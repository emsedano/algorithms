package com.data.structures;

import com.algorithms.exceptions.NoSearchMachineException;
import com.algorithms.exceptions.NoSortMachineException;
import com.algorithms.search.ASearchMachine;
import com.algorithms.sort.ASortMachine;

public class ArrayList<T> extends java.util.ArrayList<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ASortMachine sortMachine;
	private ASearchMachine searchMachine;
	
	public ArrayList(){
		super();
	}
	
	public void addSortMachine(ASortMachine sortMachine) {
		this.sortMachine = sortMachine;
	}
	
	public void sort() throws NoSortMachineException{
		if(sortMachine != null)
			this.sortMachine.sort();
		else throw new NoSortMachineException();
	}
	
	public void search() throws NoSearchMachineException{
		if(searchMachine != null)
			searchMachine.search();
		else
			throw new NoSearchMachineException();
	}
	
	public void addSearchMachine(ASearchMachine searchMachine) {
		this.searchMachine = searchMachine;		
	}
	
	public Comparable[] toComparableArray(){
		Comparable[] comparableArr = new Comparable[this.size()];
		int i=0;
		for(T item: this){
			comparableArr[i] = (Comparable) item;
			i++;
		}
		
		return comparableArr;
	}
	
	
	
}
