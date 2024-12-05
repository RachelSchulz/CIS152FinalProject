/**
 * @author Rachel Schulz
 * @date Nov 4, 2024
 */
package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.Test;

import recipe_app.EmptyListException;
import recipe_app.beans.IngredientList;
import recipe_app.beans.Recipe;

/**
 * 
 */
public class RecipeTests {
	@Test
	public void displayIngredientsList() throws IndexOutOfBoundsException, recipe_app.beans.EmptyListException {
		//ARRANGE
		Recipe soup = new Recipe("Yummy Soup");
		String carrots =  "1.5 cups carrots, diced"; 
		String onions = "1 cup onions, chopped"; 
		String celery = "celery";
		soup.addIngredient(carrots);
		soup.addIngredient(onions);
		soup.addIngredient(celery);
		String expected = "1.5 cups carrots, diced\n1 cup onions, chopped\ncelery\n";
		String result;
		//ACT
		result = soup.displayIngredients();
		//ASSERT
		assertEquals(expected, result);
	}
	
	@Test
	public void addRecipeWithIngList() throws IndexOutOfBoundsException, recipe_app.beans.EmptyListException {
		//ARRANGE
		String carrots = "1.5 cups carrots, diced"; 
		String onions = "1 cup onions, chopped";  
		String celery = "celery"; 
		String lettuce = "3 cups lettuce"; //new Ingredient("lettuce", 3, "cups");
		String ranch = "1.5 cups Ranch dressing"; //new Ingredient("Ranch dressing", 1.5, "cups");
		IngredientList ingredients = new IngredientList();
		ingredients.addIngredient(carrots);
		ingredients.addIngredient(onions);
		ingredients.addIngredient(celery);
		ingredients.addIngredient(lettuce);
		ingredients.addIngredient(ranch);
		Recipe salad = new Recipe("Big Salad", ingredients, "Combine all ingredients in large bowl");
		String expected = "1.5 cups carrots, diced\n1 cup onions, chopped\ncelery\n3 cups lettuce\n1.5 cups Ranch dressing\n";
		String actual;
		//ACT
		actual = salad.displayIngredients();
		//ASSERT
		assertEquals(expected, actual);
	}
}
