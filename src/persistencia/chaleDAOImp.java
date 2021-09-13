package hospedagem.src.persistencia;

import hospedagem.src.modelo.Chale;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import hospedagem.src.persistencia.ConnectionFactory;

public class ChaleDAOImp  implements ChaleDAO {
    
    private static ChaleDAOImp instance;
    
    private ChaleDAOImp(){}
    
    public static ChaleDAOImp getInstance(){
        if(instance == null){
            instance = new ChaleDAOImp();
        }
        return instance;
    }

    @Override
    public void inserir(Chale chale) {
        String sql = "insert into chale(localizacao, capacidade, valoraltaestacao, valorbaixaestacao) values(?,?,?,?)"; 
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, chale.getLocalizacao());
            stmt.setInt(2, chale.getCapacidade());
            stmt.setDouble(3, chale.getValorAltaEstacao());
            stmt.setDouble(4, chale.getValorBaixaEstacao());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con);
        }
    }

    @Override
    public void remover(Chale chale) {
        String sql = "delete from chale where codChale=?"; 
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, chale.getCodChale());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con);
        }
    }

    @Override
    public void atualizar(Chale chale) {
        String sql = "updage chale set localizacao=?, capacidade=?, valoraltaestacao=?, valorbaixaestacao=? where codChale=?"; 
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, chale.getLocalizacao());
            stmt.setInt(2, chale.getCapacidade());
            stmt.setDouble(3, chale.getValorAltaEstacao());
            stmt.setDouble(4, chale.getValorBaixaEstacao());
            stmt.setInt(5, chale.getCodChale());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con);
        }
    }

}
