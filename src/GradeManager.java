public class GradeManager {
        public void printGrades(int[] grades) {
            System.out.print("Grades: ");
            for (int grade : grades) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }


        public void sortGrades(int[] grades) {
            java.util.Arrays.sort(grades);
            System.out.println("Grades have been sorted.");
        }


        public int searchGrade(int[] grades, int target) {
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] == target) {
                    return i;
                }
            }
            return -1; // if not found
        } public void getGrade(int[] grades, int index) {
        try {
            System.out.println("Grade at index " + index + ": " + grades[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }
}

