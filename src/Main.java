//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Calculator cal =new Calculator();
//
//System.out.println("10.0+5.0="+cal.add(10.0,5.0));
//System.out.println("10.0-5.0="+cal.subtract(10.0,5.0));
//System.out.println("10.0*5.0="+cal.multiply(10.0,5.0));
//System.out.println("10.0/5.0="+cal.divide(10.0,5.0));
//System.out.println("10.0/0.0="+cal.divide(10.0,0.0));
//System.out.println("12.0/-2.0="+cal.divide(12.0,-2.0));Calculator cal =new Calculator();
//

            int[] grades = {85, 90, 78, 92, 88};

            GradeManager gm = new GradeManager();

            gm.printGrades(grades);

            gm.sortGrades(grades);
            gm.printGrades(grades);

            int result = gm.searchGrade(grades, 88);
            if (result != -1) {
                System.out.println("Grade 88 found at index: " + result);
            } else {
                System.out.println("Grade not found.");
            }

            gm.getGrade(grades, 2);


            gm.getGrade(grades, 10);
        }
    }

