package com.sunita.assignments.advanced.collection.FaceBookSignUP;

import java.util.Hashtable;
import java.util.Random;

//Java program to demonstrate Face Book Sign UP page using HashTable
public class FacebookSignupClass {

	// declare variable
	Hashtable<String, String> userData;

	public static String strMobile = "";

	// constructor
	public FacebookSignupClass() {

		userData = new Hashtable<String, String>();
	}

	public Hashtable<String, String> createFaceBookSignUpData() {

		// create userName
		userData.put("FirstName", "Sunita");
		userData.put("SurName", "Shinde");

		// generate random mobile number
		strMobile = generateMobileNo();
		System.out.println("Random mobile no. " + strMobile);

		userData.put("MobileNo", strMobile);
		userData.put("New Password", "abcd4567");
		userData.put("Date of Birth", "23/6/1999");

		System.out.println(" HashTable values : " + userData);
		return userData;

	}

	// Generate random mobile No.
	public static String generateMobileNo() {

		long mobileNo = (long) Math.floor(Math.random() * 4000000000L);

		// convert long value to string
		strMobile = String.valueOf(mobileNo);

		return strMobile;

	}

}
