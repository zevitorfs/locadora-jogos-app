package atividade.padrao.locadora.jogos.core.domain;


public class JogoPlataforma {
    private Integer id;
    private Jogo jogo;
    private Plataforma plataforma;
    private Double precoDiario;

    public Integer getId() {
        return id;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }


    public Double getPrecoDiario() {
        return precoDiario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public void setPrecoDiario(Double precoDiario) {
        this.precoDiario = precoDiario;
    }
}