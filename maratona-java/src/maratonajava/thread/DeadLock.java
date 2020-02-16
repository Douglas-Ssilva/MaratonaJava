package maratonajava.thread;

public class DeadLock {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    private static class Thread1 extends Thread {

        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1 com Lock1");
                System.out.println("Thread1 esperando Lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread1 com Lock2 e Lock1");
                }
            }
        }
    }

    private static class Thread2 extends Thread {

        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread2 com Lock1");
                System.out.println("Thread2 esperando Lock2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread2 com Lock2 e Lock1");
                }
            }
        }
    }
//    HOUVE DEADLOCK
//    private static class Thread2 extends Thread {
//
//        @Override
//        public void run() {
//            synchronized (lock2) {
//                System.out.println("Thread2 com Lock2");
//                System.out.println("Thread2 esperando Lock1");
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (lock1) {
//                    System.out.println("Thread2 com Lock1 e Lock2");
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

}
