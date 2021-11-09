package day25interfaceencapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
//		Students std1 = new Students();		
//		System.out.println(std1.getName());//Ali Can 		
//		std1.setName("Veli Han");
//		System.out.println(std1.getName());//Veli Han		
//		System.out.println(std1.getGrade());//11		
//		System.out.println(std1.isSuccessful());//true
		
		
		//if you use following constructor all crated students will have 
		//same name, which is not good
		Students std2 = new Students();
		System.out.println(std2);

		//If you use following constructor, in every object creation
		//you can create a different object
		Students std3 = new Students("Veli Han", 10, false);
		System.out.println(std3);
		
		Students std4 = new Students("Kemal Can", 8, true);
		System.out.println(std4);
		
		//The best way; i)Create student object by using default constructor
		//              ii)Change the values by using setters then do 
		//                 whatever you want
		Students std5 = new Students();
		System.out.println(std5);
		
		std5.setName("Ayse Han");
		std5.setGrade(7);
		std5.setSuccessful(true);
		//now save the student into data base
		System.out.println(std5);
		
		std5.setName("Mary Star");
		std5.setGrade(12);
		std5.setSuccessful(false);
		//now save the student into data base
		System.out.println(std5);
		

	}

}
