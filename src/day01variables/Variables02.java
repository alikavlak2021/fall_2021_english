package day01variables;

public class Variables02 {
	
	/*
		Data Types in Java
		Note: In Java, there are 2 main data types
		
		      1)Primitive Data Types: 
		      		a)boolean: It has 2 different values which are "true" and "false"
		      		           Every boolean variable uses a single "bit" in memory
		      		           booleans have "false" as default value
		      		b)char: It is used for single characters
		      				Value must be put between single quotes like 'S'
		      				Every char uses 16 bits in the memory
		      		c)byte 
		      		d)short 
		      		e)int 
		      		f)long 
		      		g)float 
		      		h)double
		      		
		      Note: "=" is used to assign value to a variable
		            "==" is used to compare 2 values if they are equal to each other
		            "!=" means "not equal to"
		            
		      Note: If all values in an operation is integer the result will be integer in Java
		            If the result is decimal in Math, Java converts the decimal to integer just by removing decimal part.
		            Java do not do "rounding" operation
		      
		      2)Non-Primitive Data Type
		
	 */	
	public static void main(String[] args) {
		
		boolean isExpensive = true; 
		boolean isOld = false;
		boolean isRetired;
		
		char initialOfFirstName = 'S';
		char initialOfLastName = 'A';
		
		System.out.println(initialOfFirstName);//S
		
		System.out.println(initialOfFirstName + 5);//88
		
		System.out.println(initialOfFirstName > 5);//true
		
		System.out.println(initialOfFirstName < 5);//false
		
		System.out.println(initialOfFirstName == 5);//false
		
		System.out.println(initialOfFirstName != 5);//true
		
		System.out.println(initialOfFirstName > initialOfLastName);//true
		
		System.out.println(initialOfFirstName + initialOfLastName);//148
		
		System.out.println(initialOfFirstName / initialOfLastName);//1
		
		System.out.println(29 / 10);//2.9 ==> 2

	}
}
