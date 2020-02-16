package maratonajava.generics;

import java.util.List;
import java.util.Vector;

public class DriverComputador {

    public static void main(String[] args) {
        ComputadorAvailable ca = new ComputadorAvailable();
        System.out.println(ca.getList());
        ComputadorNotGeneric c = ca.rentComputador();
        System.out.println(ca.getList());
        ca.devolveComputador(c);
        System.out.println(ca.getList());
    }

}
class ComputadorAvailable {

    private List<ComputadorNotGeneric> computadores = new Vector<>();

    {
        computadores.add(new ComputadorNotGeneric("Dell"));
        computadores.add(new ComputadorNotGeneric("Samsung"));
        computadores.add(new ComputadorNotGeneric("Apple"));
    }

    public ComputadorNotGeneric rentComputador() {
        ComputadorNotGeneric c = computadores.remove(0);
        System.out.println(c + " alugado com sucesso!");
        return c;
    }

    public void devolveComputador(ComputadorNotGeneric c) {
        computadores.add(c);
        System.out.println(c + " devolvido com sucesso!");
    }

    public List<ComputadorNotGeneric> getList() {
        return computadores;
    }
}
