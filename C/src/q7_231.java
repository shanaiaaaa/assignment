
public class q7_231 {

	private String name;
    private String breed;

    // Constructor
    public q7_231(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
 
        q7_231 dog1 = new q7_231("Ludo", "Labrador");
        q7_231 dog2 = new q7_231("Levi", "Golden Retriever");
        System.out.println("Dog 1: Name - " + dog1.getName() + ", Breed - " + dog1.getBreed());
        System.out.println("Dog 2: Name - " + dog2.getName() + ", Breed - " + dog2.getBreed());

        
        dog1.setName("Rocky");
        dog2.setBreed("German Shepherd");
        System.out.println("\nUpdated Dog 1: Name - " + dog1.getName() + ", Breed - " + dog1.getBreed());
        System.out.println("Updated Dog 2: Name - " + dog2.getName() + ", Breed - " + dog2.getBreed());
    }

}
