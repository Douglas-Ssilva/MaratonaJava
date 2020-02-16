package maratonajava.nio;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathh {
    public static void main(String[] args) {
        //POR ALGUM MOTIVO, O CAMINHO DO ARQUIVO ESTÁ VINDO QUEBRADO EM STRINGS
        String diretorio= "C:\\Users\\Douglas Silva\\Desktop\\Nio\\Io\\OI";
        String file= "..\\..\\teste.txt";
        Path path= Paths.get(diretorio, file);
        System.out.println(path);//C:\Users\Douglas Silva\Desktop\Nio\Io\OI\..\..\teste.txt
        System.out.println(path.normalize());//C:\Users\Douglas Silva\Desktop\Nio\teste.txt
    }
    
}
