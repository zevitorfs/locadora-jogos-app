package atividade.padrao.locadora.jogos.core.services;

import atividade.padrao.locadora.jogos.adapters.output.JpaRepositorioLocacao;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.input.BuscaLocacao;
import atividade.padrao.locadora.jogos.core.ports.output.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BuscaLocacaoService implements BuscaLocacao {

    @Autowired
    private JpaRepositorioLocacao jpaRepositorioLocacao;

    @Override
    public List<Locacao> buscarTodasLocacoes() {
        return jpaRepositorioLocacao.findAll();
    }

}
