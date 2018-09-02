package br.com.carlettisolucoes.dishes.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlettisolucoes.spring.generic.controller.CrudController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController extends CrudController<Ingredient, Integer> {

	@Autowired
	public IngredientController(IngredientService service) {
		super(service);
	}

}
