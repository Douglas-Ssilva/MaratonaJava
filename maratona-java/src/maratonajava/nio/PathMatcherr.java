package maratonajava.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

class FindAllTest extends SimpleFileVisitor<Path>{

//    QUALQUER COISA ANTES SEGUIDO DE DRIVER COM . JAVA OU CLASS
    PathMatcher pm= FileSystems.getDefault().getPathMatcher("glob:**/*{Driver}.{java,class}");
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes bfa) throws IOException {
        if(pm.matches(path)){
            System.out.println(path.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
    
}
public class PathMatcherr {

    public static void main(String[] args) {
        //Não encontra pois tem o path inteiro, e ele olha isso
        Path path = Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta\\teste.txt");
        Path path1 = Paths.get("teste.txt");
        Path path2 = Paths.get("Douglas-Silva");

        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");         //glob é o padrão, * não considera /
//        System.out.println(matcher.matches(path));  //false
//        System.out.println(matcher.matches(path1)); //true
        matches(path, "glob:**.txt");           //** quer dizer qualquer coisa que venha antes, seguido de um arquivo .txt

//        SABER SE A EXTENSÃO POSSUI EXATAMENTE 3 CARACTERES
        System.out.println("================");
        matches(path, "glob:**.???");
        matches(path, "glob:**/*.???");
        
        System.out.println("================");
//        OU UM OU OUTRO
        matches(path2, "glob:{Douglas*,Silva*}");
        matches(path2, "glob:{Douglas,Silva}*");
        matches(path2, "glob:{Douglas,Silva}");     //só da true se o path conter um ou outro.
        
//        BUSCANDO FILES
        try {
            Files.walkFileTree(Paths.get("C:\\Users\\Douglas Silva\\Documents\\NetBeansProjects\\MaratonaJava"), new FindAllTest());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        }
    }

    private static void matches(Path path, String gloob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(gloob);
        System.out.println("Pattern: " + gloob);
        System.out.println(matcher.matches(path));

    }

}
