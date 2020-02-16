package maratonajava.serializacao;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serializacao {
    public static void main(String[] args) {
        recorderObject();
        readerObject();
    }

    public static void recorderObject() {
        //SALVANDO OBJETOS EM ARQUIVOS
        Student student = new Student(1l, "Douglas", "222");
        Class turma= new Class("Turma maluca");
        student.setTurma(turma);
        try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("student.ser"))) {//salvando o aluno em arquivo
            ob.writeObject(student);
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void readerObject() {
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student student = (Student) oi.readObject();
            System.out.println(student);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
