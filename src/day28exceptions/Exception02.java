package day28exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

	/*
	 	1)If you get "red underline" while you type code, it can be 
	 	"checked exception - Compile Time Exception".
	 	
	 	2)The most common checked exceptions are 
	 		i)"FileNotFoundException": It is related with "path issue" and "existence of the file"
	 		ii)"IOException": It is related with all "Input and Output issues"
	 		
	    3)"IOException" is the parent of "FileNotFoundException" because of that when you use 
	      "IOException", no need to use "FileNotFoundException". 
	      
	      But if you insist to use "FileNotFoundException" together with "IOException" 
	      in try-catch block, "FileNotFoundException" must be in the first catch block
	      
	    4) If you use "e.printStackTrace();" inside the catch block you will get detailed technical error message
	 */

public class Exception02 {

	public static void main(String[] args){
		
		readTextFiles2();

	}
	
	public static void readTextFiles1() throws IOException {
			
		FileInputStream fis = new FileInputStream("src/day28exceptions/TextFile01");
		
		int i = 0;		
		while((i = fis.read()) != -1) {			
			System.out.print((char)i);			
		}		
		fis.close();
		
	}

	public static void readTextFiles2() {
		
		FileInputStream fis = null;
		
		int i = 0;
		
		try {
			
			fis = new FileInputStream("src/day28exceptionsX/TextFile01");
			
			while((i = fis.read()) != -1) {			
				System.out.print((char)i);			
			}
			
		} catch (FileNotFoundException e) {
			
			System.err.println("File does not exist or path is wrong...");
			
		} catch (IOException e) {
			
			System.err.println("File cannot be read...");
			
		} finally {
			
			try {
				fis.close();
				System.out.println("\nConnection ended...");
			} catch (Exception e) {
				System.err.println("File could not be closed maybe could not be accessed");
			}
			
		}
		
	}

}
