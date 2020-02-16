package maratonajava.polimorfismo;
 
public class Salesman extends Employe{
    
    private double amountSales;

    public Salesman() {
    }

    public Salesman(String name, String clt, double salary, double amountSales) {
        super(name, clt, salary);
        this.amountSales = amountSales;
    }
 
    public double getAmountSales() {
        return amountSales;
    }

    public void setAmountSales(double amountSales) {
        this.amountSales = amountSales;
    }
    
    @Override
    public double calculateSalary() {
        return this.salary += (this.amountSales * 0.05);
    }
    
    @Override
    public String toString() {
        return calculateSalary()  + super.toString() +"Salesman{" + "amountSales=" + amountSales + '}';
    }
}
