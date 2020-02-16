package maratonajava.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;


public class IDosFileAtrributes {
    public static void main(String[] args) {
        Path path= Paths.get("C:\\Users\\Douglas Silva\\Desktop\\ProvaFile.txt");
        
        try {
//            Files.createFile(path);
            Files.setAttribute(path,"dos:hidden", true);        //adicionando um atributo oculto
            Files.setAttribute(path,"dos:readonly", true);      //adicionando um atributo de somente leitura
            DosFileAttributes dos= Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
            
            Files.setAttribute(path,"dos:hidden", false);        //adicionando um atributo oculto
            Files.setAttribute(path,"dos:readonly", false);  
            dos= Files.readAttributes(path, DosFileAttributes.class);       //se não fizer a leitura dos atributos nao pega
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
            
//            COM A DOSVIEW
            DosFileAttributeView dosView= Files.getFileAttributeView(path, DosFileAttributeView.class);
            dosView.setHidden(true);
            dosView.setReadOnly(true);
            dos= Files.readAttributes(path, DosFileAttributes.class);        
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
