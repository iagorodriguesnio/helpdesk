package br.com.helpdesk.repositories;

import br.com.helpdesk.domain.entity.Tecnico;
import org.springframework.data.repository.CrudRepository;

public interface TecnicoRepository extends CrudRepository<Tecnico, Integer> {
}
