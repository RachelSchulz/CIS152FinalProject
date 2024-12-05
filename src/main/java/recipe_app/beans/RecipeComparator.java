/**
 * @author Rachel Schulz
 * @date Nov 27, 2024
 */
package recipe_app.beans;

import java.util.Comparator;

import recipe_app.beans.Recipe;

/**
 * Comparator for sort method in RecipeList
 */
public class RecipeComparator implements Comparator<Recipe> {
	public int compare(Recipe r1, Recipe r2) {
		
		return r1.getTitle().compareTo(r2.getTitle());	//sort recipes in ascending order by title
		
	}
}
