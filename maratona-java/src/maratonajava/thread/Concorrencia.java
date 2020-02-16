package maratonajava.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Increment {

    private int count;
    //USO O ATOMIC NO LUGAR DO SINCRONISMO, GANHO MAIS PERFORMANCE
    private AtomicInteger atomic = new AtomicInteger();
    //CONSIGO DEFINIR TEMPO PARA TENTAR CONSEGUIR O LOCK DO OBJETO, SINCRONISMO TEM QUE ESPERAR O TEMPO TODO
    private Lock lock = new ReentrantLock();

    public void increment() {
        try {
            this.lock.lock();       //OBTENDO O LOCK
            this.count++;
            this.atomic.getAndIncrement();
        } finally {
            this.lock.unlock();     //LIBERANDO O LOCK
        }
    }

    public int getCount() {
        return count;
    }

    public int getAtomic() {
        return atomic.intValue();
    }
}

class IncrementThread extends Thread {

    private Increment increment;

    public IncrementThread(Increment increment) {
        this.increment = increment;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            this.increment.increment();
        }
    }

}

public class Concorrencia {

    public static void main(String[] args) {
        Increment increment = new Increment();
        IncrementThread t1 = new IncrementThread(increment);
        IncrementThread t2 = new IncrementThread(increment);

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(increment.getCount());
        System.out.println(increment.getAtomic());
    }

}
