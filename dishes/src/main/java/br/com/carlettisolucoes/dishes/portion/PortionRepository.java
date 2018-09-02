package br.com.carlettisolucoes.dishes.portion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortionRepository extends CrudRepository<Portion, Integer> {

}
