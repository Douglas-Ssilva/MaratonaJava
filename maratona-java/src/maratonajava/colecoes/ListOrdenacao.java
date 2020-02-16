package maratonajava.colecoes;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOrdenacao {
    public static void main(String[] args) {
        List<String> nomes= new ArrayList<>();
        nomes.add("Geraldo");
        nomes.add("Igor");
        nomes.add("Inez");
        nomes.add("Nathália");
        nomes.add("Douglas");
        //ORDENANDO A LISTA
        Collections.sort(nomes);
        System.out.println(nomes);
        
        List <Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(-1);
        numbers.add(-6);
        Collections.sort(numbers);
        System.out.println(numbers);

     
    }
    
}
