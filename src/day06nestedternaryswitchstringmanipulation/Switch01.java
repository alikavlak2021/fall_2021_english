package day06nestedternaryswitchstringmanipulation;

import java.util.Scanner;

public class Switch01 {
	
	/*
	 	If you have many(more than 3) conditions, prefer to use switch instead of if-else-if.
	*/
	
	/*
	    Type code to print the day names when the day number is entered	
	    1==>Sunday, 2==>Monday, ...
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day number...");
		int dayNumber = scan.nextInt();
		
		switch(dayNumber) {
		
			case 1:
				System.out.println("Sunday");
				break;//break; takes you outside the switch statement
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;	
			default:
				System.out.println("I told you enter day number, what kind of user are you...");
				break;//This break; is optional...
			
		}
		
		scan.close();

	}

}
