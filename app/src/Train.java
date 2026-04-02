import java.util.*;
import java.util.stream.Collectors;

// Bogie class (same as UC7)
class Bogie {
    int id;
    int capacity;

    Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class UC8_FilterBogies {
    public static void main(String[] args) {

        // Reusing list from UC7
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, 50));
        bogies.add(new Bogie(2, 75));
        bogies.add(new Bogie(3, 60));
        bogies.add(new Bogie(4, 90));
        bogies.add(new Bogie(5, 40));

        // Stream pipeline with filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList()); // collect result

        // Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}