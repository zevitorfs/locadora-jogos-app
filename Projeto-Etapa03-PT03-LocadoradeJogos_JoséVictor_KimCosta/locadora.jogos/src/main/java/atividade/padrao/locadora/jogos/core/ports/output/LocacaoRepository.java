package atividade.padrao.locadora.jogos.core.ports.output;

import atividade.padrao.locadora.jogos.core.domain.Locacao;

public interface LocacaoRepository{
    Locacao save(Locacao locacao);
    Locacao obterLocacaoId(Integer id);
    void delete(Integer id);
}
