package maratonajava.excecao.trywithresources;
 
public class Teste1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando teste 1");
    }
    
}
