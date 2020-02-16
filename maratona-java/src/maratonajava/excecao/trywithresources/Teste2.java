package maratonajava.excecao.trywithresources;
 
public class Teste2 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando teste 2");
    }
    
}
