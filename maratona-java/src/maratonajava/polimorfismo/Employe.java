package maratonajava.polimorfismo;
 
public abstract class Employe {
    private String name;
     private String clt;
    protected double salary;

    public Employe() {
    }

    public Employe(String name, String clt, double salary) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employe{" + "name=" + name + ", clt=" + clt + ", salary=" + salary + '}';
    }
    
    
 
}
