package maratonajava.expressionlanguagee;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaracterNegacao {
    public static void main(String[] args) {
        String datas=  "proj1.class, proj2.class, proj3.cll, ddd.aa, ddd,ss, proj,ddd " ;
        //COMECE COM PROJ E TENHA QUALQUER COISA QUE NÃO SEJA UMA , DEPOIS
        Pattern pattern= Pattern.compile("proj([^,])");
        Matcher matcher= pattern.matcher(datas);
        
        while(matcher.find()){
            System.out.println("Arquivos encontrados: " +matcher.group());
        }
    }
    
}
