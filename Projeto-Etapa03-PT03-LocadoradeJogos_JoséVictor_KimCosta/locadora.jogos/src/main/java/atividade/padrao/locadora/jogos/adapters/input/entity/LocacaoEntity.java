package atividade.padrao.locadora.jogos.adapters.input.entity;
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
public class LocacaoEntity extends atividade.padrao.locadora.jogos.core.domain.Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLocacao;

    @ManyToOne
    @JoinColumn(name = "cliente_fk", nullable = false)
    private ClienteEntity clienteEntity;

    @NotNull
    @PastOrPresent
    private LocalDate data;

    @OneToMany (mappedBy = "locacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemLocacaoEntity> itens;



}
