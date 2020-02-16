package maratonajava.io;
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class Ffile {
    public static void main(String[] args) {
        File file= new File("C:\\Users\\Douglas Silva\\Desktop\\File.txt");
        try {
            System.out.println("Criado? " + file.createNewFile());           //lança uma exception checked e me obriga tratar
            System.out.println("O arquivo exite? " + file.exists());
            System.out.println( "Tenho permissão p ler? " +  file.canRead());
            System.out.println( "Tenho permissão p escrever? " +file.canWrite());
            System.out.println( "O que passei ao construtor: " + file.getPath());
            System.out.println( "Caminho absoluto do arquivo: " + file.getAbsolutePath());
            System.out.println( "É um arquivo oculto? " + file.isHidden());
            System.out.println("Nome do arquivo: " + file.getName());
            System.out.println("Última modificação: " + new Date(file.lastModified()));     //retorna um long, transformo p data
            if(file.exists()){
                System.out.println("Arquivo deletado: " + file.delete());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
