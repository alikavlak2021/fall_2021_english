package day03scannerincrementdecrement;

public class Increment01 {

	public static void main(String[] args) {
		
		int age = 12;
		System.out.println("Before increment: " + age);//12
		
		//1.Way:
		age = age + 5;
		System.out.println("After 1st increment: " + age);//17
		
		age = age + 4;
		System.out.println("After 2nd increment: " + age);//21
		
		age = age*2;
		System.out.println("After 3rd increment: " + age);//42
		
		//2.Way:
		age+=5;// This is same with age = age + 5;
		System.out.println("After 4th increment: " + age);//47
		
		age*=2;
		System.out.println("After 5th increment: " + age);//94
		
		//3.Way: This way can be used just to increase by 1
		age++;//This is same with "age+=1;" and same with "age = age + 1;"
		System.out.println("After 6th increment: " + age);//95
		
	}

}
