/**
 * @author Rachel Schulz
 * @date Nov 30, 2024
 */
package recipe_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import recipe_app.beans.IngredientList;
import recipe_app.beans.Recipe;
import recipe_app.beans.RecipeList;
import repository.RecipeAppRepository;
import repository.RecipeRepository;

@Controller
public class WebController {
	
	RecipeAppRepository recipeListRepo;
	RecipeRepository recipeRepo;
	
	
	@GetMapping("/Index")
	public String openIndex() {
		return "Index";	
	}
	
	@GetMapping("/AllRecipes")
	public String viewAllRecipes(Model model) {
		//if(recipeListRepo.findAll().isEmpty()) {
	//		return AddRecipe(model);
	//	}
		RecipeList recipes = new RecipeList();
		IngredientList list = new IngredientList();
		Recipe r = new Recipe("beet salad", list, "directions", "user note", true, true, true);
		recipes.addRecipe(r);
		model.addAttribute("recipes", recipeRepo.findAll());
		//TODO add all recipes to Recipe List
		return "AllRecipes";
	}
	
	@GetMapping("/AddRecipe")
	private String AddRecipe(Model model) {
		Recipe r = new Recipe();
		model.addAttribute("newRecipe", r);
		return "AddRecipe";
	}
	
	@GetMapping("/ViewRecipe/{id}")
	private String showRecipe(@PathVariable("id") int id, Model model) {
		Recipe r = recipeRepo.findById(id).orElse(null);
		model.addAttribute("viewRecipe", r);
		return "ViewRecipe";
	}
	
	/**
	@PostMapping("/AddRecipe") 
	public String AddRecipe(@ModelAttribute Recipe r, Model model) {
		//TODO parse userIng to Ingredient list
		recipeRepo.save(r);
		return "redirect:/AllRecipes";
	}
	*/
	
	@RequestMapping(value = "/AddRecipe", method = RequestMethod.POST)
	public String AddRecipe(
		@RequestParam(value = "title") String inputTitle,
		@RequestParam(value="userIng") String userIng,
		@RequestParam(value="directions") String inputDirections,
		@RequestParam(value="userNote") String note,
		@RequestParam(value="isGF") boolean inputGF,
		@RequestParam(value="isVegan") boolean inputVegan,
		@RequestParam(value="isVegetarian") boolean inputVegetarian
		)
	{
		//parse userIng to ingredient list
		IngredientList ingredients = new IngredientList();
		String[] ings = userIng.split(System.lineSeparator());
		for (int i = 0; i < ings.length; i++) {
			ingredients.addIngredient(ings[i]);
		}
		Recipe r = new Recipe(inputTitle, ingredients, inputDirections, note, inputGF, inputVegan, inputVegetarian);
		recipeRepo.save(r);
		return "redirect:/AllRecipes";
	}
}
