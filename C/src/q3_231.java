
public class q3_231 {

	public static void main(String[] args) {
		int n = 10; 
        System.out.println("Fibonacci Series up to " + n + " terms:");
        display(n);
    }

    public static void display(int n) {
        int num1 = 0, num2 = 1;
        System.out.print(num1 + " ");
        
        
        for (int i = 1; i < n; ++i) {
            System.out.print(num2 + " ");
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

	}

}
