package maratonajava.colecoes;
 
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {
    public static void main(String[] args) {
        //FILA
        Queue<Integer> queueNumbers= new PriorityQueue<>();
        queueNumbers.add(2);
        queueNumbers.add(3);
        queueNumbers.add(5);
        queueNumbers.add(1);
        
//        System.out.println(queueNumbers);
        Queue<String> queue= new PriorityQueue<>();
        queue.add("B");
        queue.add("D");
        queue.add("A");
        queue.add("C");
        
        System.out.println(queue);
        System.out.println(queue.size());
//        System.out.println("Mostre o primeiro elemento e o remova: "+ queue.poll());
//        System.out.println("Mostre o primeiro elemento e não remova: "+ queue.peek());
        System.out.println("Retorne e o remova: " + queue.remove());
        System.out.println(queue.size());
    }
    
}
