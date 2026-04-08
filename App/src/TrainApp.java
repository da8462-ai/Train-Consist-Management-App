import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashSet for Bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Step 3: Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Step 4: Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // Step 5: Program continues
        System.out.println("\nProgram continues...");
    }
}