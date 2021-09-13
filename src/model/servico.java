package CRUD.src.objetos;

/**
 * servico
 */
public class servico {
    private int codServico;
    private String nomeServico;
    private double valorServico;

    // Construtor
    public servico(int codServico, String nomeServico, double valorServico) {
        setCodServico(codServico);
        setNomeServico(nomeServico);
        setValorServico(valorServico);
    }

    // Setter / Getter
    public int getCodServico() {
        return codServico;
    }

    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }
    
    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getValorServico() {
        return valorServico;
    }

}