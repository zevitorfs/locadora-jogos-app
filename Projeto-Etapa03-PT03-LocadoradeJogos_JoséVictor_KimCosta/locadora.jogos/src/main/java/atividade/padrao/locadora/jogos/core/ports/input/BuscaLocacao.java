package atividade.padrao.locadora.jogos.core.ports.input;

import atividade.padrao.locadora.jogos.core.domain.Locacao;

import java.util.List;

public interface BuscaLocacao {
    List<Locacao> buscarTodasLocacoes();
}
