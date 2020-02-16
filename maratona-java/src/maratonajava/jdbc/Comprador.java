package maratonajava.jdbc;
 
import java.util.Objects;
public class Comprador implements Comparable<Comprador>{
    private Integer id;
    private String nome;
    private String cpf;

    public Comprador() {
    }
    public Comprador(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Comprador(Integer id, String nome, String cpf) {
        this(nome,cpf);
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comprador other = (Comprador) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comprador{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + '}';
    }

    @Override
    public int compareTo(Comprador t) {
        return this.id.compareTo(t.id);
    }
//    @Override
//    public int compareTo(Comprador t) {
//        return this.nome.compareTo(t.nome);
//    }
    

    
    
    
}
