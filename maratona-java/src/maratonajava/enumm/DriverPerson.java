package maratonajava.enumm;

public class DriverPerson {

    public static void main(String... args) {
        Person p1 = new Person("Douglas", TypePerson.PERSON_PHYDICAL);
        System.out.println(p1);

        for (OverrideEnum arg : OverrideEnum.values()) {
            System.out.println(arg + "- " + arg.taxa());
        }
//        System.out.println(sum(2,2,3,64,5,8));
    }
//    public static double sum(double...num){
//        double soma= 0;
//        for (double d : num) {
//        soma+= d;
//            
//        }
//        //soma+= num;
//        return soma;
//    } 

}
