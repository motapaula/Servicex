package br.com.paulamota.servicex.servico.domain;

import br.com.paulamota.servicex.categoria.domain.Categoria;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table (name = "SERVICOS")

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Integer idServico;
    @Column(name = "NOME_SERVICO")
    private String nomeServico;
    @Column(name = "VALOR_SERVICO")
    private Double valorServico;
    @Column(name = "CATEGORIA")
    @OneToMany(mappedBy = "servico", cascade = CascadeType.ALL)
    private List<Categoria> categorias;

    public Servico() {
    }
}
