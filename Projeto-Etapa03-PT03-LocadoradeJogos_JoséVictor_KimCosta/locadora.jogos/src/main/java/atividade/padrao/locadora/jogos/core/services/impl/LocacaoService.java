package atividade.padrao.locadora.jogos.core.services.impl;

import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.output.LocacaoRepository;
import atividade.padrao.locadora.jogos.core.services.ILocacaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocacaoService implements ILocacaoServices {

    @Autowired
    private LocacaoRepository repositorioLocacao;

    @Override
    public Locacao save(Locacao locacao) {
        return repositorioLocacao.save(locacao);
    }

    @Override
    public List<Locacao> buscarTodasLocacoes() {
        return repositorioLocacao.findAll();
    }

    @Override
    public Locacao buscarLocacaoId(Integer id) {
        return repositorioLocacao.findById(id).orElseThrow();
    }

    @Override
    public Locacao update(Integer id, Locacao locacaoAtualizada) {
        return repositorioLocacao.findById(id)
                .map(locacao -> {
                    locacao.setData(locacaoAtualizada.getData());
                    locacao.setItens(locacaoAtualizada.getItens());
                    return repositorioLocacao.save(locacao);
                })
                .orElseThrow(()-> new RuntimeException("Locação não encontra com ID" + id));

    }

    @Override
    public void delete(Integer id) {
        repositorioLocacao.deleteById(id);

    }

//    @Override
//    public BigDecimal calcularCustoTotal(Locacao locacao) {
//        return null;
//    }

    @Override
    public Double calcularCustoTotal(Locacao locacao) {
        return locacao.getItens().stream().mapToDouble(
                item -> item.getJogoPlataforma().getPrecoDiario()*item.getDias()*item.getQuantidade()
        ).sum();
    }

    @Override
    public Locacao obterLocacaoId(Integer id) {
        return repositorioLocacao.findById(id)
                .orElseThrow(() -> new RuntimeException("Locação não encontrada para o ID: " + id));



    }
}
