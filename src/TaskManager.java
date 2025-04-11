
import java.util.ArrayList;
import java.util.Collections;

public class TaskManager {
    ArrayList<String> tasks = new ArrayList<>();


    public void addTask(String task) {
        if (task.isEmpty()) {
            System.out.println("Error: Task cannot be empty!");
        } else {
            tasks.add(task);
            System.out.println("Task added: " + task);
        }
    }


    public void sortTasks() {
        Collections.sort(tasks);
        System.out.println("Tasks sorted.");
    }


    public void searchTask(String task) {
        if (tasks.contains(task)) {
            System.out.println(" Task found at index: " + tasks.indexOf(task));
        } else {
            System.out.println("Task not found.");
        }
    }


    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println(" Task removed: " + task);
        } else {
            System.out.println(" Cannot remove. Task not found.");
        }
    }

    // Find the longest task
    public void longestTask() {
        if (tasks.isEmpty()) {
            System.out.println(" No tasks available.");
            return;
        }
        String longest = "";
        for (String t : tasks) {
            if (t.length() > longest.length()) {
                longest = t;
            }
        }
        System.out.println("Longest task: " + longest);
    }


    public void getTask(int index) {
        try {
            System.out.println ("Task at index " + index + ": " + tasks.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Error: Index out of bounds!");
        }
    }


    public void showTasks() {
        System.out.println(" All tasks: " + tasks);
    }
}


