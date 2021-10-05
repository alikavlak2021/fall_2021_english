package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner03 {
	
	/*
	 	Type a program which calculates the volume of a rectangular prism whose length, width, and height are entered by user. 
		Hint: Volume of a rectangular prism is width x length x height 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hey user, enter length, width, and height of the rectangular prism...");
		
		double length = scan.nextDouble();
		
		double width = scan.nextDouble();
		
		double height = scan.nextDouble();
		
		System.out.println("The volume is " + length*width*height);
		
		scan.close();

	}

}
