package day25interface;

	/*
	 	1)Interface is not a class, interface is interface
	 	2)We need interface to be able to create "multiple interface parents" for a class
	 	3)All methods must be "abstract" in interface, because of that "interfaces" are used for "fully abstraction"
	 	  Note: We can use "abstract" and "concrete" method together in "abstract classes" because of that using "abstract class" is called
	 	        "partial abstraction".
	 	4)Do not use "abstract" keyword when you create interface. Because Java knows
	 	  interfaces are abstract.
	 	5)All methods are "abstract" as default in an interface, becaus eof that using
	 	  "abstract" keyword is optional in interfaces. 
	 	  I mean "public abstract void electronicAc();" and "public void electronicAc();" are completely same for Java
	 	6)All methods are "public" as default in an interface. Because of that using access modifier is optional for methods in an interface.
	 	  "public void climateAc();" and "void climateAc();" are completely same
	 	7)If you make an "interface" parent of a class, do not use "extends" use "implements"
	 	8)In different parent interfaces you can use methods with the same name.
	 	  But be careful about return types. If the method names are same, you cannot use different return types.
	 	
	 	9)All variables in an interface are "public", "static (class variable)", "final" as default
	 	
	 	  Note 1: You cannot create object by using "interfaces" because interfaces are "fully abstract" and they do not have "constructors"
	 	  
	 	  Note 2: "abstract classes" have "constructors" but the constructors are not used to create objects. 
	 	          We cannot create objects from abstract classes. 
	    10) Java knows all variablesin an "interface" are "public", "static (class variable)", "final" as default because of that 
	        declaring "public", "static (class variable)", "final" for variables is optional.
	 	11) In different parent interfaces, you can create variables with the same name, it will not be problem because every time
	 	    when you call a variable you have to use interface name.
	 	12) It is not must to override the methods from interfaces, it is optional, if you want you can override
	 	
	 	13) Concrete class must override all abstract methods from all parents, otherwise you will get Compile Time Error
	 	    Note: If any abstract method is overridden by any parent class, it will not be must to overide it
	 	          by concrete child class.
	 	          
	    14) Concrete Class ==> Interface : implements
	        Absrtract Class ==> Interface : implements	        
	        ***** interface ==> Concrete Class : This is not allowed in Java, class cannot be parent of an interface
	        ***** interface ==> Abstract Class : This is not allowed in Java, class cannot be parent of an interface
	        interface ==> interface : extends
	        Concrete Class ==> Concrete Class: extends
	        Abstract Class ==> Concrete Class: extends
	        Concrete Class ==> Abstract Class: extends
	        Abstract Class ==> Abstract Class: extends
	 */

public interface AirCondition extends Vehicle{
	
	String MAKE = "Samsung";
		
	public abstract void electronicAc();
	
	public void climateAc();
	
	void bacteriaKiller();
	
	void run();

}
