package com.sunita.assignments.advanced.collection;

import java.util.HashSet;

//This java program calls the methods from HashSetExample
public class TestHashSetExample {

	// public static String testData="";

	public static void verifyData(HashSet<String> objHashSet) {

		// open URL
		System.out.println("Open Match URL  " + objHashSet);

		if (objHashSet.contains("USA"))
			System.out.println("USA participated");
		else
			System.out.println("USA not participated");

	}

	public static void main(String[] args) {

		// create object of HashSet
		HashSet<String> objHashSet = null;

		// create object of HashSetExample
		HashSetExample objHashSetExample = new HashSetExample();

		// create and Print HashSet
		HashSet<String> hashSet = objHashSetExample.createAndPrintHashSet();

		// remove Set element
		objHashSetExample.removeSetElement();

		// call verifyData
		verifyData(hashSet);
	}

}
