package maratonajava.io;
import java.io.File;
import java.io.IOException;

public class FileDirectory {
    public static void main(String[] args) {
        //CRIANDO UM DIRETÓRIO
        /*File diretorio = new File("C:\\Users\\Douglas Silva\\Desktop\\Folder2");
        System.out.println("Diretório criado? " + diretorio.mkdir());
        //RENAME DIRETÓRIO
        File diretorio2= new File("C:\\Users\\Douglas Silva\\Desktop\\Folder");
        System.out.println(diretorio.renameTo(diretorio2));
        //POSSO PASSAR O CAMINHO ABSOLUTO, OU SOMENTE O NOME DA PASTA CRIADA
        
        File file = new File(diretorio, "Prova.txt");
        try {
            System.out.println("Arquivo criado?" + file.createNewFile());
            File file2 = new File(diretorio, "Prova2.txt");
            file.renameTo(file2);           //renomeando o arquivo
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/
        searchFile();

    }
    public static void searchFile(){
        //FAZ-SE NECESSÁRIO PASSAR TODO O CAMINHO PRA ELE ENCONTRAR
        File search= new File("C:\\Users\\Douglas Silva\\Desktop\\Folder");
        String [] vetor= search.list();         //colocando os arquivos em uma lista
        for(String s: vetor){
            System.out.println(s);
        }
    }

}
