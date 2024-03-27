import java.util.Scanner;

public class teacher {
	String type;
	
	void teaches() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter teacher type");
		type = scan.next();
	}

}
