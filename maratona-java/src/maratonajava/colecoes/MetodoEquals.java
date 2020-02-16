package maratonajava.colecoes;
 
public class MetodoEquals {
    public static void main(String[] args) {
        Celular c1= new Celular("Nokia","1112");
        Celular c2= new Celular("Nokia","1112");
        
        System.out.println(c1.equals(c2));
    }
    
}
