package maratonajava.zipandofiles;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoFiles {
    public static void main(String[] args) {
        Path zipDestiny= Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta");  //zip ficará aqui
        Path pathFiles= Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta\\Subpasta\\Subsubpasta"); //path dos files
        Path zipFile= zipDestiny.resolve("Arquivo.zip");          //nome do arquivo zip. ZipDestiny pois o zip ficará lá dentro
        
        try(ZipOutputStream zip= new ZipOutputStream(new FileOutputStream(zipFile.toFile()));  //CRIA O ZIP
            DirectoryStream<Path> strem= Files.newDirectoryStream(pathFiles)){
            for(Path p: strem){
                //COLOCANDO ENTRADAS NO ZIP
                ZipEntry enter= new ZipEntry(zipFile.getFileName().toString());
                zip.putNextEntry(enter);
                FileInputStream fi= new FileInputStream(p.toFile());
                byte vetor []= new byte[2018];
                int read;
                while((read= fi.read(vetor)) > 0){      //enquanto estiver bytes p serem lidos
                    zip.write(vetor, 0, read);
                }
                zip.closeEntry();
                fi.close();
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
