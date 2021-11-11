package day28exceptions;

public class Exception03 {

	public static void main(String[] args) throws IllegalGradeException {
		
		checkGrade(123);

	}
	
	//Note: If you create an Exception it is called "Custom Exception"
	/*
	 	To create a "checked exception"
	 	1)Create Exception class
	 	2)Do not forget to extend "Exception"
	 	3)Create constructor with "String message" parameter and 
	 	  put "super(message)" inside the constructor
	 */
	
	//Create "IllegalGradeException". Grades are from zero to hundred. 
	//If the grade is less than zero or greater than 100 "IllegalGradeException" will be thrown
	
	
	public static void checkGrade(int grade) throws IllegalGradeException {
		
		if(grade<0 || grade>100) {
			throw new IllegalGradeException(grade + " is not between 0 and 100 but it must...");
		}
		
		System.out.println("Your grade is " + grade);
		
	}
	
	static class IllegalGradeException extends Exception{
		
		public IllegalGradeException(String message) {
			super(message);
		}
		
	}

}
