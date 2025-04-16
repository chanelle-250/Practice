import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;


import java.util.*;

public class StudentManager {
    private Map<Integer, String> studentMap = new HashMap<>();


    public void addStudent(int id, String name) {
        try {
            if (id <= 0 || name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("ID must be > 0 and name must not be empty.");
            }
            studentMap.put(id, name);
            System.out.println(" Student added: ID = " + id + ", Name = " + name);
        } catch (IllegalArgumentException e) {
            System.out.println(" Error: " + e.getMessage());
        } finally {
            System.out.println(" Add operation attempted.\n");
        }
    }


    public void sortStudents() {
        TreeMap<Integer, String> sorted = new TreeMap<>(studentMap);
        System.out.println(" Sorted Students:");
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }


    public void searchStudent(int id) {
        if (studentMap.containsKey(id)) {
            System.out.println(" Found: ID = " + id + ", Name = " + studentMap.get(id));
        } else {
            System.out.println(" Student ID " + id + " not found.");
        }
    }


    public void removeStudent(int id) {
        if (studentMap.remove(id) != null) {
            System.out.println(" Removed student with ID = " + id);
        } else {
            System.out.println(" No student with ID = " + id);
        }
    }


    public void findStudentWithHighestId() {
        if (!studentMap.isEmpty()) {
            int maxId = Collections.max(studentMap.keySet());
            System.out.println(" Highest ID: " + maxId + ", Name = " + studentMap.get(maxId));
        } else {
            System.out.println("️ No students available.");
        }
    }


    public void findStudentWithLowestId() {
        if (!studentMap.isEmpty()) {
            int minId = Collections.min(studentMap.keySet());
            System.out.println("Lowest ID: " + minId + ", Name = " + studentMap.get(minId));
        } else {
            System.out.println(" No students available.");
        }
    }
}













