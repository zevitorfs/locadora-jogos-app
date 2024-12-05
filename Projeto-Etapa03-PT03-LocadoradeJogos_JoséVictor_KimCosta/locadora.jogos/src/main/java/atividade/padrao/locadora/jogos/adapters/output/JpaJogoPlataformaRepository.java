package atividade.padrao.locadora.jogos.adapters.output;

import atividade.padrao.locadora.jogos.core.domain.JogoPlataforma;
import atividade.padrao.locadora.jogos.core.ports.output.JogoPlataformaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaJogoPlataformaRepository extends JpaRepository<JogoPlataforma,Integer>, JogoPlataformaRepository{
}
