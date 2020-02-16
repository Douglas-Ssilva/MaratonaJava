package maratonajava.expressionlanguagee;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantificadors {
    public static void main(String[] args) {
        String text= "12 0V99f 0x 0X 0x01FFABC 0x10G 0x1";
//        Pattern pattern= Pattern.compile("o[vc]o" OU "o(c|v)o");    casa com ovo ou oco
        Pattern pattern= Pattern.compile("0[Xx]([0-9a-fA-F])+(\\s|$)");    //casa com ovo ou oco
        Matcher matcher= pattern.matcher(text);             //Matcher pego o pattern e passo onde procurar
        
        while(matcher.find()){      //Enquanto encontrar o padão, faça.
            System.out.println( "Índice: " +matcher.start() + " "+ matcher.group());//pegando também o valor que bateu c padrão.
        }
    }
}
