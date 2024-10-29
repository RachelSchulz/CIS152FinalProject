/**
 * @author Rachel Schulz
 * @date Oct 29, 2024
 */
package recipe_app;

import java.util.LinkedList;

public class Recipe {
	
	private String title;	//REQUIRED
	private LinkedList<Ingredient> ingredients;
	private String directions;
	private String userNote;
	private boolean isGF;	//is Gluten Free
	private boolean isVegan;
	private boolean isVegetarian;
	
	//Constructor title only
	/**
	 * @param title
	 */
	public Recipe(String title) {
		this.title = title;
	}
	//Constructor without user note
	/**
	 * @param title
	 * @param ingredients
	 * @param directions
	 */
	public Recipe(String title, LinkedList<Ingredient> ingredients, String directions) {
		this.title = title;
		this.ingredients = ingredients;
		this.directions = directions;
	}
	//Constructor with all fields except bools
	/**
	 * @param title
	 * @param ingredients
	 * @param directions
	 * @param userNote
	 */
	public Recipe(String title, LinkedList<Ingredient> ingredients, String directions, String userNote) {
		this.title = title;
		this.ingredients = ingredients;
		this.directions = directions;
		this.userNote = userNote;
	}
	//Constructor with all fields
	
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title
	 * @param ingredients
	 * @param directions
	 * @param userNote
	 * @param isGF
	 * @param isVegan
	 * @param isVegetarian
	 */
	public Recipe(String title, LinkedList<Ingredient> ingredients, String directions, String userNote, boolean isGF,
			boolean isVegan, boolean isVegetarian) {
		this.title = title;
		this.ingredients = ingredients;
		this.directions = directions;
		this.userNote = userNote;
		this.isGF = isGF;
		this.isVegan = isVegan;
		this.isVegetarian = isVegetarian;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the ingredients
	 */
	public LinkedList<Ingredient> getIngredients() {
		return ingredients;
	}
	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(LinkedList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	/**
	 * @return the directions
	 */
	public String getDirections() {
		return directions;
	}
	/**
	 * @param directions the directions to set
	 */
	public void setDirections(String directions) {
		this.directions = directions;
	}
	/**
	 * @return the userNote
	 */
	public String getUserNote() {
		return userNote;
	}
	/**
	 * @param userNote the userNote to set
	 */
	public void setUserNote(String userNote) {
		this.userNote = userNote;
	}
	/**
	 * @return the isGF
	 */
	public boolean isGF() {
		return isGF;
	}
	/**
	 * @param isGF the isGF to set
	 */
	public void setGF(boolean isGF) {
		this.isGF = isGF;
	}
	/**
	 * @return the isVegan
	 */
	public boolean isVegan() {
		return isVegan;
	}
	/**
	 * @param isVegan the isVegan to set
	 */
	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}
	/**
	 * @return the isVegetarian
	 */
	public boolean isVegetarian() {
		return isVegetarian;
	}
	/**
	 * @param isVegetarian the isVegetarian to set
	 */
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	
	@Override
	public String toString() {
		return "Recipe [title=" + title + ", ingredients=" + ingredients + ", directions=" + directions + ", userNote="
				+ userNote + ", isGF=" + isGF + ", isVegan=" + isVegan + ", isVegetarian=" + isVegetarian + "]";
	}
	
	
	
	
}
