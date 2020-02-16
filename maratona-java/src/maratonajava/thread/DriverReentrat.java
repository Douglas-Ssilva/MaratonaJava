package maratonajava.thread;
 
import javax.swing.JOptionPane;

public class DriverReentrat {
    public static void main(String[] args) {
        ReentrantEmail listMember= new ReentrantEmail();
        Thread entregador1= new Thread(new ReentratEntregador(listMember), "Entregador1");
        Thread entregador2= new Thread(new ReentratEntregador(listMember), "Entregador2");
        entregador1.start();
        entregador2.start();
        
        while(true){
            String email= JOptionPane.showInputDialog("Digite o email: ");
            if(email == null || email.isEmpty()){
                listMember.closeBox();
                break;
            }
            listMember.addEmails(email);
        }
    }
    
}
