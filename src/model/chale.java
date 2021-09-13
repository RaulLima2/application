package application.src.model;

public class Chale {
    private int codChale;
    private String localizacao;
    private int capacidade;
    private double valorAltaEstacao;
    private double valorBaixaEstacao;

    // Constructor
    public Chale(int codChale, String localizacao, int capacidade, double valorAltaEstacao, double valorBaixaEstacao) {
        setCodchale(codChale);
        setLocalizacao(localizacao);
        setCapacidade(capacidade);
        setValorAltaEstacao(valorAltaEstacao);
        setValorBaixaEstacao(valorBaixaEstacao);
    }

    //Getter/Setter

    public void setCodchale(int cod){
        this.codChale = cod;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setValoraltaestacao(double valorAltaEstacao) {
        this.valorAltaEstacao = valorAltaEstacao;
    }

    public void setValorbaixaestacao(double valorBaixaEstacao) {
        this.valorBaixaEstacao = valorBaixaEstacao;
    }

    public int getCodchale(){
        return this.codChale;
    }

    public String getLocalizacao(){
        return this.localizacao;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public double getValoraltaestacao() {
        return this.valorAltaEstacao;
    }

    public double getValorbaixaestacao() {
        return this.valorBaixaEstacao;
    }

}