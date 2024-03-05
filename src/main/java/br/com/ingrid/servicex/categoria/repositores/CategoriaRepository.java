package br.com.ingrid.servicex.categoria.repositores;

import br.com.ingrid.servicex.categoria.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {
}
