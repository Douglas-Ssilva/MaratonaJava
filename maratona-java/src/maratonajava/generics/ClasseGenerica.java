package maratonajava.generics;
//T- type, falo que esta classe receberá qualquer tipo
import java.util.LinkedList;
import java.util.List;

public class ClasseGenerica <T>{
    private List <T> list= new LinkedList<>();
    
    public ClasseGenerica(List<T> list){
        this.list = list;
    }
    public List<T> getList(){
        return this.list;
    }
    //MÉTODOS PERSONALIZADOS
    public void devolveObject(T t){
        this.list.add(t);
        System.out.println(t + " devolvido com sucesso!");
    }
    public T rentObject(){
        T t= this.list.remove(0);
        System.out.println(t + " alugado com sucesso!");
        return t;
    }
    
     
}

