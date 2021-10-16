package day11loops;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		
		//while-loop body may not be executed for some conditions.
		int i = 1;		
		while(i<1) {
			System.out.println("Hello!");
			i--;
		}

		//do-while-loop body executed at least once
		int k = 1;		
		do {			
			System.out.println("Hello!");			
			k++;			
		}while(k<1);

	}

}
