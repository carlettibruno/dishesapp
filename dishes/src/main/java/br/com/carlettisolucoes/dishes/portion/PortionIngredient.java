package br.com.carlettisolucoes.dishes.portion;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.carlettisolucoes.dishes.ingredient.Ingredient;
import br.com.carlettisolucoes.spring.generic.model.CrudModel;

@Entity
@Table(name="portion_ingredient")
public class PortionIngredient implements CrudModel<PortionIngredientId> {
	
	@EmbeddedId
	private PortionIngredientId id;
	
	@ManyToOne
	@JoinColumn(insertable=false, updatable=false)
	private Ingredient ingredient;
	
	private BigDecimal amount;

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public PortionIngredientId getId() {
		return id;
	}

	public void setId(PortionIngredientId id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PortionIngredient other = (PortionIngredient) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
