package day22inheritance;

public class Mammal extends Animal{
	
	public Mammal(boolean isFeed) {
		System.out.println("Boolean mammal Constructor...");	
	}
	
	public Mammal() {
		super("Dog");
		System.out.println("No prameter mammal Constructor...");	
	}
	
	public void giveBirth() {
		System.out.println("They give birth...");
	}
	
	public void feedWithMilk() {
		System.out.println("They feed their babies with milk...");
	}

}
