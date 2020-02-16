package maratonajava.excecao.trywithresources;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {
    public static void main(String[] args) {
        try {
            in();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    //ANTES DO TRY WITH RESOURCES
    public static void ma() {
        Reader reader= null;
        try{
            reader= new BufferedReader(new FileReader("teste.txt"));
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
    }
    //COM ESSA NOVA VERSÃO, ELE CHAMA MEU MÉTODO DE FECHAR SEM QUE EU INVOQUE.
    public static void in() throws Exception{
        try(Teste1 teste1= new Teste1();
            Teste2 teste2= new Teste2()){
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
