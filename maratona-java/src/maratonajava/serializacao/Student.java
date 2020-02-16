package maratonajava.serializacao;
 
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Student implements Serializable{
    private long id;
    private String name;
    private transient String password;
    private Class turma;
    private static final String NAMESCHOOL= "DevDojo";
    
    public Student(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Class getTurma() {
        return turma;
    }

    public void setTurma(Class turma) {
        this.turma = turma;
    }


    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", password=" + password + ", school=" + NAMESCHOOL + ", turma=" + turma +'}';
    }
    
    //MÉTODOS ESPECIAIS PARA SE USAR COM O TRASIENT A FIM DE SE OBTER O MESMO RESULTADO COM A SERIALIZABLE
    //será chamado ao serializarmos
    private void writeObject(ObjectOutputStream os){
        try {
            os.defaultWriteObject();        //tente fazer a serialização normal
            os.writeUTF(turma.getName());   //escreva algo a mais
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void readObject(ObjectInputStream oi){
        try {
            oi.defaultReadObject();
            turma= new Class(oi.readUTF());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    
}
