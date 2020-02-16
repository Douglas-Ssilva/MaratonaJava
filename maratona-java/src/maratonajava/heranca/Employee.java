package maratonajava.heranca;
 
public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        //System.out.println(this.name);
        //System.out.println(super.name);
        return super.toString() + "salary=" + salary + '}';
    }
    
    
}
