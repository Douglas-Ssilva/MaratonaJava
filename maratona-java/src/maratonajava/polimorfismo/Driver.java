package maratonajava.polimorfismo;
 
public class Driver {
    public static void main(String[] args) {
        Mananger mananger= new Mananger("Geraldo", "11111-1", 5000.0, 1000.0);
        Salesman salesman= new Salesman("Juca", "55511-1", 2000.0, 10000.0);
        
//        GenerateReport.generateReportGeneric(mananger);
        GenerateReport.generateReportGeneric(salesman);
        
//        System.out.println(mananger);
//        System.out.println(salesman);
    }
    
}
