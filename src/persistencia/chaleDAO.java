package hospedagem.src.persistencia;

import hospedagem.src.model.Chale;

public interface ChaleDAO {
    public void inserir(Chale chale);
    public void atualizar(Chale chale);
    public void remover(Chale chale);
}
