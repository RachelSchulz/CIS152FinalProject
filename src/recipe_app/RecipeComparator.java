/**
 * @author Rachel Schulz
 * @date Nov 13, 2024
 */
package recipe_app;

import java.util.Comparator;

/**
 * 
 */
public class RecipeComparator implements Comparator<Recipe> {
	public int compare(Recipe r1, Recipe r2) {
		
		return r1.getTitle().compareTo(r2.getTitle());	//sort recipes in ascending order by title
		
	}
}
