package maratonajava.excecao.checked;
import java.io.File;
import java.io.IOException;

public class CheckedTeste {
    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void createFile() throws IOException{
        File file= new File("\\Users\\Douglas Silva\\Desktop\\Teste2.txt");
        try{
            System.out.println(file.createNewFile()?"Criado!": "Não criado!");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
