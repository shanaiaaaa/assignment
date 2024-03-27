
public class q8_231 {

		    private String name;
		    private double basicSalary;

		    // Constructor
		    public q8_231(String name, double basicSalary) {
		        this.name = name;
		        this.basicSalary = basicSalary;
		    }

		    // Method to calculate total salary
		    public double calculateTotalSalary() {
		        double da = basicSalary/10; 
		        double hra = 5000; 
		        return basicSalary + da + hra;
		    }

		    // Getter and setter methods
		    public double getBasicSalary() {
		        return basicSalary;
		    }

		    public void setBasicSalary(double basicSalary) {
		        this.basicSalary = basicSalary;
		    }

		    public static void main(String[] args) {
		        
		    	q8_231 employee = new q8_231("John", 50000);

		        
		        System.out.println("Initial Basic Salary: " + employee.getBasicSalary());

		        
		        System.out.println("Total Salary: " + employee.calculateTotalSalary());
		    }


	}