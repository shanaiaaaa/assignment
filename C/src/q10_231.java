import java.util.Scanner;

public class q10_231 {

	public static void main(String[] args) {
		
		student[] arr = new student[3];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student 1 data:");
		System.out.println("Enter student name: ");
		String n1 = scan.next();
		System.out.println("Enter student age: ");
		int a1 = scan.nextInt();
		System.out.println("Enter student address: ");
		String ad1 = scan.next();
		arr[0]=new student();
		arr[0].setinfo(n1,a1,ad1);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter student 2 data:");
		System.out.println("Enter student name: ");
		String n2 = scan2.next();
		System.out.println("Enter student age: ");
		int a2 = scan2.nextInt();
		System.out.println("Enter student address: ");
		String ad2 = scan2.next();
		arr[1]=new student();
		arr[1].setinfo(n2,a2,ad2);
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter student 3 data:");
		System.out.println("Enter student name: ");
		String n3 = scan3.next();
		System.out.println("Enter student age: ");
		int a3 = scan3.nextInt();
		System.out.println("Enter student address: ");
		String ad3 = scan3.next();
		arr[2]=new student();
		arr[2].setinfo(n3,a3,ad3);
		
		for(int i=0;i<3;i++) {
			
			arr[i].display();
		}
	

	}

}
