package atividade.padrao.locadora.jogos.core.services;

import atividade.padrao.locadora.jogos.adapters.output.JpaLocacaoRepository;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.output.LocacaoRepository;
import atividade.padrao.locadora.jogos.core.ports.input.services.ILocacaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LocacaoService implements ILocacaoServices{

    @Autowired
    private LocacaoRepository repositorioLocacao;
    private JpaLocacaoRepository jparepositorioLocacaoRepository;
    public Locacao save(Locacao locacao) {
        return jparepositorioLocacaoRepository.save(locacao);
    }

    @Override
    public Locacao update(Integer id, Locacao locacaoAtualizada) {
        return jparepositorioLocacaoRepository.findById(id)
                .map(locacao -> {
                    locacao.setData(locacaoAtualizada.getData());
                    locacao.setItens(locacaoAtualizada.getItens());
                    return jparepositorioLocacaoRepository.save(locacao);
                })
                .orElseThrow(()-> new RuntimeException("Locação não encontra com ID" + id));

    }
    public void delete(Integer id) {
        jparepositorioLocacaoRepository.deleteById(id);

    }

}
