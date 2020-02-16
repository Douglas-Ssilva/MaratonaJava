package maratonajava.colecoes;
import java.util.ArrayList;
import java.util.List;

public class ListCelular {
    public static void main(String[] args) {
        Celular celular= new Celular("Galaxy s7", "1111");
        Celular celular1= new Celular("iPhone 6", "2222");
        Celular celular2= new Celular("Samsung 7", "3333");
        List <Celular> celulares= new ArrayList<>();
        celulares.add(celular);
        celulares.add(celular1);
        celulares.add(celular2);
        
        celulares.forEach((c) -> {
            System.out.println(c);
        });
        Celular celular4= new Celular("Samsung 7", "3333");
        System.out.println("Contém este celular? " + celulares.contains(celular4));
        System.out.println("Possuem o mesmo Imei? " + celular4.equals(celular2));
        System.out.println( "Possuem a mesma referência na memória? " +(celular4 == celular2));
        System.out.println( "Número de elementos: " + celulares.size());
        System.out.println( "SubList:" + celulares.subList(0, 2));
        
        
        
    }
    
}
