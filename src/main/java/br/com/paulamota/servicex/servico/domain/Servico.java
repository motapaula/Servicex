package br.com.paulamota.servicex.servico.domain;

import br.com.paulamota.servicex.categoria.domain.Categoria;
import br.com.paulamota.servicex.ordemservico.domain.OrdemServico;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA")
    private Categoria categoria;
    @JsonIgnore
    @ManyToMany(mappedBy = "servicos")
    private List<OrdemServico> ordemServicos;

}
