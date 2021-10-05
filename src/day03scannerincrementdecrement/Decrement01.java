package day03scannerincrementdecrement;

public class Decrement01 {

	public static void main(String[] args) {
		
		int number = 120;
		System.out.println("Before decrement: " + number);//120
		
		//1.Way:
		number = number - 10;
		System.out.println("After 1st decrement: " + number);//110
		
		number = number / 2;
		System.out.println("After 2nd decrement: " + number);//55
		
		//2.Way:
		number -= 5;//Do not put space between operation sign and equal sign
		System.out.println("After 3rd decrement: " + number);//50
		
		number /= 2;
		System.out.println("After 4th decrement: " + number);//25
		
		//3.Way:This way can be used just for decreasing by 1
		number--;
		number--;
		System.out.println("After 5th decrement: " + number);//23
		
	}

}
