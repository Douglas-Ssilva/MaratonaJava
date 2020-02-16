package maratonajava.thread;
 
public class Conta{
    private int saldo = 50;

    public int getSaldo() {
        return this.saldo;
    }

    public void saque(int valor) {
        this.saldo -=valor;
    }
    
    
    /*private int saldo= 50;
    
    //GARANTO QUE NEM UMA OUTRA ATRAPALHARÁ ESSA THREAD ATUAL
    //APENAS UMA THREAD IRÁ EXECUTAR
    private synchronized void saque(int value){
        if(this.saldo >= value){
            System.out.println(Thread.currentThread().getName() + " sacou " + value);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            this.saldo-= value;
        }else{
            System.out.println("Sem saldo para :" + Thread.currentThread().getName());
        }
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if(this.saldo <= 0){
                System.out.println(Thread.currentThread().getName()+ " acabou o dinheiro!");
            }
                
        }
        
    }*/
    
}
