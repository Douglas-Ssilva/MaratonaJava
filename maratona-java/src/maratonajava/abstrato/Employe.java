package maratonajava.abstrato;
 
public abstract class Employe extends Person{
    private String clt;
    protected double salary;

    public Employe() {
    }

    public Employe(String name,String clt, double salary) {
        super(name);
        this.clt = clt;
        this.salary = salary;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return super.toString() + "Employe{" + "clt=" + clt + ", salary=" + salary + '}';
    }
    
    
    
    
}
