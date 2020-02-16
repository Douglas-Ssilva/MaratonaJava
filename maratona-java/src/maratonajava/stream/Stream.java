package maratonajava.stream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    
public static void main(String[] args) {
//        recorder();
//        reader();
//        recorderPowerful();
            readerPowerful();
        
    }
    private static void recorder(){
        byte [] vetor= {68,69,70,71,72};
        try(FileOutputStream fs= new FileOutputStream("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta\\TesteStrem.txt")){
//            for(byte b: vetor){
//                fs.write(b);
//            }
        fs.write(vetor);
            System.out.println("Dados gravados com sucesso!");
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private static void reader(){
        try(FileInputStream fi= new FileInputStream("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta\\TesteStrem.txt")){
            int read;                   //o método read retorna um int
            while((read= fi.read()) != -1){     //ao terminar de ler retorna -1
                byte b= (byte) read;
                System.out.println(b+ " ");
            }
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
//    TRABALHANDO DE FORMA MAIS OTIMIZADA COM O BUFFERED
    private static void recorderPowerful() {
//        FileOutputStream f= new FileOutputStream("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta\\TesteStrem.txt");
//        BufferedOutputStream b= new BufferedOutputStream(f);
//        É A MESMA COISA DA LINHA ABAIXO
        byte [] vetor= {68,69,70,71,72};
        //5000 tamanho do meu buffer
        try(BufferedOutputStream buffer= new BufferedOutputStream(new FileOutputStream("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta\\TesteStremOut.txt"), 5000)){
            buffer.write(vetor);
            buffer.flush();             //força tudo que tiver buferizado a sair.
            System.out.println("Dados gravados!!!");
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private static void readerPowerful(){
        try(BufferedInputStream bi= new BufferedInputStream(new FileInputStream("C:\\Users\\Douglas Silva\\Desktop\\Nova pasta\\TesteStremOut.txt"))){
            int read;
            while((read= bi.read()) != -1){
                byte b= (byte) read;
                System.out.println(b);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}