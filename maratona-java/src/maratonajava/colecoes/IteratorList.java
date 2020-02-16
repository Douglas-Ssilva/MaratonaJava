package maratonajava.colecoes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorList {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto = new Produto("4", "Notbook Samsung", 2500.0, 0);
        Produto produto1 = new Produto("3", "Notbook Lenovo", 2800.0, 10);
        Produto produto2 = new Produto("2", "Notbook Itautec", 3500.0, 0);
        Produto produto3 = new Produto("1", "Notbook Apple", 2590.0, 0);

        produtos.add(produto);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

//        for (Produto p : produtos) {
//            if(p.getQuantidade() == 0){
//                produtos.remove(p); //ConcurrentModificationException, dessa forma não consigo remover
//            }
//        }
//        REMOVENDO COM O ITERATOR
        Iterator<Produto> iterator = produtos.iterator();
//        hasNext()- pega o proximo
//        next()- pega o elemento da lista naquele momento
        System.out.println("Before Size: "+ produtos.size());
        while (iterator.hasNext()) {
            if (iterator.next().getQuantidade() == 0) {
                iterator.remove();
            }
        }
        System.out.println("After Size: "+ produtos.size());

    }

}
