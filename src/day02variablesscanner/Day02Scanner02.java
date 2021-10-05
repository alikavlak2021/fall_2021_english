package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner02 {

	public static void main(String[] args) {
		
		/*
		 	Get 2 numbers from user and print the sum on the console...
		*/
		
		//Create Scanner object and import Scanner Class
		Scanner scan  = new Scanner(System.in);
		
		//Send a message to the user
		System.out.println("Enter first number...");
		
		//Get the data and put into the container
		double num1 = scan.nextDouble();
		
		System.out.println("Enter second number...");
		
		double num2 = scan.nextDouble();
		
		System.out.println("The sum: " + (num1 + num2));
		
		scan.close();
	}
}
