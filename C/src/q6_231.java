
public class q6_231 {

	    private String name;
	    private int age;

	    public q6_231(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getname() {
	        return name;
	    }

	    public int getage() {
	        return age;
	    }



	public static void main(String[] args) {
		
		q6_231 p1 = new q6_231("Alice", 25);
		q6_231 p2 = new q6_231("Jake", 30);

        System.out.println(p1.getname() + " is " + p1.getage() + " years old.");
        System.out.println(p2.getname() + " is " + p2.getage() + " years old.");

	}

}
