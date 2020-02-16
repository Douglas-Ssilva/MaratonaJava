package maratonajava.tokensdelimitadores;
 
import java.util.Scanner;

public class TokensDelimitadores {
    public static void main(String[] args) {
        /*String str= "Maria, Lorenza, Nathália, Inez, Igor, Geraldo";
        String[] tokens = str.split(",");
        for(String s: tokens){
            System.out.println(s.trim());       //retirar espaço em branco
        }*/
        
        System.out.println("================================");
        //CLASSE SCANNER É MAIS PREPARADA PARA ISSO
        Scanner sc= new Scanner("10 100.1 12 100.2");  //tem como delimitador o espaço
        while(sc.hasNext()){                          //enquanto houver próximo
//            System.out.println(sc.next());             escrevendo os valores, devolve o valor e pega o próximo
            if(sc.hasNextInt()){                     //se o proximo for inteiro
                int i= sc.nextInt();
                System.out.println("Int: " + i);
            }else if(sc.hasNextDouble()){
                double d= sc.nextDouble();
                System.out.println("Double: " + d);
            }else if(sc.hasNextBoolean()){
                boolean b= sc.nextBoolean();
                System.out.println("Boolean: " + b);
            }else{
                System.out.println("Passou por todos: " + sc.next());
            }
        }
       
    }
    
}
