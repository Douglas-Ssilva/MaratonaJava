package maratonajava.generics;
 
import java.util.LinkedList;
import java.util.List;

public class DriverGenericsCar {
    public static void main(String[] args) {
        CarroAlugavel ca= new CarroAlugavel();
        Car c= ca.rentCar();
        System.out.println(ca.carAvailable());
        ca.devolveCar(c);
        System.out.println(ca.carAvailable());
    }
    
}
class CarroAlugavel{
    private List<Car> carAvailable= new LinkedList<>();
    {
        carAvailable.add(new Car("Ford"));
        carAvailable.add(new Car("Gol"));
    }
    
    public void devolveCar(Car c){
        carAvailable.add(c);
        System.out.println("Carro " + c + " devolvido com sucesso!");
    }
    public Car rentCar(){
        Car c= carAvailable.remove(0);
        System.out.println("Você alugou o carro: " + c + "!");
        return c;
    }
    public List<Car> carAvailable(){
        return carAvailable;
    }
}
