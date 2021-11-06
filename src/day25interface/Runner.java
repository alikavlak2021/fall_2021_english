package day25interface;

public class Runner {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.bacteriaKiller();
		car1.climateAc();
		car1.electronicAc();
		car1.havingHybridEngine();
		
		//When you use "default" keyword to create "concrete method" in an interface, you can call the method just by using "object name"
		//By using interface names, you cannot access to the method.
		car1.move();
		
		//When you use "static" keyword to create "concrete method" in an interface, you can call the method just by using "interface name"
		//By using object names, you cannot access to the method.
		Vehicle.staticMove();
		
		System.out.println(AirCondition.MAKE);//Samsung
		
		System.out.println(HybridEngine.MAKE);//Honda Eco

	}

}
