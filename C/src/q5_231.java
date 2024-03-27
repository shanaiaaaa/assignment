import java.util.Scanner;

public class q5_231 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt(); 
        int temp, rem, result = 0; 
        temp = num; 

        
        while (temp != 0) {
            rem = temp % 10; 
            result = result + rem*rem*rem;
            temp/=10;
        }


        if (result == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}