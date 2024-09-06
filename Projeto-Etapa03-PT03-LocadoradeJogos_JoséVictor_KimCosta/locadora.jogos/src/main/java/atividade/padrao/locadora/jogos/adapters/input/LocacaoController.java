package atividade.padrao.locadora.jogos.adapters.input;

import atividade.padrao.locadora.jogos.adapters.dto.input.LocacaoInput;
import atividade.padrao.locadora.jogos.adapters.dto.mapper.LocacaoMapper;
import atividade.padrao.locadora.jogos.adapters.dto.output.LocacaoOutput;
import atividade.padrao.locadora.jogos.adapters.output.JpaRepositorioCliente;
import atividade.padrao.locadora.jogos.adapters.output.JpaRepositorioLocacao;
import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.input.ILocacaoServices;
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
    private final JpaRepositorioLocacao repositorioLocacao;
    private final LocacaoMapper locacaoMapper;

    @PostMapping
    public ResponseEntity<Integer> criarLocacao(@RequestBody LocacaoInput locacaoInput){
        Locacao novaLocacao = repositorioLocacao.save(locacaoMapper.toModel(locacaoInput));
        return ResponseEntity.status(HttpStatus.CREATED).body(novaLocacao.getIdLocacao());
    }
    @GetMapping("/{idLocacao}")
    public ResponseEntity<LocacaoOutput> buscarPorId(@PathVariable Integer idLocacao){
        System.out.println("ALou");
        var locacao = locacaoService.buscarLocacaoId(idLocacao);
        var response = locacaoMapper.toResponse(locacao);

        return ResponseEntity.ok(response);

    }



}
