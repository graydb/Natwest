package com.qa.calcjg;

import java.util.Scanner;



public class Calculator {
	
	

	public static void main(String [] args ) {
		
		// i need to put input from me the user 
		//Vin says think switch cases in conditionals if statements in iteration, 
		//loops
		//methods
		// watch video back from scanner and copy how he starts to get going
		
		 char button;
		 Double number1, number2, result;
		 
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Choose a button: +, -, *, or /");
	    button = sc.next().charAt(0);
		
		System.out.println("Enter first number");
		number1 = sc.nextDouble();
		
		
		System.out.println("Enter second number");
		number2 = sc.nextDouble();
		
	}
		
	
		public double addition(double number1, double number2) {
			return number1 + number2;
		}
		
		public double divide(double number1, double number2) throws DivideByZeroException {
			if(number2 == 0) {
				throw new DivideByZeroException("Can't Divide by zero!");
			}
			return number1 / number2;
		}
		
		public double multiply(double number1, double number2) {
			return number1 * number2;
		}
		
		public double subtract(double num1, double num2) {
			return num1 - num2;
		
	

		
////		switch (button) {
//		
//		case '+':
//	        result = number1 + number2;
//	        System.out.println(number1 + " + " + number2 + " = " + result);
//	        break;
//	        
//		case '-':
//	        result = number1 - number2;
//	        System.out.println(number1 + " - " + number2 + " = " + result);
//	        break;
//
//	        
//		 case '*':
//		        result = number1 * number2;
//		        System.out.println(number1 + " * " + number2 + " = " + result);
//		        break;
//		        
//		        
//		 case '/':
//		        result = number1 / number2;
//		        System.out.println(number1 + " / " + number2 + " = " + result);
//		        break;
//		
//
//		      default:
//		        System.out.println("dont work");
//		        break;
//		    
		}
		
	
public void seeyacalc() {
	System.out.println( " go AGAIN and AGAIN!!!");
	
	

	}
	
	
}