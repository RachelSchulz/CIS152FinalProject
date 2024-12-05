/**
 * @author Rachel Schulz
 * @date Nov 27, 2024
 */
package recipe_app.beans;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import recipe_app.EmptyListException;

@Entity
@Table(name="recipelist")
@Data
@AllArgsConstructor
public class RecipeList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int recipeListID;
	private ArrayList<Recipe> recipes;
	
	//constructor
	public RecipeList() {
		this.recipes = new ArrayList<Recipe>();
	}
	
	//AddRecipe
	public void addRecipe(Recipe r) {
		recipes.add(r);
	}
	
	/**
	 * @param r
	 * remove specified Recipe object using ArrayList's remove method
	 */
	public void deleteRecipe(Recipe r) {
		recipes.remove(r);	
	}
	
	/**
	 * @param i
	 * remove Recipe object at specified index using ArrayList's remove method
	 */
	public void deleteRecipe(int i) {
		recipes.remove(i);
	}
	
	/**
	 * 
	 * @return ArrayList recipes sorted in ascending order by title
	 */
	public String displayAllRecipes() {
		String recipeString = new String();
		recipes.sort(new RecipeComparator());
		for (Recipe r : recipes) {
			recipeString += r.getTitle() + "\n";
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
	 * @throws EmptyListException 
	 * @throws IndexOutOfBoundsException 
	 * @throws recipe_app.beans.EmptyListException 
	 */
	public RecipeList searchRecipeByIngredient(String ing) throws IndexOutOfBoundsException, recipe_app.beans.EmptyListException {
		RecipeList results = new RecipeList();
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).displayIngredients().toLowerCase().contains(ing.toLowerCase())) {	//if ingredients list of recipe contains ingredient
				results.addRecipe(recipes.get(i));
			}
		}
		return results;
	}
	
	/**
	 * @return size of RecipeList
	 * Uses ArrayList size method
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
	 * Uses ArrayList's sort method with Comparator that defines sort by recipe title
	 */
	public void sortRecipes() {
		recipes.sort(new RecipeComparator());
	}
	
}
