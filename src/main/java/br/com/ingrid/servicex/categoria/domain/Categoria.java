package br.com.ingrid.servicex.categoria.domain;

import br.com.ingrid.servicex.servico.domain.Servicos;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table (name = "CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria;
    @Column(name = "NOME_CATEGORIA")
    private String nomeCategoria;
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Servicos> servicos;


    public Categoria() {
    }
}
