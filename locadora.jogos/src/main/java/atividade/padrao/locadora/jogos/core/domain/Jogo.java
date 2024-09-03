package atividade.padrao.locadora.jogos.core.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Jogo")
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String titulo;

    @OneToMany (mappedBy = "jogo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JogoPlataforma> jogoPlataformas;
}
