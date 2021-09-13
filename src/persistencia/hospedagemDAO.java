package hospedagem.src.persistencia;


import hospedagem.src.modelo.Hospedagem;

public interface HospedagemDAO {
    public void inserir(Hospedagem hospedagem);
    public void atualizar(Hospedagem hospedagem);
    public void remover(Hospedagem hospedagem);
    public Hospedagem buscar(int id);   
}