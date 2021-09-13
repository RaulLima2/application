package hospedagem.src.persistencia;

import hospedagem.src.objetos.Cliente;

public interface ClienteDAO {
    public void cadastrarCliente(Cliente cliente);
    public Cliente buscarCliente(String cpf);
    public void atualizarCliente(Cliente cliente);
    public void removerCliente(Cliente cliente);
}