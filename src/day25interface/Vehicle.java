package day25interface;

public interface Vehicle {
	
	public default void move() {
		System.out.println("All vehicles should move...");
	}
	
	public static void staticMove() {
		System.out.println("All vehicles should move better...");
	}

}
