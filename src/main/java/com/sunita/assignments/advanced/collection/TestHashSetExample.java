package com.sunita.assignments.advanced.collection;

import java.util.HashSet;

//This java program calls the methods from HashSetExample
public class TestHashSetExample {

	public static void main(String[] args) {

		// create object of HashSet
		HashSet<String> objHashSet = null;
		
		//create object of HashSetExample
		HashSetExample objHashSetExample = new HashSetExample();

		// create and Print HashSet
		HashSet<String> hashSet = objHashSetExample.createAndPrintHashSet();

		// remove Set element
		objHashSetExample.removeSetElement();
	}

}
