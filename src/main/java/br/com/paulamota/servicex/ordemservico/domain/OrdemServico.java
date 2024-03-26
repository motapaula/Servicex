package br.com.paulamota.servicex.ordemservico.domain;

import br.com.paulamota.servicex.pagamento.domain.Pagamento;
import br.com.paulamota.servicex.servico.domain.Servico;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ORDEMDESERVICOS")

public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOS;
    @Column(name = "DATA_SOLICITACAO")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Data dataSolicitacao;
    @Column(name = "VALOR_OS")
    private Double valorOS;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ordemservico")
    private Pagamento pagamento;
    @ManyToMany
    @JoinTable (name = "SERVICO_OS",
    joinColumns = @JoinColumn(name = "ID_OS"),
    inverseJoinColumns = @JoinColumn(name = "ID_SERVICO"))
    private Set<Servico> servicos;
}


