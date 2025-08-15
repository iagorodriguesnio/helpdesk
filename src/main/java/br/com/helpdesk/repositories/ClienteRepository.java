package br.com.helpdesk.repositories;

import br.com.helpdesk.domain.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
