package maratonajava.serializacao;
 
import java.io.Serializable;

public class Class implements Serializable{
    private String name;

    public Class(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class{" + "name=" + name + '}';
    }
    
    
    
}