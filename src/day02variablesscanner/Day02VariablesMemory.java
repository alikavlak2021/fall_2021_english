package day02variablesscanner;

public class Day02VariablesMemory {

	public static void main(String[] args) {
		
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
			      		c)byte: It is used for "whole numbers" between -128 and 127
			      				It uses 8 bits from memory
			      				If you are not sure the value will be between -128 and 127, do not use
			      				byte data type
			      		d)short: It is used for "whole numbers" between -32768 and 32767 
			      		         It uses 16 bits from the memory.
			      		         If you are not sure the value will be between -32768 and 32767, 
			      		         otherwise do not use short data type
			      		e)int: It is used for "whole numbers" between -2,147,483,648 and 2,147,483,647
			      			   It uses 32 bits from the memory
			      		f)long: It is used for "whole numbers" between -9,223,372,036,854,755,808 and 9,223,372,036,854,755,807
			      		        It uses 64 bits from the memory 
			      		        Note: Every whole number is "int" for Java as default. When you create a "long" variable, you have to put
			      		              "L" or "l" to the end to inform Java, the number is not int it is long.Otherwise you will get error
			      		g)float: It is used for "Decimal Numbers".
			      		         It uses 32 bits from memory.
			      		         Note: Every decimal number is "double" for Java as default. 
			      		         When you create a "float" variable, you have to put
			      		         "F" or "f" to the end to inform Java, the number is not double, it is float.
			      		         Otherwise you will get error 
			      		         You can have 7 digits in decimal part at most
			      		h)double: It is used for "Decimal Numbers"
			      				  It uses 64 bits from memory.
			      				  You can have 16 digits in decimal part at most
			      		
			      Note: "=" is used to assign value to a variable
			            "==" is used to compare 2 values if they are equal to each other
			            "!=" means "not equal to"
			            
			      Note: If all values in an operation is integer the result will be integer in Java
			            If the result is decimal in Math, Java converts the decimal to integer just by removing decimal part.
			            Java do not do "rounding" operation
			      
			      2)Non-Primitive Data Type: 
			      
			      		String: It is used for "Multiple Characters" 
			      		
			      Note: "Stack Memory" is small and contains i)primitive data 
			      											 ii)Addresses(references) of the non-primitive data
			      		"Heap Memory" is large memory and contains non-primitive data
			      		
			      Note: What is the difference between "primitive" and "non-primitive" data types?
			            a)Primitive data type names are typed just by using lower cases, but non-primitive data types use
			              upper case at the beginning.
			            b)Primitive data types are just 8, but non-primitive data types are unlimited. 
			            c)Primitive data types were created by Java, we cannot create primitive data type.
			              But non-primitive data types can be created by Java and by developers.
			            d)Primitive data types are stored in "Stack Memory" and non-primitive data types are stored in
			              "Heap Memory"
			            ****e)Primitive data types have just "values" in them.
			                  But non-primitive ones have "values" and "methods" in them
 			           
		
	    */	
		
		byte age = 12;
		System.out.println("Age: " + age);//Age: 12
		
		short populationOfAVillage = 2000; 
		System.out.println("Population: " + populationOfAVillage);//Population: 2000
		
		int profit = 2000000000;
		System.out.println("The profit: $" + profit);//The profit: $2000000000
		
		long numberOfCellsInAHuman = 56743891809727L;
		System.out.println("The number of cells in a human: " + numberOfCellsInAHuman);
		
		float f = 1.2f;
		System.out.println("The value: " + f);
		
		double d = 1.2;
		System.out.println("The value: " + d);
		
		String stdName = "Ali Can";
		System.out.println("Student name: " + stdName);
		
		System.out.println(stdName.toUpperCase());//ALI CAN		
		System.out.println(stdName.toLowerCase());//ali can		
		System.out.println(stdName.contains("i"));//true		
		System.out.println(stdName.contains("x"));//false

	}

}
