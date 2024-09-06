package atividade.padrao.locadora.jogos.core.services;

import atividade.padrao.locadora.jogos.adapters.output.JpaRepositorioLocacao;
import atividade.padrao.locadora.jogos.core.domain.ItemLocacao;
import atividade.padrao.locadora.jogos.core.domain.JogoPlataforma;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.output.LocacaoRepository;
import atividade.padrao.locadora.jogos.core.ports.input.ILocacaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LocacaoService implements ILocacaoServices{

    @Autowired
    private LocacaoRepository repositorioLocacao;
    private JpaRepositorioLocacao JparepositorioLocacao;
    public Locacao save(Locacao locacao) {
        return JparepositorioLocacao.save(locacao);
    }

    @Override
    public Locacao update(Integer id, Locacao locacaoAtualizada) {
        return JparepositorioLocacao.findById(id)
                .map(locacao -> {
                    locacao.setData(locacaoAtualizada.getData());
                    locacao.setItens(locacaoAtualizada.getItens());
                    return JparepositorioLocacao.save(locacao);
                })
                .orElseThrow(()-> new RuntimeException("Locação não encontra com ID" + id));

    }
    public void delete(Integer id) {
        JparepositorioLocacao.deleteById(id);

    }
    @Override
    public Double calcularCustoTotal(Locacao locacao) {
        return locacao.getItens().stream().mapToDouble(
                item -> item.getJogoPlataforma().getPrecoDiario()*item.getDias()*item.getQuantidade()
        ).sum();
    }
    public Locacao obterLocacaoId(Integer id) {
        return JparepositorioLocacao.findById(id)
                .orElseThrow(() -> new RuntimeException("Locação não encontrada para o ID: " + id));



    }
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
