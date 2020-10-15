package com.sunita.assignments.advanced.exception;

//Java program to deonstrate exceptions

public class ExceptionsExample {

	public static void main(String[] args) {

		try {
			// code that may raise exception
			//int data = 100 / 0;

			//String str = null;
			//System.out.println(str.contains("s")); // NullPointerException

			int arr[] = new int[5];
			arr[6] = 50; // ArrayIndexOutOfBoundsException
			
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception occurs");
			System.out.println(e);
		}
		finally {
			System.out.println("In finally block");
		}
	}

}
