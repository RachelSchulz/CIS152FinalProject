/** Recipe App stores user's favorite recipes
 * @author Rachel Schulz
 * @date Oct 30, 2024
 * @version 1.0
 * @since 1.0
*/
/*  
* OS: macOS 14.6.1
* IDE: Eclipse
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified, nor used generative AI as a final draft. 
* I have not given other fellow student(s) access to my program.
*/

package recipe_app;

/**
 * 
 */
public class RecipeAppDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws EmptyListException {
		
		Ingredient carrots = new Ingredient("carrots", 1.5, "cups", "diced");
		Ingredient onions = new Ingredient("onions", .25, "cup", "finely chopped");
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
		System.out.println(salad.toString());
		Recipe soup = new Recipe("Yummy Soup");
		Ingredient soupCarrots = new Ingredient("carrots", 1.5, "cups", "diced");
		Ingredient soupOnions = new Ingredient("onions", 1, "cup", "chopped");
		Ingredient soupCelery = new Ingredient("celery");
		soup.addIngredient(soupCarrots);
		soup.addIngredient(soupOnions);
		soup.addIngredient(soupCelery);
		System.out.println(soup.toString());
		RecipeList myList = new RecipeList();
		myList.addRecipe(salad);
		myList.addRecipe(soup);
		System.out.println(myList.displayAllRecipes());

	}

}
