import java.util.Scanner;

public class car extends vehicle{
	Scanner s = new Scanner(System.in);
	int horsepower=80;
	String make;
	
	car(String make){
		
	
		super(85);
		this.make=make;
	}
	@Override
	void drive() {
		super.drive();
		System.out.println("The car is moving at horsepower: " + horsepower);
	}

}
