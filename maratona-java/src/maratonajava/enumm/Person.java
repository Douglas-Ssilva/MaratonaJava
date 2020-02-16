package maratonajava.enumm;
 
public class Person {
    private String name;
    private int type;
    private TypePerson typePerson;
    //public static final int PERSON_PHYDICAL= 1;
    //public static final int PERSON_LEGAL= 2;

    public Person(String name, TypePerson typePerson) {
        this.name = name;
        this.typePerson = typePerson;
       // this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /*@Override
    public String toString() {
        String type="Pessoa Física!";
        if(this.typePerson.getValue() == 2){
            type= "Pessoa Jurídica!";
        }
        return this.getName() + " é do tipo: " + type;
    }*/
    @Override
    public String toString() {
        return this.getName() + " é do tipo: " + typePerson.getName();
    }
    
    
    
}
