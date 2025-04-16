public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(1, "Alice");

        manager.addStudent(-1, "Charlie");

        manager.searchStudent(2);

        manager.removeStudent(0);

        manager.sortStudents();


        manager.findStudentWithHighestId();
        manager.findStudentWithLowestId();
    }
}
