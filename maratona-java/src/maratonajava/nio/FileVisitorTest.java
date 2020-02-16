package maratonajava.nio;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

class findAllBkp extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes bfa){
        if(path.getFileName().toString().endsWith(".java")){ //getFile retorna um path, toString pois quero pegar a String
            System.out.println(path.getFileName());
        }
        return FileVisitResult.CONTINUE;        //vai até o fundo do diretório, e depois começa a voltar, de forma recursiva
    }
}

public class FileVisitorTest {
    public static void main(String[] args) {
        try {
//            Files.walkFileTree(Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta"), new findAllBkp());
            Files.walkFileTree(Paths.get("C:\\Users\\Douglas Silva\\Documents\\NetBeansProjects\\MaratonaJava"), new printDirs());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}

class printDirs extends SimpleFileVisitor<Path>{
    
     @Override
     public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes bfa) throws IOException {
         System.out.println("Pre: " + path);        //entra na pasta
//         if(path.getFileName().toString().equals("build")){
//         return FileVisitResult.TERMINATE;                  //se chegar nesta pasta, termine a execução
//         }
         return FileVisitResult.CONTINUE;
         
    }

     @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes bfa) throws IOException {
         System.out.println("File: " + path.getFileName());     //imprime arquivos
         return FileVisitResult.CONTINUE;
    }

     @Override
    public FileVisitResult visitFileFailed(Path path, IOException ioe) throws IOException {
         return FileVisitResult.CONTINUE;
    }

     @Override
    public FileVisitResult postVisitDirectory(Path path, IOException ioe) throws IOException {
         System.out.println("Post: " + path);       //caminho de volta
         return FileVisitResult.CONTINUE;
    }
    
}
