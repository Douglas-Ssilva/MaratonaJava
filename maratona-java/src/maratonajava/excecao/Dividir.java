package maratonajava.excecao;

import java.io.IOException;

public class Dividir {

    public static void main(String[] args) {
        System.out.println(calc(0, 0));
        
        try{
        System.out.println(calc(6,0));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static int calc(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de 0!");
        }
        return number1 / number2;
    }

}
