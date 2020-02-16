package maratonajava.colecoes;
import java.util.ArrayList;
import java.util.List;

public class ListTeste {
    public static void main(String[] args) {
        //PROGRAMANDO PARA INTERFACE É USÁ-LA COMO VARIÁVEL DE REFERÊNCIA
//        List nomes= new ArrayList();   ATÉ A VERSÃO 4 DO JAVA
          List <String> nomes= new ArrayList<>();
          List <String> nomes1= new ArrayList<>();
          nomes.add("Inez");
          nomes.add("Igor");
          nomes1.add("Geraldo");
          nomes1.add("Nathália");
          nomes.remove(0);      //removendo Inez
          nomes.clear();        //limpando tudo da lista
          System.out.println("Está vazia? "+ nomes.isEmpty());   
          
          //ADICIONANDO UMA LIST A OUTRA
          nomes.addAll(nomes1);
          
          System.out.println(nomes);
          //OU
//          for(String s: nomes){       não é possível adicionar um elemento na iteração do loop
//              System.out.println(s);
//          }
//          
        
    }
    
}
