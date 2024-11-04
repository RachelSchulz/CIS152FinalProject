/**
 * @author Rachel Schulz
 * @date Nov 4, 2024
 */
package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.Test;

import recipe_app.Ingredient;
import recipe_app.IngredientList;
import recipe_app.Recipe;
/**
 * 
 */
public class RecipeTests {
	@Test
	public void displayIngredientsList() {
		//ARRANGE
		Recipe soup = new Recipe("Yummy Soup");
		Ingredient carrots = new Ingredient("carrots", 1.5, "cups", "diced");
		Ingredient onions = new Ingredient("onions", 1, "cup", "chopped");
		Ingredient celery = new Ingredient("celery");
		soup.addIngredient(carrots);
		soup.addIngredient(onions);
		soup.addIngredient(celery);
		String expected = "1.5 cups carrots, diced\n1 cup onions, chopped\n1 celery\n";
		String result;
		//ACT
		result = soup.displayIngredients();
		//ASSERT
		assertEquals(expected, result);
	}
	
	@Test
	public void addRecipeWithIngList() {
		//ARRANGE
		Ingredient carrots = new Ingredient("carrots", 1.5, "cups", "diced");
		Ingredient onions = new Ingredient("onions", 1, "cup", "chopped");
		Ingredient celery = new Ingredient("celery");
		Ingredient lettuce = new Ingredient("lettuce", 3, "cups");
		Ingredient ranch = new Ingredient("Ranch dressing", 1.5, "cups");
		IngredientList ingredients = new IngredientList();
		ingredients.addIngredient(carrots);
		ingredients.addIngredient(onions);
		ingredients.addIngredient(celery);
		ingredients.addIngredient(lettuce);
		ingredients.addIngredient(ranch);
		Recipe salad = new Recipe("Big Salad", ingredients, "Combine all ingredients in large bowl");
		String expected = "1.5 cups carrots, diced\n1 cup onions, chopped\n1 celery\n3 cups lettuce\n1.5 cups Ranch dressing\n";
		String actual;
		//ACT
		actual = salad.displayIngredients();
		//ASSERT
		assertEquals(expected, actual);
	}
}
