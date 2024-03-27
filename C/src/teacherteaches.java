import java.util.Scanner;

public class teacherteaches extends teacher{
	String name;
	
	void subjects() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject name");
		name = sc.next();
		
	}
	
	void display() {
		
		System.out.println("The teacher is teaching "+ name);
	}


}
