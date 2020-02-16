package maratonajava.colecoes;
  
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
//        Map<String, String> mapSring= new HashMap<>();      //NÃO MANTÉM A ORDEM DE INSERÇÃO
        Map<String, String> mapSring= new LinkedHashMap<>();      //MANTÉM A ORDEM DE INSERÇÃO
        mapSring.put("vc", "você");
        mapSring.put("mouze", "mouse");
        mapSring.put("Ines", "Inez");
        
        //ITERANDO PELAS KEYS
        for(String s: mapSring.keySet()){
            System.out.print(s + " ");  //Ines mouze vc
        }
        System.out.println("");
        //ITERANDO PELOS VALUES
        for (String s : mapSring.values()) {
            System.out.printf("%-5s ",s);   //Inez  mouse você
        }
        System.out.println("");
        //ITERANDO PELAS KEYS E VALUES
        for(Map.Entry<String, String> s: mapSring.entrySet()){
            System.out.println("Key: " + s.getKey() + " " + "Value: "+ s.getValue());
        }
    }
    
}
