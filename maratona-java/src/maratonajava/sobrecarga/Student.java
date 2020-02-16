package maratonajava.sobrecarga;
 
import java.util.Arrays;

public class Student {
    private String name;
    private int mat;
    private double [] grades;

    public Student(String name, int mat) {
        this.name = name;
        this.mat = mat;
    }
    
    public Student(String name, int mat, double[] grades) {
        this(name, mat);
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", mat=" + mat + ", grades=" + Arrays.toString(grades) + '}';
    }
    
    
    
}
