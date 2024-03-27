import java.util.Scanner;

public class Q1_add {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integers:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		int sum= add(a,b);
		
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
}