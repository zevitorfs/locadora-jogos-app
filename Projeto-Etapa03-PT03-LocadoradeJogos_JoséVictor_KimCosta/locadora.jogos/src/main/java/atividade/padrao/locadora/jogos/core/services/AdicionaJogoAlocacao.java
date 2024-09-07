package atividade.padrao.locadora.jogos.core.services;

import atividade.padrao.locadora.jogos.adapters.output.JpaRepositorioLocacao;
import atividade.padrao.locadora.jogos.core.domain.ItemLocacao;
import atividade.padrao.locadora.jogos.core.domain.JogoPlataforma;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.input.services.IAdicionaJogoAlocacao;
import atividade.padrao.locadora.jogos.core.ports.output.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AdicionaJogoAlocacao implements IAdicionaJogoAlocacao {

    @Autowired
    private LocacaoRepository repositorioLocacao;
    private JpaRepositorioLocacao JparepositorioLocacao;
    @Override
    public void adicionarJogoALocacao(Locacao locacao, JogoPlataforma jogoPlataforma, int dias) {
        ItemLocacao itemLocacao = new ItemLocacao();
        itemLocacao.setJogoPlataforma(jogoPlataforma);
        itemLocacao.setDias(dias);
        itemLocacao.setLocacao(locacao);

        locacao.getItens().add(itemLocacao);

        // Salva ou atualiza a locação com o novo jogo adicionado
        repositorioLocacao.save(locacao);
    }
}
