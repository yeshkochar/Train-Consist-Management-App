import java.util.ArrayList;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies (CREATE)
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after insertion (READ)
        System.out.println("Bogies after addition: " + bogies);

        // Remove a bogie (DELETE)
        bogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + bogies);

        // Check existence (READ)
        boolean exists = bogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Final state
        System.out.println("Final bogie list: " + bogies);

        // Program continues...
    }
}