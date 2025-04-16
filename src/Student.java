public class Student {
    public String fname;
    public int marks;

    public Student(String fname, int marks) {
        this.fname = fname;
        this.marks = marks;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString() {
        return "Student [fname=" + fname + ", marks=" + marks + "]";

    }
}
