package maratonajava.thread;
 
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
public class CopyOnWriteArray implements Runnable{
    private List<Integer> list= new CopyOnWriteArrayList<>();
//    private Set<Integer> set= new CopyOnWriteArraySet<>();

    public CopyOnWriteArray() {
        for (int i = 0; i < 900; i++) {
            list.add(i);
        }
    }

    @Override
    public void run() {
            Iterator<Integer> iterator= list.iterator();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
//Não se pode remover, nem adicionar usando o iterator
        while(iterator.hasNext()){
            System.out.println(Thread.currentThread().getName() + " " + iterator.next());
        }
    }

    public List<Integer> getList() {
        return list;
    }
    
    public static void main(String[] args) {
        CopyOnWriteArray c= new CopyOnWriteArray();
        Thread t1= new Thread(c);
        Thread t2= new Thread(c);
        
        t1.start();
        t2.start();
    }
    
}
