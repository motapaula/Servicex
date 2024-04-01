package br.com.paulamota.servicex.categoria.domain;

import br.com.paulamota.servicex.servico.domain.Servico;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table (name = "CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria;
    @Column(name = "NOME_CATEGORIA")
    private String nomeCategoria;
    @Column(name = "SERVICOS")
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Servico> servicos;


    public Categoria() {
    }
}
