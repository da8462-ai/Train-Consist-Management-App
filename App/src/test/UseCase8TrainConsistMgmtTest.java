package test;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

class TrainConsistManagementAppTest {
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

    // ---------------- Sample Data Method ----------------
    List<Bogie> createBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("B1", "Sleeper", 80));
        bogies.add(new Bogie("B2", "AC Chair", 70));
        bogies.add(new Bogie("B3", "First Class", 60));
        bogies.add(new Bogie("B4", "Sleeper", 90));
        return bogies;
    }

    // ---------------- TEST CASES ----------------

    @Test
    void testFilter_CapacityGreaterThanThreshold() {

        List<Bogie> bogies = createBogies();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 70)
                .collect(Collectors.toList());

        assertEquals(2, result.size()); // 80, 90
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {

        List<Bogie> bogies = createBogies();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 70)
                .collect(Collectors.toList());

        boolean containsEqual = result.stream()
                .anyMatch(b -> b.getCapacity() == 70);

        assertFalse(containsEqual);
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {

        List<Bogie> bogies = createBogies();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 70)
                .collect(Collectors.toList());

        boolean hasLess = result.stream()
                .anyMatch(b -> b.getCapacity() < 70);

        assertFalse(hasLess);
    }

    @Test
    void testFilter_MultipleBogiesMatching() {

        List<Bogie> bogies = createBogies();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertEquals(3, result.size()); // 70, 80, 90
    }

    @Test
    void testFilter_NoBogiesMatching() {

        List<Bogie> bogies = createBogies();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 100)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {

        List<Bogie> bogies = createBogies();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 50)
                .collect(Collectors.toList());

        assertEquals(4, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 70)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {

        List<Bogie> bogies = createBogies();
        int originalSize = bogies.size();

        bogies.stream()
                .filter(b -> b.getCapacity() > 70)
                .collect(Collectors.toList());

        assertEquals(originalSize, bogies.size());
    }
}