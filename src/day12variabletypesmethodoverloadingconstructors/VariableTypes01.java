package day12variabletypesmethodoverloadingconstructors;

/*
	There are 3 main variable types in Java;
	1)Local Variables: Variables created in method body "age" and "sum" are local variables
	                   Note 1: Local Variables can be used just inside the method body which you created it in.
	                   Note 2: Do not use Local Variables without initializing(assigning a value) otherwise 
	                           you get Compile Time Error
	2)Instance(Object) Variables: Variables created outside of all methods and inside the class without using "static" keyword
	                              "name" is an instance(object) variable
	                              Note 1: If you want initialize the instance variable, if you want do not initialize
	                                      If you do not initialize Java puts "default values" for the instance variables.
	                                      Default Values:
	                                      String ==> null
	                                      byte - short - int - long - float - double ==> 0
	                                      boolean ==> false
	                                      char ==> Nothing ==> ''
	                              Note 2: Instance Variables are attached to every object.                              
   3)Class(static) Variables: Variables created by using "static" keyword, "id" is a class variable
                      Note 1: Class(static) Variables are common for all objects created from the class (Like Moon)
                      Note 2: Every update on Class(static) Variables will be visible by all objects (Like splitting Moon) 
                      Note 3: If you need a variable which all objects need to share make the variable "Class(static) Variable"  
                              If you need all objects should see every update on a variable make the variable "Class(static) Variable"
   
   Note for Instance and Static Variables: To access an "Instance Variable" from another class, you have to create "object"
                                           but to access "Class Variable" from another class no need to create object, 
                                           you can access to a "Class Variable" by using just class name                               
*/

public class VariableTypes01 {
	
	String name = "Ali Can";
	boolean isOld;
	
	static String id;

	public static void main(String[] args) {		
		int age = 12;		
		System.out.println(age);		
	}
	
	
	public static int add(int a, int b) {		
		int sum = a+b; 		
		return sum;
	}
		
}
