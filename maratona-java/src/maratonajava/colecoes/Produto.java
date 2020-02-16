package maratonajava.colecoes;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String serialNumber;
    private String name;
    private double preco;
    private int quantidade;

    public Produto(String serialNumber, String name, double preco) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.preco = preco;
    }

    public Produto(String serialNumber, String name, double preco, int quantidade) {
        this(serialNumber, name, preco);
        this.quantidade = quantidade;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int qtd){
        this.quantidade = qtd;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "serialNumber=" + serialNumber + ", name=" + name + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
    
    @Override
    public int hashCode() {
        return serialNumber != null? serialNumber.hashCode() : 0 ;
    }
    @Override
    public boolean equals(Object obj) {
       if(obj == null)return false;
       if(obj == this) return true;
       if(this.getClass() != obj.getClass()) return false;
       Produto produto= (Produto) obj;
       return serialNumber != null && serialNumber.equals(produto.getSerialNumber());
    }

    @Override
    public int compareTo(Produto obj) {
        //NEGATIVO DE THIS < OBJ
        //0 SE FOREM IGUAIS
        //POSITIVO SE THIS > OBJ
        //DELEGANDO A CLASSE STRING QUE JÁ POSSUI A IMPLEMENTAÇÃO DO MÉTODO COMPARETO
//        return this.serialNumber.compareTo(obj.getSerialNumber());

        //ORDENANDO POR NOME:
//        return this.name.compareTo(obj.getName());

        //ORDENANDO POR PREÇO, ou declaro Double no atributo ou:
        Double d= preco;
        return d.compareTo(obj.getPreco());
    }
    
    
    
}
