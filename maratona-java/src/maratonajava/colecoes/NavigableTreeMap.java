package maratonajava.colecoes;
 
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableTreeMap {
    public static void main(String[] args) {
        //PARA USAR O TREEMAP A ÚNICA CLASSE QUE PRECISA IMPLEMENTAR A COMPARABLE É A CLASSE QUE VAI NA CHAVE
        //SENÃO OCORRE UM ERRO EM RUNTIME
        NavigableMap<String, String> map= new TreeMap<>();      //COMO USAMOS STRING, AUTOMATICAMENTE ELE IRÁ ORGANIZAR, POIS ELA IMPLEMENTA A Comparable
        map.put("B", "Letra B");
        map.put("A", "Letra A");
        map.put("C", "Letra C");
        map.put("D", "Letra D");
        map.put("E", "Letra E");
        
        System.out.printf("%s %10s%n","Key","Value");
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.printf("%s %13s%n",entry.getKey(), entry.getValue());
        }
        
        //POSSUEM OS MESMO MÉTODOS EXISTENTES NO TREESET, PORÉM VOLTADOS PARA COLEÇÃO DE KEY VALUE
    }
    
}
