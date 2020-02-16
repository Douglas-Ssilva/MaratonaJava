package maratonajava.expressionlanguagee;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Metacarcteres {
    public static void main(String[] args) {
        String text= "O2 D22ouglas112.";
        Pattern pattern= Pattern.compile("\\W");        //passo o que quero encontrar
        Matcher matcher= pattern.matcher(text);             //Matcher pego o pattern e passo onde procurar
        System.out.println("Índice:     0123456789");
        System.out.println("Procura-se: " + matcher.pattern());
        System.out.println("Texto: "+ text);
        
        while(matcher.find()){      //Enquanto encontrar o padão, faça.
            System.out.println( "Achei o padrão começando nessa posição: " +matcher.start());
        }
    }
    
}
