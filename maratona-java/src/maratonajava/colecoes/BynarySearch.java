package maratonajava.colecoes;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BynarySearch {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        
        //PARA USAR O BINARYSEARCH A LISTA DEVE ESTAR ORDENADA
        //(-(PONTO DE INSERÇÃO) -1 ) REGRA DO BINAYSEARCH
        Collections.sort(numbers);
        System.out.println("Índice do elemento: " + Collections.binarySearch(numbers, 5));
        System.out.println("Elemento que não existe retorna -: " + Collections.binarySearch(numbers, 50));
        
        List<Produto> produtos= new ArrayList<>();
        Produto produto= new Produto("4", "Notbook Samsung", 2500.0);
        Produto produto1= new Produto("3", "Notbook Lenovo", 2800.0);
        Produto produto2= new Produto("2", "Notbook Itautec", 3500.0);
        Produto produto3= new Produto("1", "Notbook Apple", 2590.0);
        
        produtos.add(produto);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        //ORDENANDO por: 
        Collections.sort(produtos, new ProdutoComparator());
        System.out.println("Índice que o produto está na lista: "+ Collections.binarySearch(produtos, produto1, new ProdutoComparator()));
       
        Produto produto4= new Produto("5", "Notbook Amazom", 2990.0);
        System.out.println("Onde deveria inserí-lo? "+ Collections.binarySearch(produtos, produto4, new ProdutoComparator()));
        
        List<Integer> numeros= new ArrayList<>();
        numeros.add(1);
        numeros.add(0);
        numeros.add(5);
        numeros.add(4);
        
        Collections.sort(numeros);
        System.out.println("Onde deveria ser inserido? " + Collections.binarySearch(numeros, 6));
        System.out.println("Onde está? " + Collections.binarySearch(numeros, 5));
    }
    
}
