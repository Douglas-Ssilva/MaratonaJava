package maratonajava.thread;
 
public class Entregador implements Runnable{
    //ASSOCIAÇÃO
    private ListMember listMember;

    public Entregador(ListMember listMember) {
        this.listMember = listMember;
    }
    
    @Override
    public void run() {
        String nome= Thread.currentThread().getName();
        boolean isAberta= this.listMember.isOpen();
        int qtdEmailsPendentes= this.listMember.emailsPendentes();
        System.out.println(nome + " comecei a entrega!");
        
        while(isAberta || qtdEmailsPendentes > 0){
            try{
                String email= this.listMember.receberEmail();
                if(email != null){
                    System.out.println(nome + " enviando email para: " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para: " + email + " concluido com sucesso!");
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            isAberta= this.listMember.isOpen();
            qtdEmailsPendentes= this.listMember.emailsPendentes();
        }
        System.out.println("Task finished!");
        
    }
    
}
