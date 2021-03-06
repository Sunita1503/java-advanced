package com.sunita.assignments.advanced.collection;

import java.util.Hashtable;
import java.util.Map;

//Java program to demonstrate HashTable
public class HashTableExample {

	// declare HashTable variable
	Hashtable<String, String> empData;

	// constructor
	public HashTableExample() {

		empData = new Hashtable<String, String>();

	}

	public Hashtable<String, String> createAndPrintHashTableElements() {

		// add key , values
		empData.put("UserName", "Ravi36536");
		empData.put("Password", "Vyas12434");
		empData.put("OptionalField", "Arpita");
		empData.put("SecurityQuestion", "What is your birthyear?");
		empData.put("SecurityAnswer", "2005");
		empData.put("Captcha", "AAAA");
		empData.put("104", "KOP");
		empData.put("106", "Pune ");
		empData.put("102", "Mumbai");

		// display map values
		for (Map.Entry mapValue : empData.entrySet()) {
			System.out.println(mapValue.getKey() + " " + mapValue.getValue());
		}

		System.out.println();
		return empData;
	}

	public void removeHashTableElement() {
		// display map values
		System.out.println("Original Employee data with entry 104   : " + empData);
		// Remove entry 104
		empData.remove(104);
		System.out.println("Updated Employee data without entry 104 : " + empData);
		System.out.println();
	}

	// verify if Entry exists using getOrDefault
	// if entry exists then display value
	// if entry does not exists then display default value
	public void verifyIfEntryExists() {

		System.out.println("Check if entries 104 and 102 present ");
		System.out.println("Emp Data : " + empData);
		System.out.println(empData.getOrDefault(106, "Employee 106 Not found"));
		System.out.println(empData.getOrDefault(102, "Employee 102 not found"));
		System.out.println();
	}

	// Verify if Entry absent then set value
	public void verifyIfEntryAbsent() {
		// putIfAbsent
		System.out.println("Set  value for missing entry 104");

		System.out.println("Original Emp Data : " + empData);

		empData.putIfAbsent("104", "Ruben");
		System.out.println("Updated emp data :" + empData);

		System.out.println();
	}

}
