package atividade.padrao.locadora.jogos.adapters.dto.input;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
@Getter
public class LocacaoInput {
    private Integer idCliente;
    private LocalDate data;
    private List<ItemLocacaoDTO> itens;

    @Getter
    public static class ItemLocacaoDTO{
        private int dias;
        private int quantidade;
        private Integer idJogoPlataforma;
    }
}
