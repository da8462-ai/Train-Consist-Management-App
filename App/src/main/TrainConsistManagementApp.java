package main;
import java.util.*;
import java.util.stream.Collectors;

// Main Application
public class TrainConsistManagementApp {

    // ---------------- Bogie Class ----------------
    static class Bogie {
        private String id;
        private String type;
        private int capacity;

        public Bogie(String id, String type, int capacity) {
            this.id = id;
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return "Bogie ID: " + id +
                    ", Type: " + type +
                    ", Capacity: " + capacity;
        }
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {

        // Step 1: User creates list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B1", "Sleeper", 72));
        bogies.add(new Bogie("B2", "AC Chair", 60));
        bogies.add(new Bogie("B3", "First Class", 50));
        bogies.add(new Bogie("B4", "Sleeper", 80));
        bogies.add(new Bogie("B5", "AC Chair", 75));

        // Step 2: Convert list into stream and apply filter
        List<Bogie> filteredBogies =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 60) // condition
                        .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("===== Filtered Bogies (Capacity > 60) =====");

        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Step 4: Show original list unchanged
        System.out.println("\n===== Original Bogie List =====");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 5: Program continues
        System.out.println("\nProgram executed successfully.");
    }
}
