/**
 * @author Rachel Schulz
 * @date Nov 27, 2024
 */
package recipe_app.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import recipe_app.beans.IngredientList;
import recipe_app.beans.Recipe;
import recipe_app.beans.RecipeList;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public IngredientList ingList() {
		IngredientList ingList = new IngredientList();
		return ingList;
	}
	
	@Bean
	public Recipe recipe() {
		Recipe recipe = new Recipe();
		return recipe;
	}
	
	@Bean
	public RecipeList recipeList() {
		RecipeList recipeList = new RecipeList();
		return recipeList;
	}
	
}
