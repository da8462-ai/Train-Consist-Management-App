import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Method to display bogie details
    void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

// Main class
public class TrainApp{
    public static void main(String[] args) {

        // List to store bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Adding passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Sorting bogies by capacity using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}