package atividade.padrao.locadora.jogos.core.ports.input.services;

import atividade.padrao.locadora.jogos.core.domain.JogoPlataforma;
import atividade.padrao.locadora.jogos.core.domain.Locacao;

public interface IAdicionaJogoAlocacao {
    void adicionarJogoALocacao(Locacao locacao, JogoPlataforma jogoPlataforma, int dias);
}
