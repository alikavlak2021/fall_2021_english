package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		
		//1) Get the array elements from user and create an array
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the array...");
		int length = scan.nextInt();
		
		String sArr[] = new String[length];
		
		for(int i=0; i<length; i++) {
			System.out.println("Enter " + (i+1) + ". element");
			sArr[i] = scan.next();
		}
		
		System.out.println(Arrays.toString(sArr));
		
		//Make the second element first, first element last, last element second
		//[Ali, Veli, Samil, Kemal] ==> [Veli, Kemal, Samil , Ali]
		
		String sArrNew[] = new String[length];
		
		sArrNew[0] = sArr[1];
		
		sArrNew[length-1] = sArr[0];
		
		sArrNew[1] = sArr[length-1];
		
		for(int i=0; i<length; i++) {
			
			if(i==0 || i==1 || i==(length-1)) {
				continue;
			}		
			sArrNew[i] = sArr[i];
			
		}

		System.out.println(Arrays.toString(sArrNew));//[Veli, Kemal, Samil, Ali]
		
	}

}
