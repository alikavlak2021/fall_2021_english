package day29exceptions;

	/*
	 	1)StringBuffer and StringBuilder are mutable classes
	 	2)StringBuffer(Java 1) is created before StringBuilder(Java 5) in Java
	 	3)StringBuffer is thread-safe and synchronized class, 
	 	  but StringBuilder is not thread-safe and not synchronized class
	 */

public class String_StringBuilder_StringBuffer01 {

	public static void main(String[] args) {
		
		StringBuffer sbr1 = new StringBuffer();//16		
		System.out.println(sbr1.capacity());
		
		StringBuffer sbr2 = new StringBuffer("Java");
		System.out.println(sbr2.capacity());//16+4 = 20
		
		StringBuffer sbr3 = new StringBuffer(7);
		System.out.println(sbr3.capacity());
		
		sbr3.append("Java");
		System.out.println(sbr3.capacity());//7
		
		sbr3.append(" is good");
		System.out.println(sbr3.capacity());//7*2+2 = 16
	}

}
