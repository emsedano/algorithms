package com.data.structures;

import com.algorithms.search.ASearchMachine;
import com.algorithms.sort.ASortMachine;


public class HashMap<K,V> extends java.util.HashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ASortMachine sortMachine;
	ASearchMachine searchMachine;
	
	
	public ASortMachine getSortMachine() {
		return sortMachine;
	}
	public void setSortMachine(ASortMachine sortMachine) {
		this.sortMachine = sortMachine;
	}
	public ASearchMachine getSearchMachine() {
		return searchMachine;
	}
	public void setSearchMachine(ASearchMachine searchMachine) {
		this.searchMachine = searchMachine;
	}

	
	
}
