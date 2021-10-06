package day04concatenationifstatement;

public class Concatenation01 {
	
	 /*
	 	If you join 2 or more Strings, you can use "+" or "concat()"
	 	
	 	Note: If you are sure data types of s3 and s4 are same, you can use the following syntax;
	 	      String s3 = "Ali", s4 = "Can";
	 	      
	 	Note: If you use many methods side by side, it is called "method chain"
	 */

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "is easy";
		
		//1.Way:
		System.out.println(s1 + " " + s2);//Java is Easy		
		//2.Way:
		System.out.println(s1.concat(" ").concat(s2));//Java is Easy
		
		String s3 = "Java";
		int i1 = 5;
		int i2 = 3;
		
		System.out.println(s3 + i1 + i2);// Java53
		
		System.out.println(i1 + i2 + s3);// 8Java
		
		System.out.println(s3 + (i1 + i2) );// ?

	}

}
