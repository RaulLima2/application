package app_hospedagem.src.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app_hospedagem.src.objetos.Hospedagem;
import app_hospedagem.src.persistencia.HospedagemDAO;

public class HospedagemDAOImp implements HospedagemDAO {
    private Connection conexao;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private String sql;
    
    public HospedagemDAOImp(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserir(Hospedagem hospedagem) throws SQLException {
        sql = "INSERT INTO hospedagem (id_hospedagem, id_cliente, id_quarto, id_funcionario, data_entrada, data_saida, valor_total) VALUES (?, ?, ?, ?, ?, ?, ?)";
        pstmt = conexao.prepareStatement(sql);
        pstmt.setInt(1, hospedagem.getIdHospedagem());
        pstmt.setInt(2, hospedagem.getIdCliente());
        pstmt.setInt(3, hospedagem.getIdQuarto());
        pstmt.setInt(4, hospedagem.getIdFuncionario());
        pstmt.setString(5, hospedagem.getDataEntrada());
        pstmt.setString(6, hospedagem.getDataSaida());
        pstmt.setDouble(7, hospedagem.getValorTotal());
        pstmt.execute();
    }
    
    public void alterar(Hospedagem hospedagem) throws SQLException {
        sql = "UPDATE hospedagem SET id_cliente = ?, id_quarto = ?, id_funcionario = ?, data_entrada = ?, data_saida = ?, valor_total = ? WHERE id_hospedagem = ?";
        
        try {
            pstmt = conexao.prepareStatement(sql);
            pstmt.setInt(1, hospedagem.getIdCliente());
            pstmt.setInt(2, hospedagem.getIdQuarto());
            pstmt.setInt(3, hospedagem.getIdFuncionario());
            pstmt.setString(4, hospedagem.getDataEntrada());
            pstmt.setString(5, hospedagem.getDataSaida());
            pstmt.setDouble(6, hospedagem.getValorTotal());
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        
        pstmt.execute();
    }

    public void excluir(Hospedagem hospedagem) throws SQLException {
        sql = "DELETE FROM hospedagem WHERE id_hospedagem = ?";
        pstmt = conexao.prepareStatement(sql);
        pstmt.setInt(1, hospedagem.getIdHospedagem());
        pstmt.execute();
    }

    public Hospedagem consultar(int id) throws SQLException {
        sql = "SELECT * FROM hospedagem WHERE id_hospedagem = ?";
        pstmt = conexao.prepareStatement(sql);
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();
        Hospedagem hospedagem = new Hospedagem();
        if (rs.next()) {
            hospedagem.setIdHospedagem(rs.getInt("id_hospedagem"));
            hospedagem.setIdCliente(rs.getInt("id_cliente"));
            hospedagem.setIdQuarto(rs.getInt("id_quarto"));
            hospedagem.setIdFuncionario(rs.getInt("id_funcionario"));
            hospedagem.setDataEntrada(rs.getString("data_entrada"));
            hospedagem.setDataSaida(rs.getString("data_saida"));
            hospedagem.setValorTotal(rs.getDouble("valor_total"));
        }
        return hospedagem;
    }

}