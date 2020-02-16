package maratonajava.generics;
 
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DriverGenerica {
    public static void main(String[] args) {
        List<Car> carAvailable= new LinkedList<>();
        carAvailable.add(new Car("Ford"));
        carAvailable.add(new Car("Gol"));
        
        //CLASSES GENÉRICAS O TIPO É DEFINIDO EM TEMPO DE COMPILAÇÃO
        ClasseGenerica<Car> carros= new ClasseGenerica<>(carAvailable);
        System.out.println(carros.getList());
        Car c= carros.rentObject();
        System.out.println(carros.getList());
        carros.devolveObject(c);
        
        List<ComputadorNotGeneric> computadores= new Vector<>();
        computadores.add(new ComputadorNotGeneric("Samsung"));
        computadores.add(new ComputadorNotGeneric("Dell"));
        
        ClasseGenerica<ComputadorNotGeneric> cc= new ClasseGenerica<>(computadores);
        System.out.println(cc.getList());
        ComputadorNotGeneric cg= cc.rentObject();
        System.out.println(cc.getList());
        cc.devolveObject(cg);
    }
    
}
