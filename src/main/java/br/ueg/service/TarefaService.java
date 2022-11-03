package br.ueg.service;

import br.ueg.model.Tarefa;
import br.ueg.repository.TarefaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class TarefaService {

    private TarefaRepository tarefaRepository; //Remover Static??

    //@Transactional(readOnly = true)
    public List<Tarefa> getTarefa(){ //Remover Static??
        return tarefaRepository.findAll();

    }
}
