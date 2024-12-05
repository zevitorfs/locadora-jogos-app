package atividade.padrao.locadora.jogos.adapters.output;

import atividade.padrao.locadora.jogos.core.domain.Cliente;
import atividade.padrao.locadora.jogos.core.ports.output.ClienteRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaClienteRepository extends JpaRepository<Cliente,Integer>, ClienteRepository{
}
