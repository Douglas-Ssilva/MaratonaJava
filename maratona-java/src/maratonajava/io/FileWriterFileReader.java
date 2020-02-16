package maratonajava.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFileReader {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Douglas Silva\\Desktop\\File.txt");
//        try {
//            FileWriter fw = new FileWriter(file);        //p escrever no arquivo, sobrescreve tudo que já existir
//            FileWriter fw= new FileWriter(file, true);    //deixando o append true, ou seja, irá acrescentar ao fim do arquivo  
//            fw.write("Escrevendo no arquivo que criei por meio do NetBeans.\nJava impressiona!\nObrigado Java!\nI love Java.\n");
//            fw.flush();                 //cuspa tudo que estiver no túnel, ficou p trás
//            fw.close();                 //fechar escrita
//
//            FileReader fr = new FileReader(file);        //passo o arquivo que quero ler
//            char[] chars = new char[500];
//            fr.read(chars);
//            for (char c : chars) {
//                System.out.print(c);
//            }
//            fr.close();                 //fechar após a leitura
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//        COM TRY WITH RESOURCES NÃO PRECISO FICAR FECHANDO O ARQUIVO MANULMENTE
        try (FileWriter fw = new FileWriter(file);
                FileReader fr = new FileReader(file);) {
            fw.write("Escrevendo no arquivo que criei por meio do NetBeans.\nJava impressiona!\nObrigado Java!\nI love Java.\n");
            fw.flush();

            char[] chars = new char[500];
            int size= fr.read(chars);
            System.out.println("Tamanho do arquivo: " + size);
            for (char c : chars) {
                System.out.print(c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
