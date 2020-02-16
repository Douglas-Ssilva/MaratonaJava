package maratonajava.excecao;
public class Aritmetica {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println( "Fala na divisão: " + e.getMessage());
        }
        
    }
    
}
