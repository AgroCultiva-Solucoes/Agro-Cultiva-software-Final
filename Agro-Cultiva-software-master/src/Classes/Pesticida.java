package Classes;

public class Pesticida {

    private int idPesticida;
    private String nomePesticida;
    private String tipoPesticida;
    private String descricao;
    
    public Pesticida(){
    }

    public Pesticida(String nomePesticida, String tipoPesticida, String descricao) {
        this.nomePesticida = nomePesticida;
        this.tipoPesticida = tipoPesticida;
        this.descricao = descricao;
    }

    public int getIdPesticida() {
        return idPesticida;
    }

    public void setIdPesticida(int idPesticida) {
        this.idPesticida = idPesticida;
    }

    public String getNomePesticida() {
        return nomePesticida;
    }

    public void setNomePesticida(String nomePesticida) {
        this.nomePesticida = nomePesticida;
    }

    public String getTipoPesticida() {
        return tipoPesticida;
    }

    public void setTipoPesticida(String tipoPesticida) {
        this.tipoPesticida = tipoPesticida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}