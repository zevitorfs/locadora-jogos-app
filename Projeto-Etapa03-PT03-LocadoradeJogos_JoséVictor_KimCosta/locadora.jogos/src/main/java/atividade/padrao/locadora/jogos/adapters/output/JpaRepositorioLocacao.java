package atividade.padrao.locadora.jogos.adapters.output;

import atividade.padrao.locadora.jogos.core.domain.Locacao;
import atividade.padrao.locadora.jogos.core.ports.output.LocacaoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepositorioLocacao extends JpaRepository<Locacao,Integer>, LocacaoRepository{
}
