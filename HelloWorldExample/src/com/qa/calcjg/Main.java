package com.qa.calcjg;

import java.util.Scanner;

public class Main {

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
		
	
		
	
		
		switch (button) {
		
		case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;
	        
		case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	        
		 case '*':
		        result = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result);
		        break;
		        
		        
		 case '/':
		        result = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result);
		        break;

		      default:
		        System.out.println("dont work");
		    
		}
		
	}
public void seeyacalc() {
	System.out.println( " go AGAIN and AGAIN!!!");
	
	

	}
	
	
}
	
	
	
	

