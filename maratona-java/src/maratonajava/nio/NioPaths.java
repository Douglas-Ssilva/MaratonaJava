package maratonajava.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NioPaths {

    public static void main(String[] args) {
        //HÁ VÁRIAS FORMAS PARA PEGAR O ARQUIVO
        Path p1 = Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Folder\\Prova.txt");
        Path p2 = Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Folder", "Prova.txt");
        Path p3 = Paths.get("C:", "Users\\Douglas Silva\\Desktop\\Folder", "Prova.txt");
        Path p4 = Paths.get("C:", "Users", "Douglas Silva", "Desktop", "Folder", "Prova.txt");
        System.out.println(p4.toAbsolutePath());            //pegando o caminho absoluto

//        CRIANDO DIRETÓRIOS
//        Path diretorio= Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Nio\\nio\\io");
        Path diretorio = Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Nio");
        Path file = Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Nio\\teste.txt");
        try {
            if (Files.notExists(diretorio)) {         //se o diretorio não existir, crie, senão lança exception
                Files.createDirectory(diretorio);       //para criar 1 diretório
            }
            if (Files.notExists(file)) {                
                Files.createFile(file);
            }
//            Files.createDirectories(diretorio);         //criar mais de um diretório
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        Path target= Paths.get("C:\\Users\\Douglas Silva\\Desktop\\Nio\\Arquivo copiado.txt");
        try {
//            Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING);           //copiando tudo que há no file para target
            Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING);           //sobrescreva o que já existe
//            Files.deleteIfExists(target);                           //delete se existe
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
