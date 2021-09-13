package hospedagem.src.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import hospedagem.src.modelo.Cliente;

public class ClienteDAOImp implements ClienteDAO {
    
    private Connection conexao;
    
    public ClienteDAOImp(Connection conexao) {
        this.conexao = conexao;
    }
    
    @Override
    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email, endereco, numero, bairro, cidade, estado, cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getEndereco());
            stmt.setInt(6, cliente.getNumero());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getEstado());
            stmt.setString(10, cliente.getCep());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? WHERE id = ?";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getEndereco());
            stmt.setInt(6, cliente.getNumero());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getEstado());
            stmt.setString(10, cliente.getCep());
            stmt.setInt(11, cliente.getId());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void excluir(Cliente cliente) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, cliente.getId());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}