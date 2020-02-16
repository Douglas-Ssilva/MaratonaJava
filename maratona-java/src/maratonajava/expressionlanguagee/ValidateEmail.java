package maratonajava.expressionlanguagee;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        String text= "douglas_4@hotmail.com, d@hotmail.com, *inez123@gmail.com.br, ll**@hhh.com, 123@lll.com, ****@hotmail.com" ;
        //"([\\w\\.-_])+@([a-zA-Z])+([\\.]+([a-zA-Z])+)+"
        Pattern pattern= Pattern.compile("([a-zA-Z0-9\\.-_])+@([a-zA-Z])+([\\.]+([a-zA-Z])+)+"); //usando \\. informo que pode ser . caractere
        //1ºagrupamento letras maiúsculas e minúsculas, números, .-_ uma ou mais vezes.
        //2º comece com @, letras maiúsculas e minúsculas uma ou mais vezes
        //3º forço o . letras maiúsculas e minúsculas uma ou mais vezes.
        //4º agrupo desde o ponto até as letras, e falo que podem se repetir uma ou mais vezes
        Matcher matcher= pattern.matcher(text);
        
        while(matcher.find()){
            System.out.println("Índice: " + matcher.start() + " " + matcher.group());
        }
        
        
    }
    
}
