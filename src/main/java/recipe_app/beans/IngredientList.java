/**
 * @author Rachel Schulz
 * @date Nov 27, 2024
 */
package recipe_app.beans;

/**
 * 
 */
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.util.LinkedList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Entity
@Table(name="ingredientlist")
@Data
@AllArgsConstructor
public class IngredientList {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ingListID;
	private LinkedList<String> ingredientList;

	/**
	 * 
	 */
	
	//Default Constructor
	public IngredientList() {
		ingredientList = new LinkedList<String>();
	}

	/**
	 * @param ingredientList
	 */
	public IngredientList(LinkedList<String> ingredientList) {
		this.ingredientList = ingredientList;
	}

	/**
	 * @return the ingredientList
	 */
	public LinkedList<String> getIngredientList() {
		return ingredientList;
	}

	/**
	 * @param ingredientList the ingredientList to set
	 */
	public void setIngredientList(LinkedList<String> ingredientList) {
		this.ingredientList = ingredientList;
	}
	
	/**
	 * 
	 * @param newIng
	 * adds new ingredient to end of ingredientlist
	 */
	public void addIngredient(String newIng) {
		ingredientList.addLast(newIng);
	}
	
	/**
	 * 
	 * @param i
	 * @throws EmptyListException
	 * @throws IndexOutOfBoundsException
	 * deletes ingredient at index i
	 */
	public void removeIngredient(int i) throws EmptyListException, IndexOutOfBoundsException {
		if (ingredientList.size() == 0) {
			throw new EmptyListException();
		}
		else if (ingredientList.size() < i) {
			throw new IndexOutOfBoundsException();
		}
		ingredientList.remove(i);
	}
	
	/**
	 * 
	 * @return
	 * uses LinkedList get method to retrieve all ingredients and return as formatted string
	 */
	public String displayIngredients() {
		String display = new String();
		for (int i = 0; i < ingredientList.size(); i++) {
			display += ingredientList.get(i) + "\n";
		}
		return display;
	}
	
	/**
	 * 
	 * @return
	 * returns size of ingredient list
	 */
	public int getSize() {
		return ingredientList.size();
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 * @throws EmptyListException
	 * @throws IndexOutOfBoundsException
	 * returns ingredient at index i
	 */
	public String getIngredient(int i) throws EmptyListException, IndexOutOfBoundsException {	
		if (ingredientList.size() == 0) {
			throw new EmptyListException();
		}
		else if (ingredientList.size() < i) {
			throw new IndexOutOfBoundsException();
		}
		return ingredientList.get(i);
	}
	
	@Override
	public String toString() {
		String result = new String();
		int i = 0;
		for (i = 0; i < this.ingredientList.size() - 1; i++) {
			result += ingredientList.get(i) + ", ";
		} 
		result += ingredientList.get(i) + "\n";
		return result;
	}
}
