package atividade.padrao.locadora.jogos.adapters.input.entity;

import atividade.padrao.locadora.jogos.core.domain.Plataforma;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JogoPlataforma extends atividade.padrao.locadora.jogos.core.domain.JogoPlataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "plataforma_fk")
    private Plataforma plataforma;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "jogo_fk")
    private Jogo jogo;

    @NotNull
    @Min(0)
    private Double precoDiario;
}
