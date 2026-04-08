import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {

        // HashMap to store bogie name and its capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Adding bogie-capacity mappings
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Displaying bogie capacities
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}