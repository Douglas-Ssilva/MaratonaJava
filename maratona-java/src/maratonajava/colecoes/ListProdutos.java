package maratonajava.colecoes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProdutoComparator implements Comparator<Produto>{
    //É UMA CLASSE EXTERNA, POR ISSO DEVE RECEBER OS DOIS PRODUTOS
    @Override
    public int compare(Produto t, Produto t1) {
        return t.getName().compareTo(t1.getName());
    }
}
public class ListProdutos {
    public static void main(String[] args) {
        List<Produto> produtos= new ArrayList<>();
//        List<Produto> k= new LinkedList<>();
        Produto [] arrayProdutos= new Produto[4];
        
        Produto produto= new Produto("4", "Notbook Samsung", 2500.0);
        Produto produto1= new Produto("3", "Notbook Lenovo", 2800.0);
        Produto produto2= new Produto("2", "Notbook Itautec", 3500.0);
        Produto produto3= new Produto("1", "Notbook Apple", 2590.0);
        
        produtos.add(produto);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        
        arrayProdutos[0]= produto;
        arrayProdutos[1]= produto1;
        arrayProdutos[2]= produto2;
        arrayProdutos[3]= produto3;
        
        Collections.sort(produtos, new ProdutoComparator());
//        Collections.sort(produtos);
//        for (Produto prod : produtos) {
//            System.out.println(prod);
//        }
        //PARA ORDENAR ARRAYS, USO A CLASSE ARRAYS
        Arrays.sort(arrayProdutos, new ProdutoComparator());
//        Arrays.sort(arrayProdutos);
        for (Produto arrayProduto : arrayProdutos) {
            System.out.println(arrayProduto);
        }
    }
    public static void memory(){
        final int MB= 1024 * 1024;
        Runtime runtime= Runtime.getRuntime();
        System.out.println("MB gastos: " + (runtime.totalMemory() - runtime.freeMemory())/MB);
    }
    
}
