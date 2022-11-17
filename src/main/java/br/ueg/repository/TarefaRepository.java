package br.ueg.repository;

import br.ueg.dto.CountType;
import br.ueg.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa,Long> {

    @Query(value = "SELECT * FROM tarefa order by venc desc",nativeQuery = true)
    public List<Tarefa> getAllTarefaVencDesc();

    @Query(value = "SELECT new br.ueg.dto.CountType(COUNT(*)/(Select COUNT(*) from tarefa) *100 type) FROM tarefa GROUP BY tipo")
    public List<CountType> getPercentageGroupByTipo();

}
