package maratonajava.thread;

public class DriverConta implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        DriverConta contaTest = new DriverConta();
        Thread douglas = new Thread(contaTest, "Douglas");
        Thread inez = new Thread(contaTest, "Inez");
        douglas.start();
        inez.start();
    }

    public static void imprime() {
        synchronized (DriverConta.class) {
            System.out.println("asasaas");
        }
    }

    private void saque(int valor) {
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar");
                conta.saque(valor);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Oh meu deus!");
            }
        }
    }
}


