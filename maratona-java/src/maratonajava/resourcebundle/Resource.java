package maratonajava.resourcebundle;
 
import java.util.Locale;
import java.util.ResourceBundle;

public class Resource {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle rb =ResourceBundle.getBundle("messeges", new Locale("en", "US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));               //pega do genérico
        
        //Criei uma nova messege PT
        rb= ResourceBundle.getBundle("messeges", new Locale("pt", "BR"));//usando a locale pt BR
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));
        
        
        
        
        
    }
    
}
