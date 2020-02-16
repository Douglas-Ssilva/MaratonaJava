package maratonajava.nio;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizePat {

    public static void main(String[] args) {
        Path dir = Paths.get("\\home\\dev");
        Path file = Paths.get("arquivo.txt");
        Path resul = dir.resolve(file);
        System.out.println(resul);
        
        //O PROBLEMA É QUANDO TEMOS CAMINHOS ABSOLUTOS E RELATIVOS
        Path absoluto = Paths.get("/home/dev");
        Path relativo = Paths.get("dev");
        Path arquivo = Paths.get("teste.txt");
        
//        Relativo pode ser conectado ao absoluto
        
        System.out.println(absoluto.resolve(relativo)); // \home\dev\dev
        System.out.println(absoluto.resolve(arquivo)); // \home\dev\teste.txt
        System.out.println(relativo.resolve(absoluto));// \home\dev  --caminho absoluto não precisa de nada antes dele.
        System.out.println(relativo.resolve(arquivo)); // dev\teste.txt
        System.out.println(arquivo.resolve(absoluto)); // \home\dev
        System.out.println(arquivo.resolve(relativo)); // teste.txt\devv --não válido
        

    }

}
