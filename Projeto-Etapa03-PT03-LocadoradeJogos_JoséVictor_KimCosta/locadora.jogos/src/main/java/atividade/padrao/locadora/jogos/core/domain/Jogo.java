package atividade.padrao.locadora.jogos.core.domain;


public class Jogo {
    private Integer id;
    private String titulo;

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
