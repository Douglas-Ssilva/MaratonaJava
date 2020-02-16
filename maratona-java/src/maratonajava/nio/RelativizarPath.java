package maratonajava.nio;
 
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarPath {
    public static void main(String[] args) {
        Path dir= Paths.get("home\\teste");
        Path classe= Paths.get("home\\teste\\Java\\Pessoa.java");
        Path result= dir.relativize(classe);
        System.out.println(result);     //Java\Pessoa.java, pego o que tenho em comum e elimino. Contrário resolve
        
        Path absoluto1= Paths.get("\\home\\bredrom");
        Path absoluto2= Paths.get("\\casa\\quarto");
        Path absoluto3= Paths.get("\\home\\bredrom\\java\\Classe.java");
        Path relativo1= Paths.get("temp");
        Path relativo2= Paths.get("temp\\Funcionario.java");
        
        System.out.println(absoluto1.relativize(absoluto2));    // ..\..\casa\quarto
        System.out.println(absoluto1.relativize(absoluto3));    // java/Classe.java
        System.out.println(absoluto2.relativize(absoluto1));    // ..\..\home\bredrom
        System.out.println(absoluto2.relativize(absoluto3));    // ..\..\home\bredrom\java\Classe.java
        System.out.println(absoluto3.relativize(absoluto1));    // ..\..
        System.out.println(absoluto3.relativize(absoluto2));    // ..\..\..\..\casa\quarto
        
//        SEMPRE QUE FIZER DE UM ABSOLUTO P UM RELATIVO HAVERÁ EXCEPTION
//        System.out.println(absoluto1.relativize(relativo1));   //java não sabe onde o temp está localizado
    }
    
}
