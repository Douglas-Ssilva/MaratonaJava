package maratonajava.finall;

public class Car {
    private String name;
    private String color;
    private final Buyer buyer= new Buyer();
    private static final int speedMaximum= 240;         //static pois a velocidade independe do objeto, pertence à classe Car
    //final pois não mudará

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public static int getSpeedMaximum() {
        return speedMaximum;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", buyer=" + buyer + '}';
    }

   
    
    
    
    
}
