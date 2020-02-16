package maratonajava.colecoes;
 
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class MapProdutoConsumidor {
    public static void main(String[] args) {
        Consumidor consumidor= new Consumidor("Inez", "123");
        Consumidor consumidor2= new Consumidor("Geraldo", "321");
        Consumidor consumidor3= new Consumidor("Igor", "333");
        
        Produto produto= new Produto("1","Picanha", 250.0);
        Produto produto1= new Produto("2","Almôndegas", 50.0);
        Produto produto2= new Produto("3","Alcatra", 150.0);
        Produto produto3= new Produto("4","Doces", 10.0);
        
        //COMO RELACIONAR CONSUMIDOR E PRODUTO?
        Map<Consumidor, Produto> map= new HashMap<>();      //NÃO IMPORTA-ME A ORDEM
        map.put(consumidor, produto2);
        map.put(consumidor2, produto);
        map.put(consumidor3, produto1);
        
        for(Map.Entry<Consumidor, Produto> mapEntry: map.entrySet()){
            System.out.printf("%S, comprou: %s%n",mapEntry.getKey().getName(), mapEntry.getValue().getName());
        }
        
        //E QUANDO O CONSUMIDOR COMPRA UMA LISTA DE PRODUTOS?
        List<Produto> produtos1= new Vector<>();
        produtos1.add(produto);
        produtos1.add(produto1);
        List<Produto> produtos2= new Vector<>();
        produtos2.add(produto2);
        produtos2.add(produto3);
        
        Map<Consumidor, List<Produto>> map2= new LinkedHashMap<>();
        map2.put(consumidor, produtos1);
        map2.put(consumidor2, produtos2);
        
        for(Map.Entry<Consumidor, List<Produto>> entry: map2.entrySet()){
            System.out.print(entry.getKey().getName() + "- ");
            for(Produto p: entry.getValue()){
                System.out.print(p.getName()+ " ");
            }
            System.out.println("");
        }
    }
    
}
