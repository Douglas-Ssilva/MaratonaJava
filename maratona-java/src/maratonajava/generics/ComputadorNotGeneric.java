package maratonajava.generics;
 
public class ComputadorNotGeneric {
    private String name;

    public ComputadorNotGeneric(String name) {
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
        return name ;
    }
    
    
    
}
