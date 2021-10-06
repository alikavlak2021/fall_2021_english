package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement02 {
	
	/*
	 	If you want to compare the values of 2 Strings use "equals()", do not use "=="
	 	"equals()" checks just the values of the Strings but "==" checks the values and the addresses of the String.
	 */

	public static void main(String[] args) {
		
		//Ask user to ender any day name, then print if it is "Week day" or "weekend day" 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name...");
		String dayName = scan.next();
		
		if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")) {
			System.out.println("Week day");
		}else if(dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) {
			System.out.println("Weekend day");
		}else {
			System.out.println("Hey user, I told you to enter day name, what did you enter?");
		}
		
		scan.close();

	}

}
