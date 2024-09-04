package atividade.padrao.locadora.jogos.adapters.dto.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class LocacaoOutput {
    private Integer idLocacao;
    private ClienteOutput cliente;
    private LocalDate data;
    private Double custoTotal;
    private List<ItemLocacaoOutput> itens;


    @AllArgsConstructor
    @Setter
    @Getter
    public static class ClienteOutput{
        private Integer idCliente;
        private String nome;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class ItemLocacaoOutput{
        private Long idItemLocacao;
        private String jogo;
        private String plataforma;
        private Double precoDiario;
        private Integer dias;
        private Integer quantidade;
    }


}
