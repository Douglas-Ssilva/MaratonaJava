package maratonajava.generics;

import java.util.ArrayList;
import java.util.List;

public class BeforeGenerics {

    public static void main(String[] args) {
        //LISTA GENÉRICA RECEBENDO QUALQUER TIPO DE OBJETO
        List list = new ArrayList();
        list.add(10.2f);
        list.add(10);
        list.add(true);
        list.add(new StringBuilder("Inez"));
        list.add("Douglas");
        list.add('D');
        for (Object object : list) {
            System.out.println(object);
        }
        //SE A LIST FOSSE DE UM TIPO SOMENTE DARIA UM ERRO EM TEMPO DE EXECUÇÃO
        add(list, 100l);
        System.out.println(list);
    }

    public static void add(List list, Long l) {
        list.add(l);
    }

}
