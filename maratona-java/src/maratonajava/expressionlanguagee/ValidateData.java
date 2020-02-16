package maratonajava.expressionlanguagee;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {
    public static void main(String[] args) {
        String datas=  "22/22/1000 22/10/1 32/01/2000 30/01/2000 01/10/2000" ;
        Pattern pattern= Pattern.compile("([0][1-9]|[1-2][0-9]|[3][0-1])/([0][1-9]|[1][0-2])/[0-9]{4}");
        //Partindo do princípio que as datas já são válidas, posso usar assim:
//        Pattern pattern= Pattern.compile("\\d{2}/\\d{2}/\\d{2,4}");
        Matcher matcher= pattern.matcher(datas);
        
        while(matcher.find()){
            System.out.println("Datas válidas: " +matcher.group());
        }
        
    }
    
}
