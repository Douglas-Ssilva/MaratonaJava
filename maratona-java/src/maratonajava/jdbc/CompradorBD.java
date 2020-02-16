package maratonajava.jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.JdbcRowSet;

public class CompradorBD {

    public static void save(Comprador comprador) {
        Connection com = ConnectionFactory.getConexao();
        //        String sql= "insert into `agencia`.`comprador`(`cpf`, `nome`) values('111.111.111-11','Douglas')";
        String sql = "insert into `agencia`.`comprador`(`cpf`, `nome`) values('" + comprador.getCpf() + "','" + comprador.getNome() + "')";

        try {
            //            objeto que trabalhará com os dados no banco
            Statement stmt = com.createStatement();
            System.out.println(stmt.executeUpdate(sql));        //irá alterar o estado do banco
            ConnectionFactory.closedConnection(com, stmt);
            System.out.println("Registro inserido com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Comprador sem ID.");
            return;
        }
        String sql = "delete from agencia.comprador where id= '" + comprador.getId() + "'";
        Connection conexao = ConnectionFactory.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConnectionFactory.closedConnection(conexao, stmt);
            System.out.println("Registro deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Comprador sem ID.");
            return;
        }
        String sql = "update agencia.comprador set nome= '" + comprador.getNome() + "', cpf= '" + comprador.getCpf() + "' where id= '" + comprador.getId() + "'";
        Connection conexao = ConnectionFactory.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConnectionFactory.closedConnection(conexao, stmt);
            System.out.println("Registro updatado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectAll() {
        String sql = "select id, nome, cpf from agencia.comprador";
        Connection conexao = ConnectionFactory.getConexao();
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<Comprador> list = new ArrayList<>();
            while (rs.next()) {
                //POSSO PASSAR O NOME DA COLUNA OU SEU ÍNDICE
                list.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
                //                System.out.print(rs.getInt("id") + " ");
                //                System.out.print(rs.getString(2)+ " ");
                //                System.out.print(rs.getString("cpf")+ " \n");
            }
            ConnectionFactory.closedConnection(conexao, stmt, rs);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String name) {
        String sql = "select * from agencia.comprador where nome like '%" + name + "%'";
        Connection com = ConnectionFactory.getConexao();
        try {
            Statement stmt = com.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<Comprador> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConnectionFactory.closedConnection(com, stmt, rs);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //QUANDO NÃO POSSUO PODER SOBRE O SQL E QUERO SABER OS METADADOS
    public static void metaData() {
        String sql = "select * from agencia.comprador";
        Connection com = ConnectionFactory.getConexao();
        try {
            Statement stmt = com.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            //Movendo o cursor p PRA PRIMEIRA COLUNA, SE QUISESSE POR TODAS TERIA QUE ITERAR
            rs.next();
            int qtdColunas = metaData.getColumnCount();
            System.out.println("Total colunas: " + qtdColunas);
            for (int i = 1; i <= qtdColunas; i++) {
                System.out.print("Tabela: " + metaData.getTableName(i) + " ");
                System.out.print("Coluna: " + metaData.getColumnName(i) + " ");
                System.out.println("Tamanho coluna: " + metaData.getColumnDisplaySize(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection com = ConnectionFactory.getConexao();
        try {
            DatabaseMetaData dbmd = com.getMetaData();
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta: TYPE_FORWARD_ONLY");
                //MODO DE CONCORRENCIA, POSSO OU NAO ATALIZAR O REGISTRO, OU APENAS P LEITURA
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {   //tipo do resultSET e leitura ou atualzar
                    System.out.println("E também : CONCUR_UPDATABLE");

                }
            }
            //POSSO MOVER O CURSO P QUALQUER LUGAR, QUALQUER MUDANÇA NO BD NÃO AFETA AQUI
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta: TYPE_SCROLL_INSENSITIVE");
                //MODO DE CONCORRENCIA, POSSO OU NAO ATALIZAR O REGISTRO, OU APENAS P LEITURA
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {   //tipo do result e leitura ou atualzar
                    System.out.println("E também : CONCUR_UPDATABLE");

                }
            }
            //QUALQUER ALTERAÇÃO AQUI, CASO O RESULTSET ESTEJA ABERTO, QUALQUER MODIFICAÇÃO NO DB AFETA
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta: TYPE_SCROLL_INSENSITIVE");
                //MODO DE CONCORRENCIA, POSSO OU NAO ATALIZAR O REGISTRO, OU APENAS P LEITURA
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {   //tipo do result e leitura ou atualzar
                    System.out.println("E também : CONCUR_UPDATABLE");

                }
            }
            ConnectionFactory.closedConnection(com);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testeScrolInsensitive() {
        String sql = "select id, nome, cpf from agencia.comprador order by id";
        Connection com = ConnectionFactory.getConexao();
        try {
            //POR PADRÃO DEFINE ASIM
            Statement stmt = com.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            Statement stmt= com.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //MOVE O CURSO P ÚLTIMA LINHA
            if (rs.last()) {
                System.out.println(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
                System.out.println("Ultima linha: " + rs.getRow());
            }
            //FORMAS DE IR DIRETO P LINHAS
            System.out.println("Retornou para a primeira linha: " + rs.first());
            rs.absolute(2);
            //MOVE NA BASEADO NA LINHA QUE ESTOU
            rs.relative(-1);//VAI P LINHA 1, ESTÁ NA LINHA 2
            //PERCORRENDO A LISTA DE TRÁS PRA FRENTE
            rs.afterLast(); //pois se for no after, irá pular o último
            while (rs.previous()) {
                System.out.println(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
            }
            ConnectionFactory.closedConnection(com, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    USAR RS.CANCELROWUPDATE() PARA DESFAZER AS ALTERAÇÕES DO UPDATE

    public static void updateResultSet() {
        String sql = "select id, nome,cpf from agencia.comprador";
        Connection com = ConnectionFactory.getConexao();
        try {
            //ACARRETA EXCEPTION SE NÃO PASSAR OS VALORES
            Statement stmt = com.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                //ATUALIZANDO A LINHAS DA COLUNA NOME
                rs.updateString("nome", rs.getString("nome").toLowerCase());
                //ATUALIZANDO NO BD
                rs.updateRow();
            }
            rs.beforeFirst();
//           while(rs.next()){
//                System.out.println(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
//           }
            ConnectionFactory.closedConnection(com, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertResultSet() {
        String sql = "select * from agencia.comprador";
        Connection com = ConnectionFactory.getConexao();
        try {
            Statement stmt = com.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            rs.absolute(1);
            String nome = "César";
            rs.moveToInsertRow();        //MOVENDO O CURSOR PARA LINHA TEMPORÁRIA
            rs.updateString("nome", nome);
            rs.updateString("cpf", "989.989.989-98");
            rs.insertRow();               //insira essa linha
            ConnectionFactory.closedConnection(com, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
//INSERINDO REGISTROS
//            rs.absolute(2);
//            String nome= rs.getString("nome");
//            rs.moveToInsertRow();          
////          System.out.println(rs.getString("nome"));         null
//            rs.updateString("nome", nome.toUpperCase());        //setando JOAO na nova linha
//            rs.updateString("cpf", "999.999.999-99");
//            rs.insertRow();           
//            rs.moveToCurrentRow();      //retornando p linha que estava antes da temp
//            System.out.println(rs.getString("nome") + " " + rs.getRow());
    }
    public static void deleteResultSet(){
        String sql = "select * from agencia.comprador";
        Connection com= ConnectionFactory.getConexao();
        try{
            Statement stmt= com.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= stmt.executeQuery(sql);
            rs.absolute(5);
            rs.deleteRow();
            ConnectionFactory.closedConnection(com, stmt, rs);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
     public static List<Comprador> searchByNamePreparedStatement(String name) {
        String sql = "select * from agencia.comprador where nome like ?";
        Connection com = ConnectionFactory.getConexao();
        try {
            PreparedStatement ps = com.prepareStatement(sql);
            //NO PRIMEIRO CAMPO SET ISSO
            ps.setString(1, "%"+name+"%");
            ResultSet rs = ps.executeQuery();
            List<Comprador> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConnectionFactory.closedConnection(com, ps, rs);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
      public static void updatePreparedStatement(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Comprador sem ID.");
            return;
        }
        String sql = "update agencia.comprador set nome= ?, cpf= ? where id= ?";
        Connection conexao = ConnectionFactory.getConexao();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, comprador.getNome());
            ps.setString(2, comprador.getCpf());
            ps.setInt(3, comprador.getId());
            ps.executeUpdate();
            ConnectionFactory.closedConnection(conexao, ps);
            System.out.println("Registro updatado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void callableStatementProcedure(String nome){
        String sql= "CALL `agencia`.`procedure_getnome`(?)";
        Connection con= ConnectionFactory.getConexao();
        try{
            CallableStatement cs= con.prepareCall(sql);
            cs.setString(1, "%"+nome+"%");
            ResultSet rs= cs.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("nome") +" - "+  rs.getString("cpf"));
            }
            ConnectionFactory.closedConnection(con, cs, rs);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void selectJdbcRowSet(String nome){
        String sql= "select * from agencia.comprador where nome like ?";
        JdbcRowSet jdbc= ConnectionFactory.getJdbcRowSet();
        jdbc.addRowSetListener(new MyRowSetListener());
        try{
            //Comando que mandará para o banco
            jdbc.setCommand(sql);
            jdbc.setString(1, "%"+nome+"%");
            jdbc.execute();
            while(jdbc.next()){
                System.out.println(jdbc.getString("nome") + " ");
            }
            ConnectionFactory.closedConnection(jdbc);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
     public static void updateRowSet2(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
//        String sql = "UPDATE `agencia`.`comprador` SET `cpf`= ?, `nome`= ? WHERE `id`= ? ";
        String sql = "SELECT * FROM comprador where id = ?";
        JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet();
        jrs.addRowSetListener(new MyRowSetListener());
        try {
            jrs.setCommand(sql);
//            jrs.setString(1, comprador.getCpf());
//            jrs.setString(2, comprador.getNome());
            jrs.setInt(1, comprador.getId());
            jrs.execute();
            jrs.next();
            jrs.updateString("nome", "WILLIAM");
            jrs.updateRow();
            ConnectionFactory.closedConnection(jrs);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
