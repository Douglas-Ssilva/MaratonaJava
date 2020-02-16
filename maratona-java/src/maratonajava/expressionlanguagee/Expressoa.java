package maratonajava.expressionlanguagee;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expressoa {
    public static void main(String[] args) {
        //String padrao= "Douglas";
        String text= "O Douglas é um aluno.";
        Pattern pattern= Pattern.compile("Douglas");        //passo o que quero encontrar
        Matcher matcher= pattern.matcher(text);             //Matcher pego o pattern e passo onde procurar
        System.out.println("Índice:     0123456789");
        System.out.println("Procura-se: " + matcher.pattern());
        System.out.println("Texto: "+ text);
        
        while(matcher.find()){      //Enquanto encontrar o padão, faça.
            System.out.println( "Achei o padrão começando nessa posição: " +matcher.start());
        }
        
        
    }
    
}
