package atividade.padrao.locadora.jogos.core.ports.input;

import atividade.padrao.locadora.jogos.core.domain.JogoPlataforma;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
public interface ILocacaoServices {

    Locacao update(Integer id, Locacao locacao);


    Double calcularCustoTotal(Locacao locacao);

    void adicionarJogoALocacao(Locacao locacao, JogoPlataforma jogoPlataforma, int dias);

}
