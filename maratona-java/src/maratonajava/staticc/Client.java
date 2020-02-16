package maratonajava.staticc;

import java.util.Arrays;

public class Client {
    private String name;
    private String color;
    private static int[] parcelas;                      //independe de objeto, é um atributo da classe que todos compartilharão

    //bloco de inicalização
    static {
        System.out.println("Bloco de inicialização");
     parcelas= new int[100];
        for (int i = 1; i <= 100; i++) {
            parcelas[i-1]= i;
        }
    }

    public Client(String name, String color) {
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
