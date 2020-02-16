package maratonajava.abstrato;

public class Driver {
    public static void main(String[] args) {
        //Employe employe= new Employe();           Não se instancia classes abstratas
        Manager manager= new Manager("Inez", "11111-1", 5000.0);
        Salesman salesman=  new Salesman(1500, "Maria", "66666-6", 2000.0);
        
        System.out.println(manager);
        System.out.println(salesman);
        System.out.println("");
        
        manager.calculateSalary();
        salesman.calculateSalary();
        System.out.println(manager);
        System.out.println(salesman);
    }
    
}
