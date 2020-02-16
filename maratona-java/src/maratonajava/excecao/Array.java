package maratonajava.excecao;
public class Array {
    public static void main(String[] args) {
        int [] num= new int[4];
        
        try{
            System.out.println(num[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Índice inexistente: " + e.getMessage());
        }
    }
    
}
