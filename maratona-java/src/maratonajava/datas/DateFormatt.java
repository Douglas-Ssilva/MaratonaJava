package maratonajava.datas;
 
import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatt {
    public static void main(String[] args) {
        Calendar hour= Calendar.getInstance();
        DateFormat [] vetorDatas= new DateFormat[6];
//        System.out.println(hour.getTime()); 
        vetorDatas[0]= DateFormat.getInstance();        //09/10/18 13:15
        vetorDatas[1]= DateFormat.getDateInstance();    //09/10/2018
        vetorDatas[2]= DateFormat.getDateInstance(DateFormat.SHORT); //09/10/18
        vetorDatas[3]= DateFormat.getDateInstance(DateFormat.MEDIUM); //09/10/2018
        vetorDatas[4]= DateFormat.getDateInstance(DateFormat.LONG);   //9 de Outubro de 2018  
        vetorDatas[5]= DateFormat.getDateInstance(DateFormat.FULL);   //Terça-feira, 9 de Outubro de 2018
        
        for (DateFormat vetorData : vetorDatas) {
            System.out.println(vetorData.format(hour.getTime()));
        }

        Calendar data= Calendar.getInstance();
//        System.out.println(data.getTime());
        DateFormat c = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(c.format(data.getTime()));
        
        
    }
    
}
