package maratonajava.assertivas;
 
public class Assertivas {
    public static void main(String[] args) {
        //ma(-9); 
        in(-9); 
    }
    private static void in(double salary) {     //USO QUANDO TENHO CERTEZA QUE NÃO PODERÁ CHEGAR TAL VALOR
       assert salary > 0;   
    }
    public static void ma(double salary) {
       if(salary <= 0){
           throw new IllegalArgumentException("Saláry hava to be bigger zero!");
       }   
    }
    
}
