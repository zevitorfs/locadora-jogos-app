package atividade.padrao.locadora.jogos.core.ports.output;

import atividade.padrao.locadora.jogos.core.domain.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioJogo extends JpaRepository<Jogo, Integer> {

}

