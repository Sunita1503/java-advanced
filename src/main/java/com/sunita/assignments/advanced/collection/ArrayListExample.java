package com.sunita.assignments.advanced.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import javafx.print.Collation;

//Java program to demonstrate ArrayList
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Delhi");
		list.add("Banglore");
		System.out.println(list);

		// iterate elements
		/*
		 * Iterator itr = list.iterator(); while(itr.hasNext()){
		 * System.out.println(itr.next()); }
		 */

		System.out.println("Second element " + list.get(1));

		// sort the list
		System.out.println("Sorted list");
		Collections.sort(list);
		/*
		 * for(String city:list){ System.out.println(city); }
		 */
		System.out.println(list);

		// remove Delhi from list
		list.remove("Delhi");
		System.out.println("New list after removing Delhi");

		System.out.println(list);

		// check if list is empty
		System.out.println("Check if ArrayList is Empty :" + list.isEmpty());

	}

}
