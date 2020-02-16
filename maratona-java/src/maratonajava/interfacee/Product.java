package maratonajava.interfacee;
 
public class Product implements Tributavel, Transportavel{
    private String name;
    private double price;
    private double weight;
    private double priceFinal;
    private double freight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double calculateTax() {
        return this.priceFinal= this.price + (this.price * IMPOSTO);
    }

    @Override
    public double calculatefreight() {
        return this.freight= this.price * 0.02 ;
    }
    
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", weight=" + weight + ", priceFinal=" + calculateTax() + ", freight=" + calculatefreight() + '}';
    }

    
    
    
    
    
}
