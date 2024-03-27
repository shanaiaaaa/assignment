
public class student  {
	String name="Unknown";
	int age=0;
	String address="not available";
	
	 void setinfo(String name, int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;	
	}
	void setinfo(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("\nStudent name:" +name+"\nAge:"+ age+"\nAddress:"+address);
		System.out.println();
	}

}
