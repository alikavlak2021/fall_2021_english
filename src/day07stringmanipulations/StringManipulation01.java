package day07stringmanipulations;

public class StringManipulation01 {
	
	/*
	 	Regex(Regular Expression): Regex is used to declare a group of characters
	 	i) All lower case letters ==> [a-z]
	 	ii)All upper case letters ==> [A-Z]
	 	iii)All upper case and lower case letters ==> [a-zA-Z]
	 	iv)All characters different from space character ==> \\S
	 	v) Space character ==> \\s
	 	vi)All characters different from digits ==> \\D
	 	vii)All digits ==> \\d
	 	viii) Non alphabetical characters ==> [^a-zA-Z]
	 	ix) Characters from a to z, from A to Z, form 0 to 9, and _ ==> "\\w"
	 	x) Characters different from a to z, A to Z, 0 to 9, and _ ==> "\\W"
	 */

	public static void main(String[] args) {
	
		//1)Type code to find the number of space characters in a String
		String s1 = "Ali1 went2 to3 the school.";		
		String updateds1 = s1.replaceAll("\\S", "");
//		System.out.println(updateds1.length());
		
		//2)Type code to find the number of characters different from space character
		
		//1.Way:                Number of all characters - Number of space characters = Number of characters different from space character
		int numfCharsDiffFromSpace =  s1.length()        -      updateds1.length();
		System.out.println(numfCharsDiffFromSpace);
		
		//2.Way: Find the characters different from space directly
		String updated2s1 = s1.replaceAll("\\s", "");//Ali1went2to3theschool.
		System.out.println(updated2s1.length());
		
		//3)Type code to find the number of digits, number of letters, and characters different from digits and letters.
		String s2 = "Ali Can: 1234567890 !!! ? .";
		
		String updateds2 = s2.replaceAll("\\D", "");// "\\D" and "[^0-9]" have same meaning
		System.out.println(updateds2.length());//10
		
		String updated2s2 = s2.replaceAll("[^a-zA-Z]", "");//AliCan
		System.out.println(updated2s2.length());
		
		String updated3s2 = s2.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(updated3s2.length());
		
		/*
			4)Check the password according to the given rule
				a)No space character at the beginning and at the end
				b)It must contain at least 1 digit
				c)It must contain at least 1 lowercase letter
				d)It must contain at least 1 uppercase letter
				e)It must contain at least 1 character different from digits and letters
	   */
		String pwd = "123Abc";
		
		boolean isFirstCharSpace = pwd.startsWith(" ");
		System.out.println(isFirstCharSpace);
		
		boolean isLastCharSpace = pwd.endsWith(" ");
		System.out.println(isLastCharSpace);//false
		
		int numOfDigitChars = pwd.replaceAll("\\D", "").length();
		
		int numOfLowerCaseChars = pwd.replaceAll("[^a-z]", "").length();
		
		int numOfUpperCaseChars = pwd.replaceAll("[^A-Z]", "").length();
		
		int numOfCharsDiffFromLetterAndDigit = pwd.replaceAll("[a-zA-Z0-9]", "").length();
		
		if(isFirstCharSpace) {
			System.out.println("Your password is invalid. Do not use space at the beginning.");
		}
		if(isLastCharSpace) {
			System.out.println("Your password is invalid. Do not use space at the end.");
		}
		if(numOfDigitChars==0) {
			System.out.println("Your password is invalid. Use at least 1 digit.");
		}
		if(numOfLowerCaseChars==0) {
			System.out.println("Your password is invalid. Use at least 1 lowercase letter.");
		}
		if(numOfUpperCaseChars==0) {
			System.out.println("Your password is invalid. Use at least 1 upercase letter.");
		}
		if(numOfCharsDiffFromLetterAndDigit==0) {
			System.out.println("Your password is invalid. Use at least 1 character different from letters and digits");
		}
	}
}
