import java.util.LinkedHashSet;

public class TrainApp {
    public static void main(String[] args) {

        // LinkedHashSet to store unique bogies in insertion order
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies to the train
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempting to add duplicate bogie
        trainFormation.add("Sleeper");

        // Display final train formation
        System.out.println("Final Train Formation:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}