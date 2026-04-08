import java.util.LinkedList;

public class TrainApp {
    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList for Train Consist
        LinkedList<String> train = new LinkedList<>();

        // Step 3: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Step 4: Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // Step 5: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Step 6: Final Train Consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        // Step 7: Continue program
        System.out.println("\nProgram continues...");
    }
}
