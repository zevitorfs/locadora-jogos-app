package atividade.padrao.locadora.jogos.core.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

}
