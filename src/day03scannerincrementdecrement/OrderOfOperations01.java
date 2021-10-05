package day03scannerincrementdecrement;

public class OrderOfOperations01 {
	
	/*
	 	In Math, operations must be done according to the operation order rules
	 	1)Exponentials must be done first
	 	2)Operations inside the parenthesis
	 	3)Multiplication and Division
	 	4)Addition and subtraction	 	
	 */

	public static void main(String[] args) {
		
		//38 / 2 - ( 4 + 3 ) * 2  = ?		
		System.out.println(38 / 2 - ( 4 + 3 ) * 2);//5
		
		//8 + 2 * ( 14 - 6 / 2) - 12  = ? 
		System.out.println(8 + 2 * ( 14 - 6 / 2) - 12);//18
	}

}
