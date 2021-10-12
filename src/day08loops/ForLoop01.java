package day08loops;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//Type code to print "Hello!" 10 times on the console
		
		//1.way: Not recommended
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");	
		
		System.out.println();
		
		//2.Way: For repeated tasks you can use loops i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop
		for(int i = 1;      i <= 4;          i++) {
			System.out.println("Hello!");	
		}
		
		System.out.println();
		
		//Type all integers from 11 to 44 in the same line with a space between consecutive integers
		for(int i = 11; i < 14; i++) {			
			System.out.print(i + " ");			
		}
		
		System.out.println();
		
		//Type all even integers from 11 to 120 in the same line with a space between consecutive integers
		
		//1.Way: Recommended
		for(int i = 11; i < 121; i++) {
			if(i%2==0) {				
				System.out.print(i + " ");				
			}			
		}
		
		System.out.println();
		
		//2.Way:
		for(int i = 12; i < 121; i = i + 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Type all odd integers from 120 to 11 in the same line with a space between consecutive integers
		for(int i = 120; i > 10; i--) {			
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers
		for(int i = 120; i  > 10; i--) {			
			if(i%4==0 && i%6==0) {
				System.out.print(i+ " ");
			}			
		}
		
		System.out.println();
		
		//Convert "Java" to "J*a*v*a*"		
		String s = "Java";		
		//If instead of s.length() you use just 4, it means your loop works just for four characters. 
		//We do mot want it, because our code should work for every kind of Strings.
		//If you use specific values in your code it is called "Hard Coding" and "Hard Coding" is not acceptable
		for(int i=0; i<s.length(); i++) {			
			System.out.print(s.charAt(i) + "*");				
		}
		
		//Type code to print all unique characters on the console from a given String
		// samame ==> se

	}

}
