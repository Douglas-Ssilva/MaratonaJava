package maratonajava.colecoes;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoListToArray {
    public static void main(String[] args) {
        List<Long> numeros= new ArrayList<>();
        numeros.add(12l);
        numeros.add(2l);
        numeros.add(1l);
        numeros.add(102l);
        
        //CONVERTENDO A LIST PARA ARRAY
        Long[] arrayLong= new Long[numeros.size()];
        numeros.toArray(arrayLong);
        
        System.out.println(numeros);
        System.out.println(Arrays.toString(arrayLong));
        
        Long [] array2= new Long[3];
        array2[0]= 5l;
        array2[1]= 50l;
        array2[2]= 52l;
        //CONVERTENDO ARRAY PARA LISTA, DEVE SE TER ATENÇÃO POIS ASSIM ELES APONTARÃO P O MESMO ENDEREÇO DE MEMÓRIA, FICANDO UNIDOS
        List<Long> listLong= Arrays.asList(array2);
        //ALTERAÇÃO NA LIST, REFLETIRÁ NO ARRAY
        listLong.set(0,1l);
//        listLong.add(0,2l);         UnsupportedOperationException
        System.out.println(Arrays.toString(array2));
        System.out.println(listLong);
        
//        PARA TERMOS FLEXIBILIDADE, PODE-SE FAZER ISTO:
        List<Long> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(array2));
        
        list3.add(8l);
        list3.add(1, 18l);
        list3.set(0,7l);
        System.out.println(list3);
    }
    
}
