package atividade.padrao.locadora.jogos.core.services;

import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.input.services.ICalcularCustoService;

public class CalcularCustoService implements ICalcularCustoService {
    @Override
    public Double calcularCustoTotal(Locacao locacao) {
        return locacao.getItens().stream().mapToDouble(
                item -> item.getJogoPlataforma().getPrecoDiario()*item.getDias()*item.getQuantidade()
        ).sum();
    }
}
