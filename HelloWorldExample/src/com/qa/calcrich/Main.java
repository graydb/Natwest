package com.qa.calcrich;

import java.util.Scanner;

public class Menu {

	int operation;
	boolean running = true;
	double input1;
	double input2;

	Calculator calc = new Calculator();
	Scanner scan = new Scanner(System.in);

	public int menu() {
		System.out.println("Which method would you like to use?");
		System.out.println("1. Addition");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("0. Quit");
		return scan.nextInt();
	}

	public void input() throws DivideByZeroException {
		while (running) {

			operation = menu();

			switch (operation) {
			case 1:
				System.out.println("Enter your first number:");
				input1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				input2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.addition(input1, input2));
				break;
			case 2:
				System.out.println("Enter your first number:");
				input1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				input2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.subtract(input1, input2));
				break;
			case 3:
				System.out.println("Enter your first number:");
				input1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				input2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.multiply(input1, input2));
				break;
			case 4:
				System.out.println("Enter your first number:");
				input1 = scan.nextDouble();
				System.out.println("Enter your second number:");
				input2 = scan.nextDouble();
				System.out.println("This is the answer: " + calc.divide(input1, input2));
				break;
			case 0:
				System.out.println("Quitting.");
				scan.close();
				running = false;
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}

	public void start() throws DivideByZeroException {
		input();
	}
}