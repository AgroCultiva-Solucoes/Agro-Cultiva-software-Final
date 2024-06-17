package Classes;

import java.util.Date;

public class Estoque {

    private int idEstoque;
    private Integer idSafra;
    private Integer idPesticida;
    private Integer idFertilizante; 
    private String nome;
    private double quantidade;
    private double preco;
    private Date dataEntrada;
    private Date dataSaida;
    private String descricao;

    public Estoque() {
    }

    public Estoque(int idEstoque, String nome, double quantidade, double preco, String descricao) {
        this.idEstoque = idEstoque;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Estoque(int idEstoque, Integer idSafra, Integer idPesticida, Integer idFertilizante, String nome, double quantidade, double preco, Date dataEntrada, Date dataSaida, String descricao) {
        this.idEstoque = idEstoque;
        this.idSafra = idSafra;
        this.idPesticida = idPesticida;
        this.idFertilizante = idFertilizante;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.descricao = descricao;
    }

    public Estoque(int idEstoque, double quantidade, double preco) {
        this.idEstoque = idEstoque;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public Integer getIdSafra() {
        return idSafra;
    }

    public void setIdSafra(Integer idSafra) {
        this.idSafra = idSafra;
    }

    public Integer getIdPesticida() {
        return idPesticida;
    }

    public void setIdPesticida(Integer idPesticida) {
        this.idPesticida = idPesticida;
    }

    public Integer getIdFertilizante() {
        return idFertilizante;
    }

    public void setIdFertilizante(Integer idFertilizante) {
        this.idFertilizante = idFertilizante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
