package maratonajava.colecoes;
 
import java.util.Objects;

public class Consumidor {
    private String name;
    private String cpf;
    
    public Consumidor(String name, String cpf){
        this.name= name;
        this.cpf= cpf;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString(){
        return "Name: " + this.getName() + "CPF: " + this.getCpf();
    }
    @Override
    public boolean equals(Object c){
        if(this == c) return true;
        if(c == null) return false;
        if(this.getClass() != c.getClass()) return false;
        Consumidor consumidor= (Consumidor)c;
        return cpf != null && cpf.equals(consumidor.getCpf());
    }

    @Override
    public int hashCode() {
        return cpf != null? cpf.hashCode() : 0 ;
    }

    
    
    
}
