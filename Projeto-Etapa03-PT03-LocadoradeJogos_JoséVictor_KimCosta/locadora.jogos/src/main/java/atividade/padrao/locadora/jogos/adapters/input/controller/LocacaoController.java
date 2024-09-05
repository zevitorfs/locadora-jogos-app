package atividade.padrao.locadora.jogos.adapters.input.controller;

import atividade.padrao.locadora.jogos.adapters.dto.input.LocacaoInput;
import atividade.padrao.locadora.jogos.adapters.dto.mapper.LocacaoMapper;
import atividade.padrao.locadora.jogos.adapters.dto.output.LocacaoOutput;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.input.services.ILocacaoServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/locacoes")
public class LocacaoController {

    private final ILocacaoServices locacaoService;

    private final LocacaoMapper locacaoMapper;

    @PostMapping
    public ResponseEntity<Integer> criarLocacao(@RequestBody LocacaoInput locacaoInput){
        Locacao novaLocacao = locacaoService.save(locacaoMapper.toModel(locacaoInput));
        return ResponseEntity.status(HttpStatus.CREATED).body(novaLocacao.getIdLocacao());
    }
    @GetMapping("/{idLocacao}")
    public ResponseEntity<LocacaoOutput> buscarPorId(@PathVariable Integer idLocacao){
        System.out.println("ALou");
        var locacao = locacaoService.buscarLocacaoId(idLocacao);
        var response = locacaoMapper.toResponse(locacao);

        return ResponseEntity.ok(response);

    }

    @GetMapping
    public ResponseEntity <List<Locacao>> buscarTodasLocacoes(){
        List<Locacao> locacoes = locacaoService.buscarTodasLocacoes();
        return ResponseEntity.ok(locacoes);
    }



}
