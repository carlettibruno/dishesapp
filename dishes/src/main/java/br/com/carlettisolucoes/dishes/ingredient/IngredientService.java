package br.com.carlettisolucoes.dishes.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carlettisolucoes.spring.generic.service.CrudService;

@Service
public class IngredientService extends CrudService<Ingredient, Integer> {

	@Autowired
	public IngredientService(IngredientRepository repo) {
		super(repo);
	}

}
