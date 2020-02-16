package maratonajava.excecao.mutiploscatch;
import java.io.File;
import java.io.IOException;
public class APartirJava7 {
    
    public static void main(String[] args) {
        //in();
        
        try {
            ain();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void in() throws ArrayIndexOutOfBoundsException {
        int [] numeros= new int[2];
        Object p= null;
        try{
            System.out.println(p.toString());
            System.out.println(10/0);
            numeros[10]=1;
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    public static void ain() throws IOException{
        File file= new File("\\Users\\Douglas Silva\\Desktop\\Texte.doc");
        try{
            System.out.println(file.createNewFile()? "Create" :"Didn't Create");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
