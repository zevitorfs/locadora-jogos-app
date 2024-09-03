package atividade.padrao.locadora.jogos.adapters.input;

import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.services.impl.ILocacaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locacoes")
public class LocacaoController {
    @Autowired
    private ILocacaoServices locacaoService;

//    public LocacaoController(LocacaoService locacaoService) {
//        this.locacaoService = locacaoService;
//    }

    @PostMapping
    public ResponseEntity<Locacao> criarLocacao(@RequestBody Locacao locacao){
        Locacao novaLocacao = locacaoService.save(locacao);
        return ResponseEntity.ok(novaLocacao);
    }

    @GetMapping
    public ResponseEntity<Locacao> buscarTodasLocacoes(){
        List<Locacao> locacoes = locacaoService.buscarTodasLocacoes();
        return ResponseEntity.ok((Locacao) locacoes);
    }

}
