package atividade.padrao.locadora.jogos.adapters.output;

import atividade.padrao.locadora.jogos.core.domain.Jogo;
import atividade.padrao.locadora.jogos.core.ports.output.JogoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepositorioJogo extends JpaRepository<Jogo,Integer>, JogoRepository{
}
