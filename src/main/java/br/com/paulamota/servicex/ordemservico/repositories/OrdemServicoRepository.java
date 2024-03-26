package br.com.paulamota.servicex.ordemservico.repositories;

import br.com.paulamota.servicex.ordemservico.domain.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer> {
}
