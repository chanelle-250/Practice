import javax.imageio.IIOException;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;


public class WriteToFile {
    public static void main(String[] args) {
        List <Student>students = new ArrayList<Student>();

        students.add(new Student("chanelle",90));
        students.add(new Student("david",90));

        String filename = "C:\\Users\\irako\\IdeaProjects\\practice\\src\\trial.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Student score : students) {
                System.out.println(students.indexOf(score));
                bw.write(score.toString());
                bw.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }



}
