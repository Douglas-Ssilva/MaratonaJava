package maratonajava.staticc;
 
public class Car {
    private String name;
    private String color;
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

    @Override
    public String toString() {
        return "Car{" + "Name=" + name + ", Color=" + color +  " Velocidade máxima= " + speedMaximum + '}';
    }
    
    
    
}
