package maratonajava.excecao.checked;
import java.io.File;
import java.io.IOException;

public class Filee {
    public static void main(String[] args) {
        File file= new File("\\Users\\Douglas Silva\\Desktop\\Teste2.txt");
        
        try {
            System.out.println(file.createNewFile() ? "Criado com sucesso!" : "Não foi criado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
