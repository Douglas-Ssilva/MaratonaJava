package maratonajava.enumm;

public enum OverrideEnum {
    PERSON_PHYDICAL(1, "Pessoa Física"), 
    PERSON_LEGAL(2, "Pessoa Jurídica"){
        public String taxa(){
        return "20%";
    }
    };

    private int value;
    private String name;
     OverrideEnum(int value, String name) {
        this.value= value;
        this.name= name;
               
    }

    public String taxa(){
        return "10%";
    }
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    
}
