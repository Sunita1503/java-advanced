package com.sunita.assignments.advanced.collection;

import java.util.Hashtable;
import java.util.Map;

//Java program to demonstrate HashTable
public class HashTableExample {

	public static void main(String[] args) {

		Hashtable<Integer, String> empData = new Hashtable<Integer, String>();

		// add values
		empData.put(101, "Ravi");
		empData.put(102, "Vyas");
		empData.put(103, "Arpita");
		empData.put(104, "Shirley");
		empData.put(105, "Allen");

		// display map values
		for (Map.Entry mapValue : empData.entrySet()) {
			System.out.println(mapValue.getKey() + " " + mapValue.getValue());
		}
		// display map values
		System.out.println("Original Employee data " + empData);

		// Remove entry 104
		empData.remove(104);

		// display map values
		System.out.println("New Employee data " + empData);

		// use of getorDefault
		System.out.println(empData.getOrDefault(104, "Emp Not found"));
		System.out.println(empData.getOrDefault(102, "Emp not found"));

		// putIfAbsent
		System.out.println(empData.putIfAbsent(104, "Ruben"));
		System.out.println("Updated emp data " + empData);
	}

}
