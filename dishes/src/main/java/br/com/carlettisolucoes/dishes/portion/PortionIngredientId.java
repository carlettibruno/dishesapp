package br.com.carlettisolucoes.dishes.portion;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PortionIngredientId implements Serializable {

	@Column(name="portion_id")
	private Integer portionId;
	
	@Column(name="ingredient_id")
	private Integer ingredientId;

	public Integer getPortionId() {
		return portionId;
	}

	public void setPortionId(Integer portionId) {
		this.portionId = portionId;
	}

	public Integer getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Integer ingredientId) {
		this.ingredientId = ingredientId;
	}

	@Override
	public String toString() {
		return "PortionIngredientId [portionId=" + portionId + ", ingredientId=" + ingredientId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredientId == null) ? 0 : ingredientId.hashCode());
		result = prime * result + ((portionId == null) ? 0 : portionId.hashCode());
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
		PortionIngredientId other = (PortionIngredientId) obj;
		if (ingredientId == null) {
			if (other.ingredientId != null)
				return false;
		} else if (!ingredientId.equals(other.ingredientId))
			return false;
		if (portionId == null) {
			if (other.portionId != null)
				return false;
		} else if (!portionId.equals(other.portionId))
			return false;
		return true;
	}
	
}