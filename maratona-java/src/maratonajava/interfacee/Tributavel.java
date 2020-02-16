package maratonajava.interfacee;
 
public interface Tributavel {
    double IMPOSTO= 0.15;        //Na interface, todos atributos são public, static e final
    double calculateTax();      //Todos os métodos são public e abstract
    
    
}
