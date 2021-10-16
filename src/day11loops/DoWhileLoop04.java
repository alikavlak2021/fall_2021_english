package day11loops;

import java.util.Scanner;

public class DoWhileLoop04 {
	
	/*
	 	Username ise "admin", Password is "pwd123"
	 	Ask user to enter username and password
	 	User should see "Enter your username and password" message
	 	If he enters correct credentials he should get "You are in your account!" message
	 	Otherwise, he should see "Enter your username and password" message 3 times
	 	After 3 times he should get "Your account is blocked" message
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userName = "";
		String passWord = "";
		
		int counter = 0;
		
		do {
			
			if(counter==3) {
				System.out.println("Your account is blocked");
				break;
			}
			
			System.out.println("Enter your username and password");

			userName = scan.next();
			passWord = scan.next();
			
			if(userName.equals("admin") && passWord.equals("pwd123")) {
				System.out.println("You are in your account!");
				break;
			}

			counter++;
						
		}while(true);
		
		scan.close();

	}

}
