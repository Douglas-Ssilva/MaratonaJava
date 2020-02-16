package maratonajava.sobrecarga;

public class Employee {
    private String name;
    private String cpf;
    private int mat;

    //FAZENDO A SOBRECARGA DE MÉTODOS
    public Employee(String name, String cpf) {
        this.cpf= cpf;
        this.name= name;
        System.out.println("Inicializai name e cpf");
    }
    public Employee(String name, String cpf, int mat) {
        this(name, cpf);
        System.out.println("Inicializei mat");
        this.mat= mat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", cpf=" + cpf + ", mat=" + mat + '}';
    }

    
}
