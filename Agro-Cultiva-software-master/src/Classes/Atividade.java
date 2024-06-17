package Classes;

import java.time.LocalDate;

public class Atividade {   
    
    private int idAtividades;
    private int IdUsuario;
    private int IdSafra;
    private int IdPesticida;
    private int IdFertilizante;
    private String tipo;
    private double qtdd;
    private LocalDate dataAtividade;
    private String descricao;

    public int getIdAtividades() {
        return idAtividades;
    }

    public void setIdAtividades(int idAtividades) {
        this.idAtividades = idAtividades;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public int getIdSafra() {
        return IdSafra;
    }

    public void setIdSafra(int IdSafra) {
        this.IdSafra = IdSafra;
    }

    public int getIdPesticida() {
        return IdPesticida;
    }

    public void setIdPesticida(int IdPesticida) {
        this.IdPesticida = IdPesticida;
    }

    public int getIdFertilizante() {
        return IdFertilizante;
    }

    public void setIdFertilizante(int IdFertilizante) {
        this.IdFertilizante = IdFertilizante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getQtdd() {
        return qtdd;
    }

    public void setQtdd(double qtdd) {
        this.qtdd = qtdd;
    }

    public LocalDate getDataAtividade() {
        return dataAtividade;
    }

    public void setDataAtividade(LocalDate dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
