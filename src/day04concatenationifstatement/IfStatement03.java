package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement03 {
	
	 /*
	 	Type code to print the seasons after getting month names from user
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a month name...");
		String monthName = scan.next();
		
		if(monthName.equalsIgnoreCase("December") || monthName.equalsIgnoreCase("January") || monthName.equalsIgnoreCase("February")) {
			System.out.println( monthName + " is in winter");
		}else if(monthName.equalsIgnoreCase("March") || monthName.equalsIgnoreCase("April") || monthName.equalsIgnoreCase("May")) {
			System.out.println( monthName + " is in spring");
		}else if(monthName.equalsIgnoreCase("June") || monthName.equalsIgnoreCase("July") || monthName.equalsIgnoreCase("August")) {
			System.out.println( monthName + " is in summer");
		}else if(monthName.equalsIgnoreCase("September") || monthName.equalsIgnoreCase("October") || monthName.equalsIgnoreCase("November")) {
			System.out.println( monthName + " is in fall");
		}else {
			System.out.println( "Are you sure " + monthName + " is a month?");
		}
		
		scan.close();

	}

}
