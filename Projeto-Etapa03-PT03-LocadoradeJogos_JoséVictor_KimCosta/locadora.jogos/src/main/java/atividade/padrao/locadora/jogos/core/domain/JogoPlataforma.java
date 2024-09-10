package atividade.padrao.locadora.jogos.core.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JogoPlataforma {

    private Integer id;
    private Jogo jogo;
    private Plataforma plataforma;
    private Double precoDiario;


}