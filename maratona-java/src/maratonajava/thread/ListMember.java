package maratonajava.thread;
import java.util.LinkedList;
import java.util.Queue;

public class ListMember {
    private Queue<String> emails= new LinkedList<>();
    private boolean isOpen= true;
    
    public void addEmails(String email){
        synchronized(this.emails){
            this.emails.add(email);
            System.out.println("Notificando Threads que estão à espera");
            this.emails.notifyAll();
        }
    }
    public String receberEmail(){
        String email= null;
        try{
            synchronized(this.emails){
                while(this.emails.size() == 0){
                    if(!this.isOpen) return null;
                    System.out.println(Thread.currentThread().getName() + " estou em modo wait!");
                    this.emails.wait();         //QUANDO ELE É NOTIFICADO, VOLTA PRA CÁ
                }
                email= this.emails.poll();
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return email;
    }
    public synchronized int emailsPendentes(){
        return this.emails.size();
    }

    public boolean isOpen() {
        return isOpen;
    }
    
    public  void closeBox(){
        this.isOpen= false;
        System.out.println("Notificando as Threads e fechando a lista");
        synchronized(this.emails){
        this.emails.notifyAll();
        }
    }
}

