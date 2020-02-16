package maratonajava.generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

abstract class Animal {
    abstract void emitirSom();
}
class Dog extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latindo...");
    }
}
class Cat extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Mial...");
    }
}
public class WildCard {
    public static void main(String[] args) {
        Dog [] dogs= {new Dog(), new Dog()};
        Cat [] cats= {new Cat(), new Cat()};
//        consulta(dogs);
//        consulta(cats);
        
        List<Animal> listAnimal= new Vector<>();
        List<Dog> listDog= new LinkedList<>();
        List<Cat> listCat= new ArrayList<>();
        
        listDog.add(new Dog());
        listCat.add(new Cat());
//        consultaList(listDog);  É PRECISO ALTERAR A ASSINATURA P COMPIALAR
        consultaList(listAnimal);
//        consultaList(listDog);   ERRO EM TEMPO DE COMPILAÇÃO

//        COM O CORINGA
        consultaListCoringa(listCat);
        
    }

    public static void consulta(Animal[] animais) {    //POLIMORFISMO POSSO PASSAR UMA SUBCLASSE DE ANIMAL
        for(Animal animal: animais){
            animal.emitirSom();
        }
        animais[1]= new Cat();     // ArrayStoreException
    }
    //PARA AS COLLECTIONS, A ASSINATURA DO MÉTODO DEVE SER EXATAMENTO DO MESMO TIPO DA LISTA CRIADA
    //NÃO POSSO PASSAR SUBCLASSE DE ANIMAL
    public static void consultaList(List<Animal> animais){
        for(Animal animal: animais){
            animal.emitirSom();
        }
        //TODAVIA CONSIGO CRIAR INSTANCIAS DAS SUBCLASSES AQUI
        animais.add(new Dog());
        animais.add(new Cat());
    }
    
    //PARA RESOLVER ISSO USO O WILDCARD
    //ACEITE QUALQUER COISA QUE SEJA FILHA DESSA CLASSE
     public static void consultaListCoringa(List<? extends Animal> animais){
        for(Animal animal: animais){
            animal.emitirSom();
        }
        //NÃO POSSO FAZER NEM UMA INSERÇÃO, NEM MESMO DO TIPO QUE CHEGAR:
//        animais.add(new Cat());     //E SE CHEGAR UMA LISTA DE DOG?
    }
     
     //AGORA QUERO QUALQUER CLASSE QUE SEJA SUPERCLASSE DE DOG, OU ELA MESMO
     public static void consultaListCoringaSuper(List<? super Dog> dogs){
         Dog d= new Dog();
         Animal a= new Dog();
         Object o= new Dog();
         
         dogs.add(new Dog());
     }
     //MEU METODO DE ORDENAÇÃO, QUE SÓ ACEITARÁ CLASSES QUE IMPLEMENTAM A COMPARABLE
     public static void ordenar(List<? extends Comparable> list){
         Collections.sort(list);
     }
}
