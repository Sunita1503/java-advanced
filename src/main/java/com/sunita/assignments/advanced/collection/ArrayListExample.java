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

		// print list
		System.out.println("ArrayList elements are : " + list);

	/*	for (int i = 0; i < list.size(); i++) 
			System.out.println("ArrayList elements " + list.get(i));*/
		
		return list;
	}

	// sorted list
	public List<String> verifySortedList(List<String> list) {

		
		Collections.sort(list);
		System.out.println("Sorted List : " + list);
		return list;
	}

	// remove ArrayList Element
	public void removeArrayListElement(String str) {
		System.out.println("Original List before removing Pune :" + list);
		list.remove(str);
		System.out.println("Updated list  after removing Arralist element \"Pune\" : " + list);
	}

	// check if ArrayList is Empty

	public void verifyListIsEmptyorNot() {
		System.out.println("Check if ArrayList is Empty  : " + list.isEmpty());
	}

	/*public static void main(String[] args) {

		ArrayListExample objArrayListExample = new ArrayListExample();

		// create and print ArrayList
		List<String> objList = objArrayListExample.createAndPrintArrayList();

		// sort the list
		objArrayListExample.verifySortedList(objList);

		// remove ArrayList element
		objArrayListExample.removeArrayListElement("Pune");

		// check is ArrayList is empty
		objArrayListExample.verifyListIsEmptyorNot();
	}*/

}
