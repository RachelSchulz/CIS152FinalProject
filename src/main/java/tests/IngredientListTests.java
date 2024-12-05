/**
 * @author Rachel Schulz
 * @date Nov 4, 2024
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import recipe_app.beans.EmptyListException;
import recipe_app.beans.IngredientList;

/**
 * 
 */
public class IngredientListTests {
	@Test
	public void addIngredient() {
		// ARRANGE
		IngredientList ingList = new IngredientList();
		String ingred1 = "8 ounces butter";
		// ACT
		ingList.addIngredient(ingred1);
		int expected = 1;
		int actual = ingList.getSize();
		;
		// ASSERT
		assertEquals(actual, expected);
	}

	// Tests that new ingredients are added to the end of the list
	@Test
	public void newIngredientsAddedToEnd() throws IndexOutOfBoundsException, EmptyListException {
		// ARRANGE
		IngredientList ingList = new IngredientList();
		String ingred1 = "8 ounces butter";
		String ingred2 = "1 cup carrots";
		// ACT
		ingList.addIngredient(ingred1);
		ingList.addIngredient(ingred2);
		String expected = "1 cup carrots";
		String actual = ingList.getIngredient(1); // should return ingred2 at index 1
		// ASSERT
		assertEquals(actual, expected);
	}

	@Test
	public void removesIngredientAtIndex() throws IndexOutOfBoundsException, EmptyListException {
		// ARRANGE
		IngredientList ingList = new IngredientList();
		String ingred1 = "8 ounces butter";
		String ingred2 = "1 cup carrots";
		// ACT
		ingList.addIngredient(ingred1);
		ingList.addIngredient(ingred2);
		ingList.removeIngredient(0); // removing ingredient 1
		String expected = "1 cup carrots\n";
		String actual = ingList.toString();
		// ASSERT
		assertEquals(actual, expected);
	}

	@Test
	public void toStringThreeIngredients() {
		// ARRANGE
		IngredientList ingList = new IngredientList();
		String ingred1 = "8 ounces butter";
		String ingred2 = "1 cup carrots";
		String ingred3 = "salt, to taste";
		// ACT
		ingList.addIngredient(ingred1);
		ingList.addIngredient(ingred2);
		ingList.addIngredient(ingred3);
		String expected = "8 ounces butter, 1 cup carrots, salt, to taste\n";
		String actual = ingList.toString();
		// ASSERT
		assertEquals(actual, expected);
	}

	@Test
	public void getIngredientExists() throws IndexOutOfBoundsException, EmptyListException {
		// ARRANGE
		IngredientList ingList = new IngredientList();
		String ingred1 = "8 ounces butter";
		String ingred2 = "1 cup carrots";
		String ingred3 = "salt, to taste";
		// ACT
		ingList.addIngredient(ingred1);
		ingList.addIngredient(ingred2);
		ingList.addIngredient(ingred3);
		String expected = "salt, to taste";
		String actual = ingList.getIngredient(2);
		// ASSERT
		assertEquals(actual, expected);
	}

	//test getIngredient throws IndexOutOfBoundsException
	@Test
	public void getIngredientOutOfBounds() {
		assertThrows(IndexOutOfBoundsException.class,
				()-> {
					// ARRANGE
					IngredientList ingList = new IngredientList();
					String ingred1 = "8 ounces butter";
					String ingred2 = "1 cup carrots";
					String ingred3 = "salt, to taste";
					// ACT
					ingList.addIngredient(ingred1);
					ingList.addIngredient(ingred2);
					ingList.addIngredient(ingred3);
					ingList.getIngredient(4);	//index 4 is out of bounds
				});
	}
	
	//test getIngredient throws EmptyListException
	@Test
	public void getIngredientThrowsEmptyListException() {
		assertThrows(EmptyListException.class,
				()-> {
					//ARRANGE
					IngredientList ingList = new IngredientList();	//empty list
					//ACT
					ingList.getIngredient(0);
				});
	}
}
