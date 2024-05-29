package com.pack1;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) 
	{
		System.out.println("Select an operation : + , - , * , / : ");
		
		Scanner scanner = new Scanner(System.in);
		char operator = scanner.next().charAt(0);
		
//		System.out.println("Selected operation :  "+ operator);
		
		System.out.println("Enter first number : ");
		float num1 = scanner.nextFloat();
		
		System.out.println("Enter second number : ");
		float num2 = scanner.nextFloat();
		
		scanner.close();
		
		switch (operator) 
		{
		case '+' :
			System.out.println("Sum = "+ (num1 + num2));
			break;
			
		case '-' :
			System.out.println("Difference = "+ (num1 - num2));
			break;

		case '*' :
			System.out.println("Multiplication = "+ (num1 * num2));
			break;

		case '/' :
			if (num2 == 0)
				System.out.println("Error : Cannot be divided by 0");
			else
				System.out.println("Division : " + (num1/num2));
			break;

		default:
			System.out.println("Error : Invalid operation selected.");
		}

	}

}
