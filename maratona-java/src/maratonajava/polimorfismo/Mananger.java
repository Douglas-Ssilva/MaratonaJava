package maratonajava.polimorfismo;
 
public class Mananger extends Employe{

    private double pnl;
    
    public Mananger() {
    }

    public Mananger(String name, String clt, double salary, double pnl) {
        super(name, clt, salary);
        this.pnl= pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

    @Override
    public double calculateSalary() {
        this.setSalary(this.getSalary() + (this.getSalary() * 0.1));
        return this.getSalary();
    }

    @Override
    public String toString() {
        return  calculateSalary()  + super.toString() + "Mananger{" + "pnl=" + pnl + '}';
    }
    
    
}
