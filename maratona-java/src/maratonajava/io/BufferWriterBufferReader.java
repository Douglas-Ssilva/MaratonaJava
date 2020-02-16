package maratonajava.io;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterBufferReader {
    public static void main(String[] args) {
        File file= new File("C:\\Users\\Douglas Silva\\Desktop\\Teste2.txt");
//        
//        try {
//            FileWriter fw= new FileWriter(file);
//            BufferedWriter bw= new BufferedWriter(fw);
//            bw.write("Escrevendo a primeira linha...");
//            bw.newLine();               //nova linha independente o SO
//            bw.write("Escrevendo a segunda linha...");
//            bw.flush();
//            bw.close();
//            
//            FileReader fd= new FileReader(file);
//            BufferedReader br= new BufferedReader(fd);
//            String s;
//            while((s= br.readLine()) != null){      //realine,quando não há mais p ler, retorna null
//                System.out.println(s);
//            }
//            br.close();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
        //COM TRY WITH RESOURCES, DISPENSO MINHA VARIÁVEL DE REFERÊNCIA
        try(BufferedWriter bw= new BufferedWriter(new FileWriter(file));
            BufferedReader br= new BufferedReader(new FileReader(file))){
            //ESCREVENDO NO ARQUIVO
            bw.write("Linha com o try with resource");
            bw.newLine();
            bw.write("Nova linha com try with resource");
            bw.flush();
            
            //LEITURA DO ARQUIVO
            String s;
            while((s= br.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
