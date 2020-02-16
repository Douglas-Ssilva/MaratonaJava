package maratonajava.jdbc;
import java.sql.SQLException;
import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

public class MyRowSetListener implements RowSetListener {

    @Override
    public void rowSetChanged(RowSetEvent rse) {
        System.out.println("Comando execute executado!");
    }

    @Override
    public void rowChanged(RowSetEvent rse) {
        System.out.println("Linha atualizada, deletada ou inserida!");
        //VERIFICANDO SE O EVENTO É DO TIPO ROWSET
        if(rse.getSource() instanceof RowSet) {
            try {
                ((RowSet)rse.getSource()).execute();    //CRIANDO UMA VARIÁVEL TEMPORÁRIA
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void cursorMoved(RowSetEvent rse) {
        System.out.println("Cursor se moveu!");
    }

}
