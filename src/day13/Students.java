package day13;

//Type code to count the number objects created from Students class

public class Students {
	
	public String name;
	public int age;
	public static int numOfStudents;
	public String studentId;
	
	public Students() {
		this.name = "Ali Can";
		this.age = 12;
		numOfStudents++;
		this.studentId = name.substring(0,1) + age + numOfStudents;
	}	
	public Students(String name, int age) {
		this.name = name;
		this.age = age;
		numOfStudents++;
		this.studentId =name.substring(0,1) + age + numOfStudents;
	}	
	public Students(String name) {
		this.name = name;
		numOfStudents++;
		this.studentId =name.substring(0,1) + age + numOfStudents;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Before std1 creation: " + numOfStudents);//0
		
		Students std1 = new Students();
		System.out.println(std1.studentId);
		Students std2 = new Students();
		System.out.println(std2.studentId);
		System.out.println("After std1 and std2 creation: " + numOfStudents);//2
		
		Students std3 = new Students("Veli Han", 13);
		System.out.println(std3.studentId);
		System.out.println("After std1, std2, and std3 creation: " + numOfStudents);//3
		
		Students std4 = new Students("Maru Star");
		System.out.println(std4.studentId);
		System.out.println("After std1, std2, std3, and std4 creation: " + numOfStudents);//4
		
	}

}
