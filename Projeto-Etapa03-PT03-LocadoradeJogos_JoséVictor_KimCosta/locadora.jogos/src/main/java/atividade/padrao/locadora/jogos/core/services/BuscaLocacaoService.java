package atividade.padrao.locadora.jogos.core.services;

import atividade.padrao.locadora.jogos.adapters.output.JpaLocacaoRepository;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.input.services.BuscaLocacao;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class BuscaLocacaoService implements BuscaLocacao {

    @Autowired
    private JpaLocacaoRepository jpaLocacaoRepository;

    @Override
    public List<Locacao> buscarTodasLocacoes() {
        return jpaLocacaoRepository.findAll();
    }

}
