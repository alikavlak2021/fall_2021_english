package day23inheritanceoverriding;

	/*
	 	1)The method inside the child class(Overridden) cannot have 
	 	  narrower access modifier. It means the method in child 
	 	  class can have same or wider access modifier. Otherwise, 
	 	  you will get compile time error.
	 	  
	 	  Note: The method inside the parent class is called 
	 	  "Overriding" method.
	 	  
	 	  Note: If the method in parent class has
	 	  		i)"default" access modifier then overridden method
	 	  		can have "default", "protected", "public"
	 	  		ii)"protected" access modifier then overridden method
	 	  		can have "protected", "public"
	 	  		ii)"public" access modifier then overridden method
	 	  		can have "public"
	 	  		
	 	2) "private" methods cannot be overridden
	 	
	 	3) i) If the return type in the "Overriding Method" is void
	 	      "Overridden method" must have "void" as return type
	 	      
	 	   ii) If the return type in the "Overriding Method" is primitive
	 	      "Overridden method" must have same return type
	 	      
	 	   iii) If the return type is "non-primitive", you must have 
	 	        "IS-A relationship" from the return type of "Overridden Method"
	 	        to return type of "Overriding Method"
	 	        
	 	   iv) If the return type is "Wrapper Class", you cannot use different
	 	       return types in overriding because Java did not create "IS-A" 
	 	       relationship between "Wrapper Classe"
	 	       
	    4) "static" methods cannot be overridden because implementation of 
	       a static method is common for all objects. You cannot specify the 
	       implementation for a single class.
	       
	    5) "final method" means, implementation(codes inside the body) cannot be changed.
	       But we override a method to change the codes inside the body. This is 
	       contradiction because of that Java does not let us to override
	       final methods.
	       
	       "final variable" means, the value of the variable cannot be changed.     
	       final int age = 41;	       
	       age = 42; ==> That code gives Compile Time Error
	       
	       "final class" cannot not have any child class.
	       If a class "final class", no class can extend to it.
	       "final class" cannot be "parent class", it can be child class
	       
	       "finalize" means, process Garbage Collector applies before destroying objects
	 	       
	 */

public class Honda extends Car {

	public void havingHybridEngine() {
		
		System.out.println("Honda cars have hybrid engine option...");
		
	}

	@Override
	public void move() {		
		System.out.println("Honda moves fast...");		
	}

	@Override
	public int price() {
	
		return 30000;
		
	}

	@Override
	public Honda name() {
		
		return new Honda();
		
	}

	@Override
	public Integer age() {
		
		return 1;
		
	}

}
