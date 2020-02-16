package maratonajava.blocodeinicializacao; 

import java.util.Arrays;

public class Car {
    private String name;
    private String color;
    private int[] parcelas;

    {
        System.out.println("Bloco de inicialização");
     parcelas= new int[100];
        for (int i = 1; i <= 100; i++) {
            parcelas[i-1]= i;
        }
    }

    public Car(String name, String color) {
        System.out.println("No construtor");
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

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", parcelas=" + Arrays.toString(parcelas) + '}';
    }
    
    
    
}
