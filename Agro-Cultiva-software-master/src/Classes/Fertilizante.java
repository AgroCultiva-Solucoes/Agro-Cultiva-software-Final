package Classes;

public class Fertilizante {
    
    private int idFertilizante;
    private String nomeFertilizante;
    private String tipoFertilizante;
    private String descricao;

    public Fertilizante(String nomeFertilizante, String tipoFertilizante, String descricao) {
        this.nomeFertilizante = nomeFertilizante;
        this.tipoFertilizante = tipoFertilizante;
        this.descricao = descricao;
    }

    public int getIdFertilizante() {
        return idFertilizante;
    }

    public void setIdFertilizante(int idFertilizante) {
        this.idFertilizante = idFertilizante;
    }

    public String getNomeFertilizante() {
        return nomeFertilizante;
    }

    public void setNomeFertilizante(String nomeFertilizante) {
        this.nomeFertilizante = nomeFertilizante;
    }

    public String getTipoFertilizante() {
        return tipoFertilizante;
    }

    public void setTipoFertilizante(String tipoFertilizante) {
        this.tipoFertilizante = tipoFertilizante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
 
}
