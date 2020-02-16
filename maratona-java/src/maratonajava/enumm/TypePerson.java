package maratonajava.enumm;
 
public enum TypePerson {
    /*PERSON_PHYDICAL(1), PERSON_LEGAL(2);
    private int value;
     TypePerson(int value) {
        this.value= value;
    }
    public int getValue() {
        return value;
    }*/
    PERSON_PHYDICAL(1, "Pessoa Física"), PERSON_LEGAL(2, "Pessoa Jurídica");

    private int value;
    private String name;
     TypePerson(int value, String name) {
        this.value= value;
        this.name= name;
               
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    
    
    
    
}
