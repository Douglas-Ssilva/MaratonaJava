package maratonajava.excecao.myexception;
public class DriverException {

    public static void main(String[] args) {
        try {
            System.out.println(in());
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String in() throws MyException {
        String user = "goku";
        String userTyped = "goku";
        String password = "123";
        String passwordTyped = "13";

        if (!user.equals(userTyped) || !password.equals(passwordTyped)) {
            throw new MyException();
        }
        return "Logado!";
    }
}
