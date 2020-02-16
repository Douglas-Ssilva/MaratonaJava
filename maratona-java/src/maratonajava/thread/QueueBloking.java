package maratonajava.thread;
 
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class QueueBloking {
    public static void main(String[] args) {
        //SOMOS OBRIGADO A PASSAR O TAMANHO, ESTOURANDO A CAPACIDADE FICA EM ESTADO BLOCKING
        BlockingQueue<String> block= new ArrayBlockingQueue<>(1);
        Thread t1= new Thread(new Removedor(block));
        try {
            block.put("Douglas");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Tentando colocar outro valor...");
        t1.start();
        try {
            block.put("Inez");      //COMO O TAMANHO SE LIMITA A 1, FICA ESPERANDO OUTRA THREAD REMOVER O VALOR
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Inez adicionado com sucesso!");
        
    }
    static class Removedor implements Runnable{
        private BlockingQueue<String> bq;

        public Removedor(BlockingQueue<String> bq) {
            this.bq = bq;
        }
        
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Removendo o elemento: "+ bq.take());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
}
