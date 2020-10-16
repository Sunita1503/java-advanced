package com.sunita.assignments.advanced.collection;

import java.util.List;

//this java program calls the methods from ArrayListExample
public class TestArrayListExample {

	public static void main(String[] args) {
		ArrayListExample objArrayListExample = new ArrayListExample();

		// create and print ArrayList
		List<String> objList = objArrayListExample.createAndPrintArrayList();

		// sort the list
		objArrayListExample.verifySortedList(objList);

		// remove ArrayList element
		objArrayListExample.removeArrayListElement("Pune");

		// check is ArrayList is empty
		objArrayListExample.verifyListIsEmptyorNot();

	}

}
