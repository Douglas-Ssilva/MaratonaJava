package maratonajava.locale; 
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Localizacao {
    public static void main(String[] args) {
        //TEM CONSTRUTOR SOBRECARREGADO
        //PARÂMETRO COM BASE NA ISO 639, pt BR, en US
        Locale locale= new Locale("en", "US");
        Locale locale2= new Locale("pt", "BR");
        Locale locale3= new Locale("ja");
        Locale locale4= new Locale("hi","IN");
        Calendar c= Calendar.getInstance();
        //MÉTODO GETDATEINSTANCE É SOBRECARREGADO
        DateFormat dataFormatadaUS= DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat dataFormatadaBr= DateFormat.getDateInstance(DateFormat.FULL, locale2);
        DateFormat dataFormatadaJa= DateFormat.getDateInstance(DateFormat.FULL, locale3);
        DateFormat dataFormatadaIn= DateFormat.getDateInstance(DateFormat.FULL, locale4);
        
        System.out.println("US: "+ dataFormatadaUS.format(c.getTime()));
        System.out.println("BR: "+ dataFormatadaBr.format(c.getTime()));
        System.out.println("JAPAN: "+ dataFormatadaJa.format(c.getTime()));
        System.out.println("Indía: "+ dataFormatadaIn.format(c.getTime()));
        
        //MÉTODOS ÚTEIS DA CLASSE LOCALE
        System.out.println(locale.getDisplayLanguage());       //linguagem do respectivo País
        System.out.println(locale4.getDisplayCountry());        //Pegando o país
        
        System.out.println("Falando portugês em Inglês: "+locale2.getDisplayLanguage(locale));
        System.out.println("Falando Ingês em Japanês: "+locale.getDisplayLanguage(locale3));
        System.out.println("Falando Ingês em Portugues: "+locale.getDisplayLanguage(locale2));
        
        
        
        
    }
    
}
