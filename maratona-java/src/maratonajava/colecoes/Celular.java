package maratonajava.colecoes;
import java.util.Objects;

public class Celular {
    private String name;
    private final String IMEI;

    public Celular(String name, String IMEI) {
        this.name = name;
        this.IMEI = IMEI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIMEI() {
        return IMEI;
    }
    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1;  
    }
    //SOBREPONDO O MÉTODO EQUALS PARA FAZER COMPARAÇÃO DE OBJETOS. 
    //CELULARES SERÃO IDENTICOS SE OS IMEIS FOREM IGUAIS
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;            
        if(this == obj) return true;            //se estiverem no mesmo endereço de memória
        if(this.getClass() != obj.getClass()) return false;  //getClass me informa se são do mesmo tipo
        Celular celular= (Celular) obj;     //Chegou aqui tenho certeza que são do mesmo tipo
        return IMEI != null && IMEI.equals(celular.getIMEI());
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Celular other = (Celular) obj;
//        if (!Objects.equals(this.IMEI, other.IMEI)) {
//            return false;
//        }
//        return true;
//    }
    @Override
    public String toString() {
        return "Celular{" + "name=" + name + ", IMEI=" + IMEI + '}';
    }
}
