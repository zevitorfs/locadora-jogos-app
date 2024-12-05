package atividade.padrao.locadora.jogos.core.ports.input.services;

import atividade.padrao.locadora.jogos.core.domain.Locacao;

public interface ICalcularCustoService {

    Double calcularCustoTotal(Locacao locacao);
}
