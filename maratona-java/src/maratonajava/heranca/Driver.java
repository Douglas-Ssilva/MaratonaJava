package maratonajava.heranca;
 
public class Driver {
    public static void main(String[] args) {
        Person pessoa= new Person();
        Person p= new Employee();
        Employee employee= new Employee();
        Address address= new Address();
        
        
        address.setNameStreet("Viena");
        address.setNeighborhood("Granjas Primavera");
        address.setNumber(825);
        
        pessoa.setName("Douglas");
        pessoa.setCpf("111.111.111-55");
        pessoa.setAddress(address);
        
        employee.setName("Nathália");
        employee.setCpf("111.222.222-22");
        employee.setSalary(1000.50);
        employee.setAddress(address);
        
        System.out.println(pessoa);
        System.out.println(employee);
    }
    
}
