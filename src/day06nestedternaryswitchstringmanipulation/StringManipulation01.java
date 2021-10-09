package day06nestedternaryswitchstringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string...");
		String str = scan.nextLine();
		
		//Print the first and last character of the given String on the console. "Java is easy" ==> Jy		
		char firstChar = str.charAt(0);		
		char lastChar = str.charAt(str.length()-1);

		if(str.length()==1) {
			System.out.println(firstChar);
		}else {
			System.out.println("" + firstChar + lastChar);
		}
		
		//Print the index of first occurence of of a specific character. If the character does not exist print " No 'a' ".
		int idx = str.indexOf("boat");	
		if(idx==-1) {
			System.out.println("No 'a'");
		}else {
		     System.out.println(idx + " is the index");
		}		
		//Note 1: If you use non-existing character in indexOf() method, you will get -1 every time.
		//Note 2: indexOf() method works with char and works with String
		//Note 3: If you use multiple characters in indexOf(), it returns the index of first character
		//Note 4: indexOf() method works with first occurences every time.
		
		
		//Print the index of last occurence of a specific character.
		int lastIdx = str.lastIndexOf("ar");		
		System.out.println(lastIdx);		
		//Note 1: If you use non-existing character in lastIndexOf() method, you will get -1 every time.
		//Note 2: lastIndexOf() method works with char and works with String
		//Note 3: If you use multiple characters in lastIndexOf(), it returns the index of first character
		//Note 4: lastIndexOf() method works with last occurences every time.
		
		//Check if a given character is unique in a String or not?		
		char c = 'a';		
		int firstOccurenceIdx = str.indexOf(c);
		
		int lastOccurenceIndex = str.lastIndexOf(c);
		
		if(firstOccurenceIdx==-1) {			
			System.out.println(c + " does not exist inside the String");			
		}else if(firstOccurenceIdx==lastOccurenceIndex) {			
			System.out.println(c + " is unique");			
		}else {			
			System.out.println(c + " is not unique");			
		}
		
		//Get the initials of first name and last name of the user. Aliye Canan ==> AC
		char initialOfFirstname = str.charAt(0);		
		char initialOfLastName = str.charAt(str.indexOf(" ")+1);		
		System.out.println("" + initialOfFirstname + initialOfLastName);
		
		//Get the character form index 3 to index 7 from a String
		String sub = str.substring(3, 8);//In substring() method first index is inclusive, second index is exclusive
		System.out.println(sub);// a is 
		
		
		//Get the character form index 3 to the end from a String
		String sub2 = str.substring(3);
		System.out.println(sub2);
		
		//Note: There are 2 substring() method.  
		//      First one has 2 parameters, it is used to get a part of a String from starting index(inclusive) to the ending index(exclusive)
		//      Second one has a single parameter, it is used to get a part of a String from starting index(inclusive) to the end
		
		/*
		 	String shirtPrice = $12.99
		 	String trouserPrice = $25.99
		 	Type code to calculayte the sum of the shirt and the touser prices.
		*/		
		String shirtPrice = "$12.99";
		String trouserPrice = "$25.99";
		String updatedShirtPrice = shirtPrice.replace("$", "").replace(".", "");
		System.out.println(updatedShirtPrice);
		String updatedTrouserPrice = trouserPrice.replace("$", "").replace(".", "");
		System.out.println(updatedTrouserPrice);
		System.out.println((Integer.valueOf(updatedShirtPrice) + Integer.valueOf(updatedTrouserPrice))/100.0);//38.98
		
		scan.close();

	}

}
