package maratonajava.colecoes;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTreeSet {
    public static void main(String[] args) {
        NavigableSet<Produto> produtosTree= new TreeSet<>();
        
        Produto produto= new Produto("4", "Notbook Samsung", 2500.0);
        Produto produto1= new Produto("3", "Notbook Lenovo", 2800.0);
        Produto produto2= new Produto("2", "Notbook Itautec", 3500.0);
        Produto produto3= new Produto("1", "Notbook Apple", 2590.0);
        
        produtosTree.add(produto);
        produtosTree.add(produto1);
        produtosTree.add(produto2);
        produtosTree.add(produto3);
        
        Iterator<Produto> i= produtosTree.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        //LOWER- RETORNA O MENOR PRODUTOS ANTES DO QUE PASSARMOS
        System.out.println(produtosTree.lower(produto1)); //Notbook Apple
        //FLOOR MESMO DO LOWER, PORÉM INCLUI O ELEMENTO NA BUSCA
        System.out.println(produtosTree.floor(produto2)); //Notbook Itautec
        //HIGHER- PRODUTO MAIS CARO DEPOIS DESTE
        System.out.println(produtosTree.higher(produto));   //Notbook Apple
        //CEILING MESMO DO HIGHER MAS INCLUI O ELEMENTO
        System.out.println(produtosTree.ceiling(produto));  
        
        //DEIXANDO A LISAT EM ORDEM DECRESCENTE
        for (Produto produto4 : produtosTree.descendingSet()) {
            System.out.println(produto4);
        }
        
        System.out.println(produtosTree.size());
        //RETORNA O PRIMEIRO ELEMENTO E O REMOVE DA LISTA
        System.out.println(produtosTree.pollFirst());
        System.out.println(produtosTree.size());
    }
    
}
