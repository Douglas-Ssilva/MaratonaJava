package maratonajava.polimorfismo;

public class GenerateReport {
    
//    public static void generateReportSalesman(Salesman salesman){
//        System.out.println("Nome: " + salesman.getName());
//        System.out.println("Salário: " + salesman.getSalary());
//    }
//    
//    public static void generateReportMananger(Mananger mananger){
//        System.out.println("Nome: " + mananger.getName());
//        System.out.println("Salário: " + mananger.getSalary());
//    }
    
    //PODER DO POLIMORFISMO, NOS MÉTODOS ACIMA CADA MÉTODO FOI CRIADO COM BASE NAS SUBCLASSES.
    //DESSA FORMA SÓ IRÁ GERAR DADOS COM MÉTODOS PERTINENTES A MÂE E FILHAS
    public static void generateReportGeneric(Employe employe){
//        System.out.println("Nome: " + employe.getName());
//        System.out.println("Salário: " + employe.getSalary());
      
        //Employe p= salesman;                                        UPCASTING
        
        //QUERO FAZER A IMPRESSÃO DE MÉTODOS ESPECÍFICAS DAS SUBCLASSES
        //SE O EMPLOYE FOR UMA INSTANCIA DE SALESMAN
        if(employe  instanceof Salesman){
             Salesman salesman= (Salesman) employe;
             System.out.println( "Total de vendas: " + salesman.getAmountSales());
        }
        if(employe instanceof Mananger){
              Mananger mananger= (Mananger) employe;                       //FAZENDO O DOWNCASTING
              System.out.println("PNL: " + mananger.getPnl());
        }
        
    }
    
}
