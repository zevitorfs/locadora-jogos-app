package atividade.padrao.locadora.jogos.core.services;

import atividade.padrao.locadora.jogos.adapters.output.JpaRepositorioLocacao;
import atividade.padrao.locadora.jogos.core.domain.ItemLocacao;
import atividade.padrao.locadora.jogos.core.domain.JogoPlataforma;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.output.LocacaoRepository;
import atividade.padrao.locadora.jogos.core.ports.input.services.ILocacaoServices;
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

}
