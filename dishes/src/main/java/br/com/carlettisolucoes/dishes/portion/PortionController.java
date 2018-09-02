package br.com.carlettisolucoes.dishes.portion;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlettisolucoes.spring.generic.controller.CrudController;

@RestController
@RequestMapping("/portions")
public class PortionController extends CrudController<Portion, Integer> {

	@Autowired
	public PortionController(PortionService service) {
		super(service);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}/ingredients")
	public ResponseEntity<PortionIngredient> read(@PathVariable Integer id) {
		Optional<T> t = service.read(id);
		if(t.isPresent())
			return ResponseEntity.ok(t.get());
		else 
			return ResponseEntity.notFound().build();
	}	

}
