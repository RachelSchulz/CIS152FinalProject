/**
 * @author Rachel Schulz
 * @date Oct 29, 2024
 */
package recipe_app;

/**
 * 
 */
public class Ingredient {
	
	private String ingredName;
	
	//Constructor ingredient name only
	/**
	 * @param ingredName
	 */
	public Ingredient(String ingredName) {
		this.ingredName = ingredName;
	}
	
	/**
	 * @return the ingredName
	 */
	public String getIngredName() {
		return ingredName;
	}
	/**
	 * @param ingredName the ingredName to set
	 */
	public void setIngredName(String ingredName) {
		this.ingredName = ingredName;
	}
	
}
