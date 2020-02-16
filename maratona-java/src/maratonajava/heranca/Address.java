package maratonajava.heranca;
 
public class Address {
    private String nameStreet;
    private String Neighborhood;
    private int number;

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public String getNeighborhood() {
        return Neighborhood;
    }

    public void setNeighborhood(String Neighborhood) {
        this.Neighborhood = Neighborhood;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" + "nameStreet=" + nameStreet + ", Neighborhood=" + Neighborhood + ", number=" + number + '}';
    }
    
    
    
    
}
