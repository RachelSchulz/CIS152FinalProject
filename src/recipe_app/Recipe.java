/**
 * @author Rachel Schulz
 * @date Oct 29, 2024
 */
package recipe_app;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String title;	//REQUIRED
	private IngredientList ingredients;
	//private LinkedList<Ingredient> ingredients;
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
		this.ingredients = new IngredientList();
		this.directions = "";
		this.userNote = "";
	}
	//Constructor without user note
	/**
	 * @param title
	 * @param ingredients
	 * @param directions
	 */
	public Recipe(String title, IngredientList ingredients, String directions) {
		this.title = title;
		this.ingredients = ingredients;
		this.directions = directions;
		this.userNote = "";
	}
	//Constructor with all fields except bools
	/**
	 * @param title
	 * @param ingredients
	 * @param directions
	 * @param userNote
	 */
	public Recipe(String title, IngredientList ingredients, String directions, String userNote) {
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
	public Recipe(String title, IngredientList ingredients, String directions, String userNote, boolean isGF,
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
	public IngredientList getIngredients() {
		return ingredients;
	}
	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(IngredientList ingredients) {
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
	
	public void addIngredient(Ingredient newIng) {
		ingredients.addIngredient(newIng);
	}
	
	public String displayIngredients() throws IndexOutOfBoundsException, EmptyListException {
		String display = new String();
		for (int i = 0; i < ingredients.getSize(); i++) {
			display += ingredients.getIngredient(i) + "\n";
		}
		return display;
	}
	
	//TODO needs fine tuning
	@Override
	public String toString() {
		return title + "\n" + "Ingredients:\n" + ingredients.displayIngredients() + "Directions:\n" + directions + "\nuserNote="
				+ userNote + ", isGF=" + isGF + ", isVegan=" + isVegan + ", isVegetarian=" + isVegetarian + "]";
	}
	
	
	
	
}
