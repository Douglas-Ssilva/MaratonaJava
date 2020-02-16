package maratonajava.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReetranLockk {
    public static void main(String[] args) {
       ReentrantLock reetranLock= new ReentrantLock();
        new Thread(new Worker("A#", reetranLock)).start();
        new Thread(new Worker("B#", reetranLock)).start();
        new Thread(new Worker("C#", reetranLock)).start();
        new Thread(new Worker("D#", reetranLock)).start();
        new Thread(new Worker("E#", reetranLock)).start();
        new Thread(new Worker("F#", reetranLock)).start();
        new Thread(new Worker("G#", reetranLock)).start();

    }
    static class Worker implements Runnable {

        private String name;
        private ReentrantLock reetranLock;

        public Worker(String name, ReentrantLock reetranLock) {
            this.name = name;
            this.reetranLock = reetranLock;
        }

        @Override
        public void run() {
            this.reetranLock.lock();
            try {
                if (this.reetranLock.isHeldByCurrentThread()) {
                    System.out.printf("%s entrou em sessão crítica%n", this.name);
                    System.out.printf("%d Thread em espera%n", this.reetranLock.getQueueLength());
                    System.out.printf("%s vai trabalhar por 4 segundos%n", this.name);
                    Thread.sleep(4000);
                    System.out.printf("%s finalizou o trabalho%n%n", this.name);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();

            } finally {
                this.reetranLock.unlock();
            }
        }
    }

}
