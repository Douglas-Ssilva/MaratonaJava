package maratonajava.string;
 
public class StringPerformance {
    public static void main(String[] args) {
        //Classe System, tem esse método que pega o tempo atual em Milissegundos
        Long inicio= System.currentTimeMillis();//Ínicio do processamento
        conctString(3000);                //criando X novas Strings
        Long fim= System.currentTimeMillis();//Tempo depois do processamento
        System.out.println("Tempo gasto String: " + (fim - inicio) + " ms.");
        
        inicio= System.currentTimeMillis();
        conctStringBuilder(300000);
        fim= System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + " ms.");
        
        inicio= System.currentTimeMillis();
        conctStringBuffer(300000);
        fim= System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: " + (fim - inicio) + " ms.");
    }
    
    public static void conctString(int tam) {
        String string= "";
        for (int i = 0; i < tam; i++) {
            string+= i;
        }
    }
    public static void conctStringBuilder(int tam) {
        StringBuilder stringBuilder= new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            stringBuilder.append(i);
        }
    }
    public static void conctStringBuffer(int tam){
        StringBuffer stringBuffer= new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            stringBuffer.append(i);
        }
    }
    
    
}
