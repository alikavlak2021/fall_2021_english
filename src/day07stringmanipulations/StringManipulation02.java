package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name...");
		String fullName = scan.nextLine();
		
		System.out.println(fullName);
		
		//1)Remove spaces from beginning and end when user entered the name
		String trimmedFullName = fullName.trim();
		System.out.println(trimmedFullName);
		
		//2)Check if the String is empty(No character) String.
		boolean isTheStringEmpty = fullName.isEmpty();
		System.out.println(isTheStringEmpty);
		
		//3)Check if the String is blank(No cahacter or just space character) String.
		boolean isTheStringBlank = fullName.isBlank();
		System.out.println(isTheStringBlank);
		
		scan.close();
	}

}
