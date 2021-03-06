package maratonajava.abstrato;
 
public class Salesman extends Employe{
    private double amountSales;

    public Salesman() {
    }

    public Salesman(double amountSales, String name, String clt, double salary) {
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
        return super.toString() +"Salesman{" + "amountSales=" + amountSales + '}';
    }
    
}
