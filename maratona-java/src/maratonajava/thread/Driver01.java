package maratonajava.thread;

class ThreadTeste extends Thread{
    private char c;
    
    public ThreadTeste(char c) {
        this.c= c;
    }
    @Override
    public void run(){
        int index= 1;
        while(index <= 5){
            System.out.println(this.c + " " + index);
            index++;
        }
    }
    
}
class ThreadRunnable implements Runnable{
    private char c;
    
    public ThreadRunnable(char c) {
        this.c= c;
    }
    @Override
    public void run() {
        int index= 1;
        while(index <= 5){
            System.out.println(this.c + " " + index);
            Thread.yield();
            index++;
        }
    }
    
}

public class Driver01 {
    public static void main(String[] args) {
//        ThreadTeste t1= new ThreadTeste('A');
//        ThreadTeste t2= new ThreadTeste('B');
//        t1.start();
//        t2.start();
        
        Thread t= new Thread(new ThreadRunnable('A'));
        Thread t1= new Thread(new ThreadRunnable('B'));
//        t1.setPriority(Thread.MAX_PRIORITY);          //NÃO É GARANTIDO
        t.start();
        //ESPERE O A EXECUTAR, PRA COMEÇAR O B
//        try{
//            t.join();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
        t1.start();
    }
    
}
