package maratonajava.polimorfismo;
 
public class DriverDAO {
    public static void main(String[] args) {
//        ArquivoDAOImpl files= new ArquivoDAOImpl();
//        files.save();
        //QUERO SALVAR AGORA NO BANCO DE DADOS, NÃO BASTA SOMENTE MUDAR O OBJETO QUE EXECUTA, POIS OCORRE ERRO DE COMPILAÇÃO
        //TROCA-SE O OBJETO E TAMBÉM A VARIÁVEL DE REFERÊNCIA, NESSE CASO É A INTERFACE
        //BASTA TROCAR O OBJETO AGORA QUE A EXECUÇÃO SE DÁ DE ACORCO COM ELE.
        InterfaceDAO files= new DatabaseDAOImpl();
        InterfaceDAO f= new ArquivoDAOImpl();
        files.save();
        f.save();
        
        
    }
    
}
