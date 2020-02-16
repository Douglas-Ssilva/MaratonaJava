package maratonajava.generics;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MethodGeneric {

    public static void main(String[] args) {
        generic("Douglas");
        generic(new Car("BMW"));
        generic(10);
        generic(true);

        Queue<Integer> i = getList(1);
        System.out.println(i);

        Queue<String> s= new PriorityQueue<>();
        s.add("Maria");
        s.add("Joao");
        Queue<String> q = getListL(s);
        System.out.println(q);
    }

    //COLOCA-SE O T ANTES DO TIPO DE RETORNO
    public static <T> void generic(T t) {
        Set<T> listSet = new LinkedHashSet<>();
        listSet.add(t);
        System.out.println(listSet);
    }

    public static <T> Queue<T> getList(T t) {
        Queue<T> queue = new PriorityQueue<>();
        queue.add(t);
        return queue;
    }

    public static <T> Queue<T> getListL(Queue<T> t) {
        Queue<T> queue = new PriorityQueue<>();
        queue.addAll(t);
        return queue;
    }
    
    public static <T extends Animal> Queue<T> getListLi(Queue<T> t) {
        Queue<T> queue = new PriorityQueue<>();
        queue.addAll(t);
        return queue;
    }
}
