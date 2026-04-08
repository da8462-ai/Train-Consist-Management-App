import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for Passenger Bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Step 3: Add Passenger Bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Step 4: Display Bogies after Addition
        System.out.println("\nPassenger Bogies after adding:");
        System.out.println(bogies);

        // Step 5: Remove one bogie (AC Chair)
        bogies.remove("AC Chair");

        // Step 6: Display after Removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(bogies);

        // Step 7: Check existence using contains()
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Step 8: Final State
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(bogies);

        // Step 9: Continue program
        System.out.println("\nProgram continues...");
    }
}