package atividade.padrao.locadora.jogos.core.ports.output;

import atividade.padrao.locadora.jogos.core.domain.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLocacao extends JpaRepository<Locacao, Integer> {

}
