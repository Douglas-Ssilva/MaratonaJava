package maratonajava.excecao.sobreposicao;
 
import maratonajava.excecao.myexception.MyException;

public class Employe extends Person{
    public void save() {                //NÃO SOU OBRIGADO A TRATAR AS EXCEÇÕES, POIS POSSO FAZER O QUE QUISER AQUI
        
    }   
//    public void save() throws MyException{  Posso declarar apenas uma das exceptions se quiser
//        
//    }
//    public void save() throws Exception{ Não posso colocar uma superclasse das declaradas no método
//        
//    }
}
