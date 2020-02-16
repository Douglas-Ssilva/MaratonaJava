package maratonajava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class ConnectionFactory {

    public static Connection getConexao() {
//        String url= "jdbc:mysql://localhost:3306/agencia";
        String url = "jdbc:mysql://localhost:3306/agencia?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static JdbcRowSet getJdbcRowSet(){
        String url= "jdbc:mysql://localhost:3306/agencia?useTimezone=true&serverTimezone=UTC";
        String user="root";
        String password="";
        try{
            JdbcRowSet jdbc= RowSetProvider.newFactory().createJdbcRowSet();
            jdbc.setUrl(url);
            jdbc.setUsername(user);
            jdbc.setPassword(password);
            return jdbc;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        return null;
    }

    //CRIANDO O FECHAR CONNECTION AQUI POIS SENÃO TODA VEZ TEREI QUE USAR TRY CATCH NO MAIN
    public static void closedConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closedConnection(Connection connection, Statement stmt) {
        closedConnection(connection);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closedConnection(Connection connection, Statement stmt, ResultSet rs) {
        closedConnection(connection, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void closedConnection(JdbcRowSet jdbc) {
        try {
            if (jdbc != null) {
                jdbc.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
