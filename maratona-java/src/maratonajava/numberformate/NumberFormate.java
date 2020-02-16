package maratonajava.numberformate;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
public class NumberFormate {

    public static void main(String[] args) {
        float value= 244.315f;
        Locale locUS = new Locale("en", "US");
        Locale locBR = new Locale("pt", "BR");

        NumberFormat[] vetorUS = new NumberFormat[4];
        NumberFormat[] vetorBR = new NumberFormat[4];
        
        vetorUS[0]= NumberFormat.getInstance(); //244,315
        vetorUS[1]= NumberFormat.getInstance(locUS);  //244.315 
        vetorUS[2]= NumberFormat.getCurrencyInstance(); // R$ 244,32
        vetorUS[3]= NumberFormat.getCurrencyInstance(locUS); // $25.32 
        
        vetorBR[0]= NumberFormat.getInstance();  //244,315
        vetorBR[1]= NumberFormat.getInstance(locBR); // 244,315
        vetorBR[2]= NumberFormat.getCurrencyInstance();  // R$ 25,32 
        vetorBR[3]= NumberFormat.getCurrencyInstance(locBR); //R$ 25,32
        
        System.out.println("========US============");
        for (NumberFormat numberFormat : vetorUS) {
            System.out.print(numberFormat.format(value) + " | ");
        }
        
        System.out.println("\n========BR============");
        for(NumberFormat numBR: vetorBR){
            System.out.print(numBR.format(value) + " | ");
        }
        
        double x= 252.36656;
        NumberFormat num= NumberFormat.getInstance();
        System.out.println("\n"+ num.format(x)); //252,367
        System.out.println("\nMáximo de digitos: " + num.getMaximumFractionDigits());
        num.setMaximumFractionDigits(5);        //setando mais números pós vírgula
        System.out.println("\n"+ num.format(x)); //252,36656
        
        //TRANSFORMANDO STRING PARA NUMBERFORMAT
        String y= "3333,3333";
        try {
              System.out.println(num.parse(y));           //método parse da Number lança uma exception do tipo checked
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

}
