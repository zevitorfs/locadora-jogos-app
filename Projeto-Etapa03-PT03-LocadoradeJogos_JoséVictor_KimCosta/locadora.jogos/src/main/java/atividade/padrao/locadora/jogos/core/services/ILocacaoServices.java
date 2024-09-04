package atividade.padrao.locadora.jogos.core.services;

import atividade.padrao.locadora.jogos.core.domain.Locacao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public interface ILocacaoServices {

    Locacao save(Locacao locacao);
    List<Locacao> buscarTodasLocacoes();

    Locacao buscarLocacaoId(Integer id);

    Locacao update(Integer id, Locacao locacao);

    void delete(Integer id);
    Double calcularCustoTotal(Locacao locacao);

    Locacao obterLocacaoId(Integer id);



}
