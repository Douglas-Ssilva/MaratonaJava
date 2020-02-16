package maratonajava.thread;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueTransfer {
    public static void main(String[] args) {
        TransferQueue<String> transfer= new LinkedTransferQueue<>();
        System.out.println(transfer.add("Douglas"));
        System.out.println(transfer.offer("Inez"));
        try {
            System.out.println(transfer.offer("Igor", 10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            transfer.put("Geraldo");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
//        Tente transferir esse elemento
//        transfer.transfer("Douglas");
        System.out.println(transfer.peek());
        System.out.println(transfer.poll());
        System.out.println("Capacidade :"+ transfer.remainingCapacity());
    }
    
}
