package atividade.padrao.locadora.jogos.adapters.dto.mapper;

import atividade.padrao.locadora.jogos.adapters.dto.input.LocacaoInput;
import atividade.padrao.locadora.jogos.adapters.dto.output.LocacaoOutput;
import atividade.padrao.locadora.jogos.core.domain.ItemLocacao;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.output.ClienteRepository;
import atividade.padrao.locadora.jogos.core.ports.output.JogoPlataformaRepository;
import atividade.padrao.locadora.jogos.core.ports.input.services.ILocacaoServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class LocacaoMapper {
    private final ClienteRepository clienteRepository;
    private final JogoPlataformaRepository jogoPlataformaRepository;
    private final ILocacaoServices iLocacaoServices;
    public Locacao toModel(LocacaoInput locacaoInput){
        Locacao locacao = new Locacao();
        locacao.setData(locacaoInput.getData());
        locacao.setCliente(clienteRepository.findById(locacaoInput.getIdCliente()).orElseThrow());
        var itens = locacaoInput.getItens().stream().map(itemLocacaoDTO -> {
            ItemLocacao itemLocacao = new ItemLocacao();
            itemLocacao.setDias(itemLocacaoDTO.getDias());
            itemLocacao.setQuantidade(itemLocacaoDTO.getQuantidade());
            itemLocacao.setJogoPlataforma(jogoPlataformaRepository
                .findById(itemLocacaoDTO.getIdJogoPlataforma())
                .orElseThrow()
            );
            itemLocacao.setLocacao(locacao);
            return  itemLocacao;
        }).toList();
       locacao.setItens(itens);
       return locacao;
    }

    public LocacaoOutput toResponse(Locacao locacao){
        LocacaoOutput locacaoOutput = new LocacaoOutput();
        locacaoOutput.setIdLocacao(locacao.getIdLocacao());
        locacaoOutput.setCliente(new LocacaoOutput
                .ClienteOutput(locacao
                .getCliente().getId(),locacao.getCliente().getNome()));
        locacaoOutput.setData(locacao.getData());
        locacaoOutput.setCustoTotal(iLocacaoServices.calcularCustoTotal(locacao));

        locacaoOutput.setItens(locacao.getItens().stream().map(item -> new LocacaoOutput.ItemLocacaoOutput(
                item.getId(),
                item.getJogoPlataforma().getJogo().getTitulo(),
                item.getJogoPlataforma().getPlataforma().getNome(),
                item.getJogoPlataforma().getPrecoDiario(),
                item.getDias(),
                item.getQuantidade()
        )).toList());
        return locacaoOutput;
    }

}
