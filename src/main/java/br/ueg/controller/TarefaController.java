package br.ueg.controller;

import br.ueg.model.Tarefa;
import br.ueg.service.TarefaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
@AllArgsConstructor
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/Tarefa")
    private List<Tarefa> getTarefa(){
        return tarefaService.getTarefa();
    }
}

