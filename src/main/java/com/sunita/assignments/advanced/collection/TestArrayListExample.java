package com.sunita.assignments.advanced.collection;

import java.util.List;

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
