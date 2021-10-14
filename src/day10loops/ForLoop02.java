package day10loops;

import java.util.Scanner;

public class ForLoop02 {
	
	/*
	   Get the number of rows from user then draw a right triangle by using asterixes
	   Number of rows = 4  ==>  *
	                            * *
	                            * * *
	                            * * * *
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows...");
		int numOfRows = scan.nextInt();

		for(int i=1; i<=numOfRows; i++) {
			
			for(int k=1; k<=i; k++) {		
				System.out.print("* ");				
			}
			
			System.out.println();
			
		}
		
		scan.close();
	}
}
