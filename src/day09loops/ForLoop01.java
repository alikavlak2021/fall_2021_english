package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//1)Type code to print unique characters on the console
		String s1 = "Ann";
		for(int i=0; i<s1.length(); i++) {			
			char c = s1.charAt(i);
			if(s1.indexOf(c)==s1.lastIndexOf(c)) {				
				System.out.print(c);				
			}			
		}
		
		//2)Type code to print a String in reverse after removing spaces
		//  Example: Ali Can ==> naCilA
		
		String s2 = "A Ca";	
		String reversed = "";
		
		for(int i=s2.length()-1; i>=0; i--) {
			char c = s2.charAt(i);
			if(c!=' ') {
				reversed = reversed + c;
			}		
		}		
		System.out.println(reversed);//aCA
		
		
		//3)Type code to find the sum of the integers from 12 to 231
		int sum = 0;		
		for(int i=12; i<231; i++) {			
			sum = sum + i;			
		}		
		System.out.println(sum);
		
		//4)Type code to find the multiplication of the integers from 3 to 5
		int multiplication = 1;
		for(int i=3; i<6; i++) {
			multiplication = multiplication * i;
		}
		System.out.println(multiplication);
		
		//5)Type code to check if a given String is Palindrome.
		//  String: anna  Reversed String: anna
		//  Intgeger: 12321  Reversed Integer: 12321
		String s3 = "12321";
		String rev3 = "";
		
		for(int i=s3.length()-1; i>=0; i--) {			
			rev3 = rev3 + s3.charAt(i);			
		}
		
		System.out.println(rev3);		
		if(s3.equals(rev3)) {
			System.out.println(s3 + " is palindrome");
		}else {
			System.out.println(s3 + " is not palindrome");
		}
		
		//6)Type code to find the sum of the digits of an integer.		
		int sumOfDigits = 0;
		for(int n=254235; n>0; n = n/10) {
			sumOfDigits = sumOfDigits + n%10;
		}
		System.out.println(sumOfDigits);
		
		//6)Type code to find the sum of the unique digits of an integer.
		String sn = "2523";
		int sumOfUniqueDigits = 0;
		for(int i=0; i<sn.length(); i++) {			
			char c = sn.charAt(i);
			if(sn.indexOf(c)==sn.lastIndexOf(c)) {
				String cs = "" + c;
				sumOfUniqueDigits = sumOfUniqueDigits + Integer.valueOf(cs);
			}
		}		
		System.out.println(sumOfUniqueDigits);
	}
}
