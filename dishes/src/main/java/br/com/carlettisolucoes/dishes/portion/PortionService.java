package br.com.carlettisolucoes.dishes.portion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carlettisolucoes.spring.generic.service.CrudService;

@Service
public class PortionService extends CrudService<Portion, Integer> {

	@Autowired
	public PortionService(PortionRepository repo) {
		super(repo);
	}

}
