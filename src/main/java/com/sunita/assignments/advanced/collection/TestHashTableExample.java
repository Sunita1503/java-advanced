package com.sunita.assignments.advanced.collection;

import java.util.Hashtable;

//This Java program call methods from HashTableExample
public class TestHashTableExample {

	public static void main(String[] args) {

		// create object of HAshTable
		Hashtable<String, String> objHashTable = null;
		
		//create object of HashTableExample
		HashTableExample objHashTableExample = new HashTableExample();

		// create and print entry values
		objHashTable = objHashTableExample.createAndPrintHashTableElements();

		// Remove entry
		objHashTableExample.removeHashTableElement();

		// verify If Entry Absent using putIfAbsent
		objHashTableExample.verifyIfEntryAbsent();

		// verify if Entry Exists using getOrDefault
		objHashTableExample.verifyIfEntryExists();
	}

}
