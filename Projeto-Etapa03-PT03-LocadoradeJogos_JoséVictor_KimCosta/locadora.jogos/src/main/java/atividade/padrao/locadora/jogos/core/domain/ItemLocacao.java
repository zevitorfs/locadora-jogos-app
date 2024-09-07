package atividade.padrao.locadora.jogos.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

public class ItemLocacao {

    private Integer id;
    private JogoPlataforma jogoPlataforma;
    private Locacao locacao;
    private Integer quantidade;
    private Integer dias;


    public Integer getId() {
        return id;
    }

    public JogoPlataforma getJogoPlataforma() {
        return jogoPlataforma;
    }

    public Locacao getLocacao() {
        return locacao;
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer getDias() {
        return dias;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJogoPlataforma(JogoPlataforma jogoPlataforma) {
        this.jogoPlataforma = jogoPlataforma;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
}
