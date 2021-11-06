package day25interface;

public interface HybridEngine extends Vehicle{
	
	String MAKE = "Honda Eco";
	
	void havingHybridEngine();
	
	void run();
	
	//Until Java-8, it was impossible to put a concrete method into an interface.
	//But after Java-8, it is possible by using "default" or "static" keyword.
	//Note: Concrete methods even in the interfaces are not mandatory to override by concrete classes
	public default int power() {
		
		System.out.println("Hybrid engines are inreasing their powers...");
		
		return 1000;
		
	}
	
	public static String model() {
		
		System.out.println("The best model...");
		
		return "The best...";
	}

}
