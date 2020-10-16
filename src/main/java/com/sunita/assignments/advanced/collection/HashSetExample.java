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

	public void removeSetElement() {
		set.remove("UK");
		System.out.println("Updated set elements : " + set);
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * // add new values set.add("Spain"); set.add("Peru"); System.out.println(
	 * "Updated set values " + set);
	 * 
	 * // remove Spain from set set.remove("Spain"); System.out.println(
	 * "New set values after removing Spain " + set);
	 * 
	 * }
	 */

}
