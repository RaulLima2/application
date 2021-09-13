/**
 * hospedagem
 */

import java.time.LocalDate;


import application.src.model;

public class Hospedagem {
    private int codHospedagem;
    private Chale chale;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private int qtdPessoas;
    private double desconto;
    private double valorFinal;

    // Construtor
    public Hospedagem(int codHospedagem, Chale chale, LocalDate dataInicio, LocalDate dataFim, int qtdPessoas, double desconto, double valorFinal) {
        setCodHospedagem(codHospedagem);
        setChale(chale);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setQtdPessoas(qtdPessoas);
        setDesconto(desconto);
        setValorFinal(valorFinal);        
    }


    //Setter / Getter
    
    public int getCodHospedagem() {
        return codHospedagem;
    }

    public void setCodHospedagem(int codHospedagem) {
        this.codHospedagem = codHospedagem;
    }

    public Chale getChale() {
        return chale;
    }
    
    public void setChale(Chale chale) {
        this.chale = chale;
    }
    
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}