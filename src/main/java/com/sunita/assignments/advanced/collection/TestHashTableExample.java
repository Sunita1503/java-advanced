package com.sunita.assignments.advanced.collection;

//This Java program call methods from HashTableExample
public class TestHashTableExample {

	public static void main(String[] args) {

		// create object
		HashTableExample objHashTableExample = new HashTableExample();

		// create and print entry values
		objHashTableExample.createAndPrintHashTableElements();

		// Remove entry
		objHashTableExample.removeHashTableElement();

		// verify If Entry Absent using putIfAbsent
		objHashTableExample.verifyIfEntryAbsent();

		// verify if Entry Exists using getOrDefault
		objHashTableExample.verifyIfEntryExists();
	}

}
