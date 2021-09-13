package application.src.model;

/**
 * cliente
 */
public class Cliente {
    private int codCliente;
    private String nomeCliente;
    private String rgCliente;
    private String enderecoCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String estadoCliente;
    private String cepCliente;
    private LocalDate nascimentoCliente;

    // Constructor
    public void cliente(int cod, String[] args, LocalDate nascimento) {
        setCodcliente(cod);
        setNomecliente(args[0]);
        setRgcliente(args[1]);
        setEnderecocliente(args[2]);
        setBairrocliente(args[3]);
        setCidadecliente(args[4]);
        setEstadocliente(args[5]);
        setCEPcliente(args[6]);
        setNascimentocliente(nascimento);
    }

    //Getter /Setter

    public void setCodcliente(int cod) {
        this.codCliente = cod;
    }

    public void setNomecliente(String nome) {
        this.nomeCliente = nome;
    }
    public void setRgcliente(String rg) {
        this.rgCliente  = rg;
    }
    public void setEnderecocliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    public void setBairrocliente(String bairro) {
        this.bairroCliente = bairro;
    }

    public void setCidadecliente(String cidade) {
        this.cidadeCliente = cidade;
    }

    public void setEstadocliente(String estado) {
        this.estadoCliente= estado;
    }

    public void setCepcliente(String cep) {
        this.cepCliente = cep;
    }

    public void setNascimentocliente(LocalDate nascimento) {
        this.nascimentoCliente = nascimento;
    }

    public int getCodcliente() {
        return this.codCliente ;
    }

    public String getNomecliente() {
        return this.nomeCliente;
    }

    public String getRgcliente() {
        return this.rgCliente;
    }
    public String getEnderecocliente() {
        return this.enderecoCliente;
    }
    public String getBairrocliente() {
        return this.bairroCliente;
    }

    public String getCidadecliente() {
        return this.cidadeCliente;
    }

    public String getEstadocliente() {
        return this.estadoCliente;
    }

    public String getCepcliente() {
        return this.cepCliente;
    }

    public LocalDate getNascimentocliente() {
        return this.nascimentoCliente;
    }


}