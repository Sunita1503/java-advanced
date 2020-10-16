package com.sunita.assignments.advanced.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Java program to demonstrate ArrayList
public class ArrayListExample {

	// declare ArrayList variable
	public ArrayList<String> list;

	// constructor
	ArrayListExample() {
		list = new ArrayList<String>();
	}

	public List<String> createAndPrintArrayList() {

		// Add new items to list
		list.add("Mumbai");
		list.add("Pune");
		list.add("Delhi");
		list.add("Banglore");
		list.add("Surat");

		// print list
		System.out.println("ArrayList : " + list);

		/*
		 * for (int i = 0; i < list.size(); i++) System.out.println(
		 * "ArrayList elements " + list.get(i));
		 */
		System.out.println();
		return list;
	}

	// sorted list
	public List<String> verifySortedList(List<String> list) {

		Collections.sort(list);
		System.out.println("Sorted List : " + list);
		System.out.println();
		return list;

	}

	// remove ArrayList Element
	public void removeArrayListElement(String str) {
		System.out.println("Original List before removing \"Pune\" :" + list);
		list.remove(str);
		System.out.println("Updated list after removing \"Pune\"   :" + list);
		System.out.println();
	}

	// check if ArrayList is Empty

	public void verifyListIsEmptyorNot() {
		System.out.println("Check if ArrayList is Empty : " + list.isEmpty());
		System.out.println();
	}

}
