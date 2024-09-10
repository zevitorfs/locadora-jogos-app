package atividade.padrao.locadora.jogos.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItemLocacao {

    private Integer id;
    private JogoPlataforma jogoPlataforma;
    private Locacao locacao;
    private Integer quantidade;
    private Integer dias;


}
