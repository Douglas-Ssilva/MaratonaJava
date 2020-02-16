package maratonajava.excecao.mutiploscatch;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Multiplso {

    public static void main(String[] args) {
        //EXCEPTIONS CHECKED
        Object c = null;
        try {
            throw new ClassCastException();
//            System.out.println(c.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("Dentro do NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");

        }

        //EXCEPTIONS CHECKED
        try {
            checked();
        } catch (SQLException e) {

        } catch (FileNotFoundException e) {
        }

    }

    public static void checked() throws SQLException, FileNotFoundException {

    }

}
