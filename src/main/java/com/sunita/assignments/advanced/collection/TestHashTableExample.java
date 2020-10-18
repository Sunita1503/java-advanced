package com.sunita.assignments.advanced.collection;

import java.util.Hashtable;

//This Java program call methods from HashTableExample
public class TestHashTableExample {

	// declare variable testData
	public static String testData = "";

	public static void doLogin(Hashtable<String, String> objHashTable) {

		// Step 1. Open URL
		System.out.println("Open URL");

		// Step 2. Enter your UserName
		testData = objHashTable.get("UserName");
		if (!testData.equals("")) // check if not null
			System.out.println("Enter USerName : " + objHashTable.get("UserName"));

		// Enter password
		testData = objHashTable.get("Password");
		if (!testData.equals(""))
			System.out.println("Enter Password : " + objHashTable.get("Password"));

		// Check for optional Field
		testData = objHashTable.get("OptionalField");
		if (!testData.equals(""))
			System.out.println("Check for optional Field : " + objHashTable.get("OptionalField"));

		// click on sign in button
		System.out.println("Click on Sign in Button");

	}

	public static void main(String[] args) {

		// create object of HAshTable
		Hashtable<String, String> objHashTable = null;

		// create object of HashTableExample
		HashTableExample objHashTableExample = new HashTableExample();

		// create and print entry values
		objHashTable = objHashTableExample.createAndPrintHashTableElements();

		// Remove entry
		objHashTableExample.removeHashTableElement();

		// verify If Entry Absent using putIfAbsent
		objHashTableExample.verifyIfEntryAbsent();

		// verify if Entry Exists using getOrDefault
		objHashTableExample.verifyIfEntryExists();

		System.out.println("Login with UserName and Password to URL ----------");
		// call doLogin method
		doLogin(objHashTable);

	}

}
