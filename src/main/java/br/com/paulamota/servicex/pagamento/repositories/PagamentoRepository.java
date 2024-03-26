package br.com.paulamota.servicex.pagamento.repositories;

import br.com.paulamota.servicex.ordemservico.domain.OrdemServico;
import br.com.paulamota.servicex.pagamento.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{
}
