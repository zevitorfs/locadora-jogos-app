package atividade.padrao.locadora.jogos.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locacao {


    private Integer id;
    private Cliente cliente;
    private List<ItemLocacao> itens;
    private LocalDate data;

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemLocacao> getItens() {
        return itens;
    }

    public LocalDate getData() {
        return data;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItens(List<ItemLocacao> itens) {
        this.itens = itens;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


}
