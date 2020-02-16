package maratonajava.jdbc;

import java.util.Collections;
import java.util.List;
public class TesteConexao {

    public static void main(String[] args) {
//        ConnectionFactory com= new ConnectionFactory();
//        com.getConexao();
//        Connection conexao = ConnectionFactory.getConexao();
//            Comprador comprador= new Comprador("Douglas","222.222.222-22");
//            CompradorBD compradorBD= new CompradorBD();
//            compradorBD.save(comprador);
//            compradorBD.update();
//            compradorBD.delete();
//            delete();
//            update();
//            insert();
//            List<Comprador> list= selectAll();
//            Collections.sort(list);
//            System.out.println(list);
//                List<Comprador> list= selectByName("igor");
//                System.out.println(list);
//                CompradorBD.metaData();
//                CompradorBD.checkDriverStatus();
//                CompradorBD.testeScrolInsensitive();
//                CompradorBD.updateResultSet();
//                CompradorBD.insertResultSet();
//                CompradorBD.deleteResultSet();
//                  System.out.println(CompradorBD.searchByNamePreparedStatement("ou"));
//                  CompradorBD.updatePreparedStatement(new Comprador(6, "Geraldo", "899.989.988-98"));
//                  CompradorBD.callableStatementProcedure("In");
//                  CompradorBD.selectJdbcRowSet("i");
                  CompradorBD.updateRowSet2(new Comprador(8, "MariaDB", "999.999.999-77"));
                        

    }

    public static void delete() {
        Comprador comprador = new Comprador();
        comprador.setId(5);
        CompradorBD.delete(comprador);
    }

    public static void insert() {
        Comprador comprador = new Comprador("Douglas", "444.444.444-44");
        CompradorBD.save(comprador);
    }
    public static void update() {
        Comprador comprador= new Comprador(5, "Madrinha","888.888.888-88");
        CompradorBD.update(comprador);
    }
    public static List<Comprador> selectAll(){
       return CompradorBD.selectAll();
    }
    public static List<Comprador> selectByName(String s){
        return CompradorBD.searchByName(s);
    }

}
