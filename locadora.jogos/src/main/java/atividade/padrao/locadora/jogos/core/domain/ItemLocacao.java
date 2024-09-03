package atividade.padrao.locadora.jogos.core.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ItemLocacao")
public class ItemLocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="jogo_plataforma_id", nullable = false)
    private JogoPlataforma jogoPlataforma;

    @ManyToOne
    @JoinColumn(name = "locacao_id", nullable = false)
    private Locacao locacao;

    @Column(nullable = false)
    private int dias;

    @Column(nullable = false)
    private int quantidade;

}
