package day05nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
	
	
	 /*
	 	Ask user to enter a password 
		
		If the initial of the password is uppercase then check if it is ‘A’ or not. 
		If it is ‘A’ the output will be “Valid Password” 
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
		
		If the initial of the password is lowercase then check if it is ‘z’ or not. 
		If it is ‘z’ the output will be “Valid Password” 
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
	 */
	
	/*
	 	Note: Every character in a String has index. 
	 	      Indexes start from zero so the index of first character is zero.
	 	      Index of last character in a String equals "the number of characters - 1"
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password...");
		String pwd = scan.next();
		
		char firstChar = pwd.charAt(0);
		
		if(firstChar>='A' && firstChar<='Z') {
			
			if(firstChar=='A') {
				
				System.out.println(pwd + " is a valid password");				
				
			}else {
				
				System.out.println(pwd + " is not a valid password");
				
			}
			
		}else if(firstChar>='a' && firstChar<='z') {
			
			if(firstChar=='z') {
				
				System.out.println(pwd + " is a valid password");
				
			}else {
				
				System.out.println(pwd + " is not a valid password");
				
			}
			
		}else {
			
			System.out.println("First character should be letter...");
			
		}

	}

}
