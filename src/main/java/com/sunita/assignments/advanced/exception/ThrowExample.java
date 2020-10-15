package com.sunita.assignments.advanced.exception;

public class ThrowExample {

	static void withdrawCash(int amount) {
		if (amount < 1000)
			throw new ArithmeticException("Insufficient balance");
		else
			System.out.println("withdraw cash");
	}

	public static void main(String[] args) {

		withdrawCash(56);
		System.out.println("Bank system");
	}

}
