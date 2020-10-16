package com.sunita.assignments.advanced.collection;

import java.util.HashSet;

//java program to demonstrate HashSet

public class HashSetExample {

	HashSet<String> set;

	// constructor
	public HashSetExample() {

		set = new HashSet<String>();
	}

	public HashSet<String> createAndPrintHashSet() {

		set.add("India");
		set.add("Russia");
		set.add("USA");
		set.add("UK");
		set.add("Brazil");

		System.out.println("Display set values " + set);
		return set;
	}

	//Remove set element
	public void removeSetElement() {
		
		System.out.println("Remove set Elemnt UK");
		set.remove("UK");
		System.out.println("Updated set elements : " + set);
	}

}
