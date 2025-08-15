package br.com.helpdesk.repositories;

import br.com.helpdesk.domain.entity.Chamado;
import org.springframework.data.repository.CrudRepository;

public interface ChamadoRepository extends CrudRepository<Chamado, Integer> {
}
