package Classes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Climas {
    private int idClima;
    private int idSafra;
    private String clima;
    private LocalDate data;
    private LocalTime hora;
    private float temperatura;
    private String descricao;

    public Climas() {
    }

    public int getIdClima() {
        return idClima;
    }

    public void setIdClima(int idClima) {
        this.idClima = idClima;
    }

    public int getIdSafra() {
        return idSafra;
    }

    public void setIdSafra(int idSafra) {
        this.idSafra = idSafra;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
