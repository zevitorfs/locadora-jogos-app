package atividade.padrao.locadora.jogos.adapters.input.entity;

import atividade.padrao.locadora.jogos.core.domain.JogoPlataforma;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemLocacaoEntity extends atividade.padrao.locadora.jogos.core.domain.ItemLocacao {

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

