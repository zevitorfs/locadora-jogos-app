package atividade.padrao.locadora.jogos.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemLocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    @JoinColumn(name="jogo_plataforma_fk")
    private JogoPlataforma jogoPlataforma;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "locacao_fk")
    private Locacao locacao;

    @NotNull
    @Min(1)
    private Integer dias;

    @NotNull
    @Min(1)
    private Integer quantidade;

}
