package maratonajava.colecoes;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        Set<Produto> produtosSet= new HashSet<>();                  //não mantém a ordem de inserção
        Set<Produto> produtosSetOrdenados= new LinkedHashSet<>();   //mantém a ordem de inserção
        
        Produto produto = new Produto("4", "Notbook Samsung", 2500.0, 0);
        Produto produto1 = new Produto("3", "Notbook Lenovo", 2800.0, 10);
        Produto produto2 = new Produto("2", "Notbook Itautec", 3500.0, 0);
        Produto produto3 = new Produto("1", "Notbook Apple", 2590.0, 0);

        produtosSet.add(produto);
        produtosSet.add(produto1);
        produtosSet.add(produto2);
        produtosSet.add(produto3);
        
        Iterator<Produto> iteratorSet= produtosSet.iterator();
        while(iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }
        
    }
    
}
