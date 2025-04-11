//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskManager task = new TaskManager();


        task.addTask("Do homework");
        task.addTask("");
        task.addTask("Write report");


        task.showTasks();


        task.sortTasks();
        task.showTasks();

        task.searchTask("Do homework");
        task.searchTask("Cook dinner");


        task.removeTask("Write report");
        task.removeTask("Go jogging");


        task.longestTask();


        task.getTask(0);
        task.getTask(5);
    }
}





