package day24abstractclass;

	/*
	 	1) Sometimes we need methods without body(Abstract Methods) because sometimes 
	 	   we do not use the body of some methods anytime.
	 	2) To create an "abstract method" i) Do not put method body 
	 	                                 ii) Use "abstract" keyword between access modifier and return type
	 	                                iii) "abstract methods" can be created just in "abstract classes"
	 	                                Note: To make a class abstract use "abstract" keyword before "class"
	 	                                      keyword
	 	3) Abstract classes can have both "abstract methods" and "concrete methods"
	    4) abstract methods MUST be overridden by all CONCRETE child classes but it is optional for 
	       concrete methods. 
	       If you want to make a functionality must for child classes use
	       abstract method for the functionality. 
	    5) "abstract" keyword and "method body" cannot be used at the same time in a method.
	    6) An abstract class can have "abstract child class"
	    7) It is not mandatory for "abstract child class" to override "abstract methods" from
	       parent class.
	    8) If any "abstract method" is overridden by any parent class, it will not be mandatory
	       for child classes	       
	    9) Abstract methods cannot be "final" because "abstract methods" will have newly updated body
	       in every child class but "final method" means no update in body
	    10)Abstract methods cannot be "private" because we create "abstract methods" just for child classes usage
	       but if you make "abstract methods" private child classes cannot access to it.
	 */

public abstract class Animal {
	
	public abstract void eat();
	
	public void drink() {
		
		System.out.println("Animals drink...");
		
	}

}
