package maratonajava.datas;
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        DateFormat relogio= new SimpleDateFormat("dd/MM/YYYY");
        Date date= new Date();      //Pega data e hora atual, padrão dos EUA
        System.out.println(date);   //Sat Sep 29 16:50:46 BRT 2018
        System.out.println(relogio.format(date));       //29/09/2018
        
        //A MAIS USADA
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());        //Sat Sep 29 16:50:46 BRT 2018
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("O primeiro dia da semana é domingo!");
        }
        
        System.out.println( "Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println( "Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println( "Dia do ano: " + c.get(Calendar.DAY_OF_YEAR));
        
        c.add(Calendar.HOUR, 2);                //acrescentando 2 horas, no campo hour
        c.roll(Calendar.MINUTE, 30);            //muda somente o campo que estou mexendo, diferente do add
        Date date2= c.getTime();
        System.out.println(date2);          //Sat Sep 29 18:50:46 BRT 2018
    }
    
}
