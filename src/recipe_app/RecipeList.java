/**
 * @author Rachel Schulz
 * @date Oct 30, 2024
 */
package recipe_app;

import java.util.ArrayList;

public class RecipeList {
	
	private ArrayList<Recipe> recipes;
	
	//constructor
	public RecipeList() {
		this.recipes = new ArrayList<Recipe>();
	}
	
	//AddRecipe
	public void addRecipe(Recipe r) {
		recipes.add(r);
	}
	
	public void deleteRecipe(Recipe r) {
		recipes.remove(r);
	}
	
	public void deleteRecipe(int i) {
		recipes.remove(i);
	}
	
	public void editRecipe() {
		//TODO
	}
	
	/**
	 * 
	 * @return ArrayList recipes sorted in ascending order by title
	 */
	public String displayAllRecipes() {
		String recipeString = new String();
		//recipes.sortRecipes();	//WHY IS METHOD UNDEFINED FOR TYPE ARRAYLIST<RECIPE> FIX ME!
		for (Recipe r : recipes) {
			recipeString += r.getTitle() + "\n|";
		}
		return recipeString;
	}
	
	/**
	 * @return ArrayList<Recipe> with all recipes that contain keyword in title
	 * returns empty ArrayList if not found
	 */
	public ArrayList<Recipe> searchForRecipe(String keyword) {
		ArrayList<Recipe> results = new ArrayList<Recipe>();
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getTitle().toLowerCase().contains(keyword.toLowerCase())) {
				results.add(recipes.get(i));
			}
		}
		return results;
	}
	
	public boolean recipeIsInList(String keyword) {
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getTitle().toLowerCase().contains(keyword.toLowerCase())) {	//returns true if keyword found in any title
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return ArrayList<Recipe> with all recipes that contain ingredient in IngredientList
	 * returns empty ArrayList if not found
	 */
	public ArrayList<Recipe> searchRecipeByIngredient(String ing) {
		ArrayList<Recipe> results = new ArrayList<Recipe>();
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).displayIngredients().toLowerCase().contains(ing.toLowerCase())) {	//if ingredients list of recipe contains ingredient
				results.add(recipes.get(i));
			}
		}
		return results;
	}
	
	/**
	 * @return size of RecipeList
	 */
	public int getSize() {
		return recipes.size();
	}
	
	/**
	 * @return index of recipe if found
	 * returns -1 if not found
	 */
	public int getIndexOfRecipe(Recipe r) {
		return recipes.indexOf(r);
	}
	
	/**
	 * sorts recipes in list in ascending order by title
	 */
	public void sortRecipes() {
		recipes.sort(new RecipeComparator());
	}
	
}
