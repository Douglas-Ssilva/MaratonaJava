package maratonajava.expressionlanguagee;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Colchetes {
    public static void main(String[] args) {
        int numberHexa= 0x100;                  //começam com
        System.out.println(numberHexa);
        String text= "12 0x 0X 0x01FFABC 0x10G 0x1";
        //PROCURANDO UM RANGE DE CARACTERES E DÍGITOS
        Pattern pattern= Pattern.compile("0[Xx]([0-9a-fA-F])+(\\s|$)");    //Deve começar com 0, seguido de X ou x, a f maiúsculo ou não
        //Pattern pattern= Pattern.compile("[a-cA-D]");        //procure a a c minúsculos ou A a D maiúsculo
        //Pattern pattern= Pattern.compile("[abcD]");        //procure a ou b ou c minúsculos ou D maiúsculo
        Matcher matcher= pattern.matcher(text);             //Matcher pego o pattern e passo onde procurar
        System.out.println("Índice:     0123456789");
        System.out.println("Procura-se: " + matcher.pattern());
        System.out.println("Texto: "+ text);
        
        while(matcher.find()){      //Enquanto encontrar o padão, faça.
            System.out.println( "Índice: " +matcher.start() + " "+ matcher.group());//pegando também o valor que bateu c padrão.
        }
    }
    
}
