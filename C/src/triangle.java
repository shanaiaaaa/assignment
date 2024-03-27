import java.util.Scanner;

public class triangle extends shape{

	Scanner sc = new Scanner(System.in);
	double result;
	int a,b,h;

	void calcarea() {
		
		System.out.println("Enter the base of triangle:");
		b=sc.nextInt();
		System.out.println("Enter the height of triangle:");
		h=sc.nextInt();
		
		result= 0.5*b*h;
		
		System.out.println("The area of the triangle is: "+ result);
		
	}
	
	void calcperimeter() {
		
		System.out.println("Enter the 3 sides of the triangle:");
		a=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		
		result=a+b+h;
		
		System.out.println("The perimeter of the triangle is: "+ result);
		
	}

}
