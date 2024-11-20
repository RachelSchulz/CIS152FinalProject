/**
 * @author Rachel Schulz
 * @date Nov 4, 2024
 */
package recipe_app;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.util.LinkedList;

/**
 * 
 */
public class IngredientList {
	LinkedList<Ingredient> ingredientList;

	/**
	 * 
	 */
	public IngredientList() {
		ingredientList = new LinkedList<Ingredient>();
	}

	/**
	 * @param ingredientList
	 */
	public IngredientList(LinkedList<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

	/**
	 * @return the ingredientList
	 */
	public LinkedList<Ingredient> getIngredientList() {
		return ingredientList;
	}

	/**
	 * @param ingredientList the ingredientList to set
	 */
	public void setIngredientList(LinkedList<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}
	
	public void addIngredient(Ingredient newIng) {
		ingredientList.addLast(newIng);
	}
	
	public void removeIngredient(int i) throws EmptyListException, IndexOutOfBoundsException {
		if (ingredientList.size() == 0) {
			throw new EmptyListException();
		}
		else if (ingredientList.size() > i) {
			throw new IndexOutOfBoundsException();
		}
		ingredientList.remove(i);
	}
	
	public String displayIngredients() {
		String display = new String();
		for (int i = 0; i < ingredientList.size(); i++) {
			display += ingredientList.get(i) + "\n";
		}
		return display;
	}
	
	public int getSize() {
		return ingredientList.size();
	}
	
	public Ingredient getIngredient(int i) throws EmptyListException, IndexOutOfBoundsException {	
		if (ingredientList.size() == 0) {
			throw new EmptyListException();
		}
		else if (ingredientList.size() > i) {
			throw new IndexOutOfBoundsException();
		}
		return ingredientList.get(i);
	}
}
