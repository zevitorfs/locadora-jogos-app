package atividade.padrao.locadora.jogos.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLocacao;

    @ManyToOne
    @JoinColumn(name = "cliente_fk", nullable = false)
    private Cliente cliente;

    @NotNull
    @PastOrPresent
    private LocalDate data;

    @OneToMany (mappedBy = "locacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemLocacao> itens;



}
