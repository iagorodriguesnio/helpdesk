package br.com.helpdesk.repositories;

import br.com.helpdesk.domain.entity.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
}
