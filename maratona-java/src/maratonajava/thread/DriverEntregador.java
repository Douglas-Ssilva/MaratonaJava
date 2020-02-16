package maratonajava.thread;
 
import javax.swing.JOptionPane;

public class DriverEntregador {
    public static void main(String[] args) {
        ListMember listMember= new ListMember();
        Thread entregador1= new Thread(new Entregador(listMember), "Entregador1");
        Thread entregador2= new Thread(new Entregador(listMember), "Entregador2");
        entregador1.start();
        entregador2.start();
        
        while(true){
            String email= JOptionPane.showInputDialog("Digite o email: ");
            if(email == null){
                System.out.println("Email inválido!");
                break;
            }
            listMember.addEmails(email);
        }
    }
    
}
