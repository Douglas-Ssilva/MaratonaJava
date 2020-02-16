package maratonajava.finall;
 
public class Driver {
    public static void main(String[] args) {
        Car c= new Car("Ford", "Blue");
        c.getBuyer().setName("Douglas");
        System.out.println(c);                          //mas consigo alterar qualquer valor naquela referência que ele criou.
        
        //c.buyer = new Buyer();                      //como meu objeto foi declarado como final, não consigo criar outra referência
    }                                                 //desse tipo
    
}
