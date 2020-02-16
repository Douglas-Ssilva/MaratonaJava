package maratonajava.thread;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ThreadSafeeSynchronized {
//    RETORNA MÉTODOS SINCRONIZADOS, MAS NÃO PODEMOS CONFIAR MUITO, COLOCANDO SYNCHRONIZED NOS MÉTODOS RESOLVO
//    private List<String> list = Collections.synchronizedList(new LinkedList<>());
    private List<String> list = new LinkedList<>();

    public synchronized void add(String s) {
        this.list.add(s);
    }

    public synchronized void remover() {
        System.out.println(Thread.currentThread().getName() + " iniciei");
        if (this.list.size() > 0) {
        System.out.println(Thread.currentThread().getName() + " entrei no if");
            System.out.println(Thread.currentThread().getName()+ " eu apaguei: " + this.list.remove(0));
        }
        System.out.println(Thread.currentThread().getName() + " acabei");
    }
}
//Thread-1 iniciei
//Thread-0 iniciei
//Thread-1 entrei no if
//Thread-0 entrei no if
//Thread-1 eu apaguei: Maria
//Thread-1 acabei
//Exception in thread "Thread-0" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0

public class ThreadSafe {

    public static void main(String[] args) {
        ThreadSafeeSynchronized tf = new ThreadSafeeSynchronized();
        tf.add("Maria");

        class RemovedorDeNomes extends Thread {
            @Override
            public void run() {
                tf.remover();
            }
        }
        new RemovedorDeNomes().start();
        new RemovedorDeNomes().start(); 
    }
}
