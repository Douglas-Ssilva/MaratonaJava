package maratonajava.datas;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormate {
    public static void main(String[] args) {
//        Date date= new Date();
//        DateFormat dataFormatada= new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        
        Calendar c= Calendar.getInstance();
        String mascara= "'Belo Horizonte, 'dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat dataFormatada= new SimpleDateFormat(mascara);
        System.out.println(dataFormatada.format(c.getTime()));
        
    }
    
}
