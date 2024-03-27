import java.util.Scanner;

public class circle extends shape{
	Scanner sc = new Scanner(System.in);
	double result;
	int r;
	
	void calcarea() {
		System.out.println("Enter the radius of the circle:");
		r= sc.nextInt();	
		result = 3.14*r*r;
		
		System.out.println("The area of the circle is: "+ result);
	}
	void calcperimeter() {
		System.out.println("Enter the radius of the circle:");
		r= sc.nextInt();
		result = 2*3.14*r;
		
		System.out.println("The perimeter of the circle is: "+ result);
	}

}
