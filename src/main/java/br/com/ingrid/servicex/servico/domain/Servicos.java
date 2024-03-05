package br.com.ingrid.servicex.servico.domain;

import br.com.ingrid.servicex.categoria.domain.Categoria;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table (name = "SERVICOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Servicos {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_SERVICOS")
    private Integer idServicos;
    @Column (name = "ID_SERVICOS")
    private String nomeServico;
    @Column (name = "NOME_SERVICOS")
    private Double valor;
    @ManyToOne
    @JoinColumn (name = "idCategoria")
    @Column (name = "VALOR_SERVICOS")
    private Categoria categoria;




}
