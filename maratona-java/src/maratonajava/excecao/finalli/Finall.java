package maratonajava.excecao.finalli;
public class Finall {

    public static void main(String[] args) {
            end();
    }

    public static void end() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Lendo o arquivo");
//            throw new Exception();        nem executa a linha de baixo
            System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fechando o arquivo.");
        }
    }
}
