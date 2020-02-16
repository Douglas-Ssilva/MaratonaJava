package maratonajava.excecao;
 
public class NullPoi {
    public static void main(String[] args) {
        Object o= null;
        
        try{
        System.out.println(o.toString());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
}
