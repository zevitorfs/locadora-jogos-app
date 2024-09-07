package atividade.padrao.locadora.jogos.core.ports.input.services;

import atividade.padrao.locadora.jogos.core.domain.JogoPlataforma;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
public interface ILocacaoServices {

    Locacao save(Locacao locacao);

    Locacao update(Integer id, Locacao locacao);

    void delete(Integer id);

}
