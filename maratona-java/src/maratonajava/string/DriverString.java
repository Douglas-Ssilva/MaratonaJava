package maratonajava.string;
public class DriverString {
    public static void main(String[] args) {
        String name= "Douglas";
//        name+= " Silva";            //Na verdade ele criou 3 novas Strings, Douglas, Silva e Douglas Silva 
        name.concat("Silva");
        System.out.println(name);       //Saída: Douglas
        
        String name2= "Douglas";        //irá apontar para a mesma referência de name, pois tem valores iguais. Não duplica referência nesse caso
        System.out.println(name2 == name);
        
        name= name.concat("Silva");     //Tiro da referÊncia Douglas e aponto para a referência Douglas Silva
        System.out.println(name);
        
        String name3= new String(" Douglas");//1- cria variável de referência, 2- cria um objeto do tipo String,3-Cria uma String no pool
        System.out.println(name3 == name2);//false, aponta para uma nova referência
        
        
        System.out.println(name3.charAt(1));            //caracter de uma determinada posição
        System.out.println(name3.equalsIgnoreCase(name2));//ignora letras maiúsculas e minúsculas.
        System.out.println(name3.length());         //tamanho da String, índice vai até 6
        System.out.println(name3.replace('o', 'O'));//troque isso por aquilo
        System.out.println(name3.toUpperCase());    //maiúsculo
        System.out.println(name3.toLowerCase());
        System.out.println(name3.substring(0, 2));//para retirar começa contando do 1
        System.out.println(name3.trim());       //remove espaços no início e fim. Usado em BD, pois o usuário pode colocar espaços
                                                //e quando for dar um select, não encontrará o nome dele por causa do espaço a +
        System.out.println(name3.contains("as")); //contém essa sequência
        
        
        
    }
    
}
