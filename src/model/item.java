/**
 * item
 */
package application.src.model;

public class Item {
    private int codItem;
    private String nomeItem;
    private String descricaoItem;
    
    // Constructor

    public Item(int codItem, String nomeItem, String descricaoItem) {
        setCodItem(codItem);
        setNomeItem(nomeItem);
        setDescricaoItem(descricaoItem);
    }

    // Getter / Setter
    public int getCodItem() {
        return codItem;
    }
    
    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }
}