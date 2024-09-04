package atividade.padrao.locadora.jogos.core.domain;

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
public class JogoPlataforma {
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