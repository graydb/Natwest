package com.qa.calcrich;

 
import java.util.Scanner;

final public class CalculatorTask {
	
	public double addition(double num1, double num2) {
		return num1 + num2;
	}
	
	public double divide(double num1, double num2) throws DivideByZeroException {
		if(num2 == 0) {
			throw new DivideByZeroException("Can't Divide by zero!");
		}
		return num1 / num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which method would you like to use?");
		System.out.println("1. Addition");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("0. Quit");

		 return scan.nextInt();
	}
	
}
