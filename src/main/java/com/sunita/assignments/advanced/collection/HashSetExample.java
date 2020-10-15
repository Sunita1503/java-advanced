package com.sunita.assignments.advanced.collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("India");
		set.add("Russia");
		set.add("USA");
		set.add("UK");
		set.add("Brazil");

		System.out.println("Display set values " + set);

		// add new values
		set.add("Spain");
		set.add("Peru");
		System.out.println("Updated set values " + set);

		// remove Spain from set
		set.remove("Spain");
		System.out.println("New set values after removing Spain " + set);

	}

}
