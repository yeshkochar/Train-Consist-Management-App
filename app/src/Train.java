import java.util.*;
import java.util.stream.*;

// Bogie class (same as before)
class Bogie {
    int id;
    int capacity;

    Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

public class UC10_TotalCapacity {
    public static void main(String[] args) {

        // Reuse bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, 50));
        bogies.add(new Bogie(2, 75));
        bogies.add(new Bogie(3, 60));
        bogies.add(new Bogie(4, 90));
        bogies.add(new Bogie(5, 40));

        // Stream aggregation
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // extract capacities
                .reduce(0, Integer::sum);   // sum them

        // Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}