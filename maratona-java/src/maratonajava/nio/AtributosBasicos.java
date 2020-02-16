package maratonajava.nio;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicos {

    public static void main(String[] args) {
        //Com o Calendar, primeiro usaria o Calendar.getInstance(). E depois setaria a data. Assim faço com uma linha
        Date data = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("C:\\Users\\Douglas Silva\\Desktop\\ProvaFile.txt");
        try {
            file.createNewFile();
            file.setLastModified(data.getTime());   //getTime retorna um long
//            System.out.println(new Date(file.lastModified()));      //Transforme pra data esse Long
            file.delete();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Path path = Paths.get("C:\\Users\\Douglas Silva\\Desktop\\ProvaPath.txt");
        try {
            Files.createFile(path);
            FileTime filetime = FileTime.fromMillis(data.getTime());     //retorna um long
            Files.setLastModifiedTime(path, filetime);
            System.out.println(Files.getLastModifiedTime(path));
            Files.deleteIfExists(path);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        path = Paths.get("C:\\Users\\Douglas Silva\\Desktop\\ProvaPath.txt");
        try {
            Files.createFile(path);
            System.out.println("Permissão para escrever? " + Files.isWritable(path));
            System.out.println("Permissão para executar? " + Files.isExecutable(path));
            System.out.println("Permissão para escrever? " + Files.isReadable(path));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        BasicFileAttributes attributesBasics;
        try {
            attributesBasics = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("When create? " + attributesBasics.creationTime());
            System.out.println("When was last access? " + attributesBasics.lastAccessTime());
            System.out.println("When was modified? " + attributesBasics.lastModifiedTime());
//            System.out.println("É diretório? " + attributesBasics.isDirectory());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("==============================================");

        try {
            attributesBasics = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime lastModified = attributesBasics.lastModifiedTime();
            FileTime create = attributesBasics.creationTime();
            FileTime lastAccess = FileTime.fromMillis(System.currentTimeMillis()); //data atual
            BasicFileAttributeView modificar = Files.getFileAttributeView(path, BasicFileAttributeView.class);
            modificar.setTimes(lastModified, lastAccess, create);
            attributesBasics = Files.readAttributes(path, BasicFileAttributes.class); //aqui pega essas modificações
            System.out.println("When create? " + attributesBasics.creationTime());
            System.out.println("When was last access? " + attributesBasics.lastAccessTime());
            System.out.println("When was modified? " + attributesBasics.lastModifiedTime());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
