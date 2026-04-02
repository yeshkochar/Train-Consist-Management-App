import java.util.*;
import java.util.stream.Collectors;

// Bogie class (extended with type)
class Bogie {
    int id;
    int capacity;
    String type; // e.g., Sleeper, AC, General

    Bogie(int id, int capacity, String type) {
        this.id = id;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Capacity: " + capacity + ", Type: " + type;
    }
}

public class UC9_GroupBogies {
    public static void main(String[] args) {

        // Reuse / create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, 50, "General"));
        bogies.add(new Bogie(2, 75, "AC"));
        bogies.add(new Bogie(3, 60, "Sleeper"));
        bogies.add(new Bogie(4, 90, "AC"));
        bogies.add(new Bogie(5, 40, "General"));

        // Grouping using Stream API
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Display grouped result
        System.out.println("Grouped Bogies:");
        groupedBogies.forEach((key, value) -> {
            System.out.println("\nType: " + key);
            value.forEach(System.out::println);
        });
    }
}