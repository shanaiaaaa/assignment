import java.util.Scanner;

public class q4_231 {

	public static void main(String[] args) {
		
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a = s.nextInt();
		int count = countDigits(a);
		
		
		
		System.out.println("The number of digits in "+a+" are "+count);
		

	}
	public static int countDigits(int a) {
		int rem,count=0;
		while(a!=0) {
			rem=a%10;
			count++;
			a=a/10;
			}
        return count;
    }

}
