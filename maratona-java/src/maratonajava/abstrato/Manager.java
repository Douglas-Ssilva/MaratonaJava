package maratonajava.abstrato;
public class Manager extends Employe{

    public Manager() {
    }

    public Manager(String name, String clt, double salary) {
        super(name, clt, salary);
    }

    @Override
    public double calculateSalary() {
        this.setSalary(this.getSalary() + (this.getSalary() * 0.1));
        return this.getSalary();
    }

    
    
    
    
}
