package com.sunita.assignments.advanced.collection.FaceBookSignUP;

import java.util.Hashtable;

//Test class for FaceBookSignUp
public class TestFaceBookSignUpClass {

	public static String testData = "";

	public static void doFaceBookSignUp(Hashtable<String, String> objHashtable) {

		// Open Facebook SignUp URL
		System.out.println("Facebook SignUp Page displayed ");

		// Enter User First Name
		testData = objHashtable.get("FirstName");
		if (!testData.equals("")) // check FirstName is not empty
			System.out.println("Enter First Name : " + objHashtable.get("FirstName"));
		// Enter USer SurName
		testData = objHashtable.get("SurName");
		if (!testData.equals(""))
			System.out.println("Enter SurName : " + objHashtable.get("SurName"));

		// Enter User Mobile No
		testData = objHashtable.get("MobileNo");
		if (!testData.equals(""))
			System.out.println("Enter Mobile No : " + objHashtable.get("MobileNo"));

		// Enter User New Password
		testData = objHashtable.get("New Password");
		if (!testData.equals(""))
			System.out.println("Enter New Passowrd : " + objHashtable.get("New Password"));

		// Enter USer Date of Birth
		testData = objHashtable.get("Date of Birth");
		if (!testData.equals(""))
			System.out.println("Enter Date of Birth : " + objHashtable.get("Date of Birth"));

		// Click on Sign Up Button
		System.out.println("Click on Sign Up Button ");
	}

	public static void main(String[] args) {

		// create object of Hashtable
		Hashtable<String, String> objHashtable = null;

		// create object of
		FacebookSignupClass objFacebookSignupClass = new FacebookSignupClass();
		objHashtable = objFacebookSignupClass.createFaceBookSignUpData();

		System.out.println("New FaceBook USer Sign Up with =============================== ");
		doFaceBookSignUp(objHashtable);

	}

}
