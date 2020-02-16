package maratonajava.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantEmail {
    private Queue<String> emails = new LinkedList<>();
    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final Condition condition = reentrantLock.newCondition();
    private boolean isOpen = true;

    public void addEmails(String email) {
        this.reentrantLock.lock();
        try {
            this.emails.add(email);
            System.out.println("Notificando Threads que estão à espera");
            this.condition.signalAll();     //SUBSTITUI O NOTIFYALL
        } finally {
            this.reentrantLock.unlock();
        }
    }


    public String receberEmail() {
        String email = null;
            this.reentrantLock.lock();
            try {
                while (this.emails.size() == 0) {
                    if (!this.isOpen) {
                        return null;
                    }
                    System.out.println(Thread.currentThread().getName() + " estou em modo wait!");
                    this.condition.await();        //SUBSTITUI O WAIT
                }
                email = this.emails.poll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
                this.reentrantLock.unlock();
            }
        return email;
    }

    public synchronized int emailsPendentes() {
        return this.emails.size();
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void closeBox() {
        this.isOpen = false;
        System.out.println("Notificando as Threads e fechando a lista");
        this.reentrantLock.lock();
        try{
            this.condition.signalAll();
            
        }finally{
        this.reentrantLock.unlock();
            
        }
    }

}
