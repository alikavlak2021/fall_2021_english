package day12variabletypesmethodoverloadingconstructors;

public class CarRunner {

	public static void main(String[] args) {
		
		Car c1 = new Car();		
		System.out.println(c1.make);//Honda		
		System.out.println(c1.model);//Pilot		
		System.out.println(c1.price);//40000		
		System.out.println(c1.year);//2021
		
		Car c2 = new Car("Audi", "R8", 32000, 2021);
		System.out.println(c2.make);//Audi
		System.out.println(c2.model);//R8
		System.out.println(c2.price);//32000
		System.out.println(c2.year);//2021
		
		Car c3 = new Car("Mercedes", "C300", 20000, 2019);
		System.out.println(c3.make);//Mercedes
		System.out.println(c3.model);//C300
		System.out.println(c3.price);//20000
		System.out.println(c3.year);//2019
		
	}

}
