package br.com.paulamota.servicex.servico.services;

import br.com.paulamota.servicex.servico.domain.Servico;
import br.com.paulamota.servicex.servico.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {
    @Autowired
    private ServicoRepository servicoRepository;

    public Servico criarServico(Servico servico){
        return servicoRepository.save(servico);
    }

    public List<Servico> listarServicos(){
        return servicoRepository.findAll();
    }

    public Optional<Servico> buscarServico(Integer idServico){
        return servicoRepository.findById(idServico);
    }

    public Servico atualizarServico(Servico servico){
        return servicoRepository.save(servico);
    }

    public void deletarServico(Integer idServico){
        servicoRepository.deleteById(idServico);
    }
}
