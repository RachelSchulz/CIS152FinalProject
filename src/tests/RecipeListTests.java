/**
 * @author Rachel Schulz
 * @date Nov 4, 2024
 */
package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import recipe_app.Ingredient;
import recipe_app.IngredientList;
import recipe_app.Recipe;
import recipe_app.RecipeList;


/**
 * 
 */
public class RecipeListTests {
	@Test
	public void addRecipe() {
		//ARRANGE
		Recipe r1 = new Recipe("Tofu Scramble");
		RecipeList rlist = new RecipeList();
		//ACT
		rlist.addRecipe(r1);
		int rlsize = rlist.getSize();
		int expectedSize = 1;
		//ASSERT
		assertEquals(rlsize, expectedSize);
	}
	
	@Test
	public void sortRecipes() {
		//ARRANGE
		Recipe r1 = new Recipe("Tofu Scramble");
		Recipe r2 = new Recipe("Apple Pie");
		Recipe r3 = new Recipe("Banana Pudding");
		RecipeList rlist = new RecipeList();
		rlist.addRecipe(r1);
		rlist.addRecipe(r2);
		rlist.addRecipe(r3);
		int expectedIndex = 0;	//expected index of r2 Apple Pie after sortRecipes call
		//ACT
		rlist.sortRecipes();
		//ASSERT
		assertEquals(rlist.getIndexOfRecipe(r2), expectedIndex);
	}
	
	@Test
	public void ingredientFoundInSearch() {
		//ARRANGE
		Ingredient carrots = new Ingredient("carrots", 1.5, "cups", "diced");
		Ingredient onions = new Ingredient("onions", 1, "cup", "chopped");
		Ingredient celery = new Ingredient("celery");
		Ingredient lettuce = new Ingredient("lettuce", 3, "cups");
		Ingredient ranch = new Ingredient("Ranch dressing", 1.5, "cups");
		IngredientList ingredients1 = new IngredientList();
		ingredients1.addIngredient(carrots);
		ingredients1.addIngredient(onions);
		ingredients1.addIngredient(celery);
		ingredients1.addIngredient(lettuce);
		ingredients1.addIngredient(ranch);
		Recipe salad = new Recipe("Salad", ingredients1, "directions");
		RecipeList rlist = new RecipeList();
		rlist.addRecipe(salad);
		boolean expected = true;
		//ACT
		//boolean actual = rlist.displayAllRecipes().equals(rlist.searchRecipeByIngredient("carrot").displayAllRecipes());
		//ASSERT
		//assertEquals(expected, actual);
		//not sure how to make this test make sense
	}
	
	@Test
	public void displayRecipesInList() {
		//ARRANGE
		Recipe r1 = new Recipe("Tofu Scramble");
		Recipe r2 = new Recipe("Apple Pie");
		Recipe r3 = new Recipe("Banana Pudding");
		Recipe r4 = new Recipe("Yummy Soup");
		String expected = "Apple Pie\nBanana Pudding\nTofu Scramble\nYummy Soup\n";
		String actual;
		RecipeList rlist = new RecipeList();
		rlist.addRecipe(r1);
		rlist.addRecipe(r2);
		rlist.addRecipe(r3);
		rlist.addRecipe(r4);
		//ACT
		actual = rlist.displayAllRecipes();
		//ASSERT
		assertEquals(actual, expected);
	}
}
