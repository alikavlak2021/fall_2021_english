package day10loops;

import java.util.Scanner;

public class ForLoop01 {
	
	/*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows...");
		int numOfRows = scan.nextInt();
		
		System.out.println("Enter the number of columns...");
		int numOfColumns = scan.nextInt();
		
		for(int i=1; i<=numOfRows; i++) {
			
			for(int k=1; k<=numOfColumns; k++) {			
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		scan.close();

	}
	
	
	
	
	
	
	
	
	
	
	

}
