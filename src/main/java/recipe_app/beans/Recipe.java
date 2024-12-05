/**
 * @author Rachel Schulz
 * @date Nov 27, 2024
 */
package recipe_app.beans;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import recipe_app.EmptyListException;

@Entity
@Table(name="recipe")
@Data
public class Recipe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;	
	@ManyToOne(cascade = CascadeType.ALL)
	private IngredientList ingredients;
	private String directions;
	private String userNote;
	private boolean isGF;	//is Gluten Free
	private boolean isVegan;
	private boolean isVegetarian;
	
	//Default Constructor
	public Recipe() {
		this.title = "";
		this.ingredients = new IngredientList();
		this.directions = "";
		this.userNote = "";
	}
	
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
		//Constructor with all fields except id
		
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
		
		//Constructor with id
		/**
		 * @param id
		 * @param title
		 * @param ingredients
		 * @param directions
		 * @param userNote
		 * @param isGF
		 * @param isVegan
		 * @param isVegetarian
		 */
		public Recipe(int id, String title, IngredientList ingredients, String directions, String userNote, boolean isGF,
				boolean isVegan, boolean isVegetarian) {
			this.id = id;
			this.title = title;
			this.ingredients = ingredients;
			this.directions = directions;
			this.userNote = userNote;
			this.isGF = isGF;
			this.isVegan = isVegan;
			this.isVegetarian = isVegetarian;
		}
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
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
		
		public void addIngredient(String newIng) {
			ingredients.addIngredient(newIng);
		}
		
		public String displayIngredients() throws IndexOutOfBoundsException, recipe_app.beans.EmptyListException {
			String display = new String();
			for (int i = 0; i < ingredients.getSize(); i++) {
				display += ingredients.getIngredient(i) + "\n";
			}
			return display;
		}
		
		
		/**
		 *@return String details of recipe
		 */
		@Override
		public String toString() {
			return "id: " + id + " " + title + "\n" + "Ingredients:\n" + ingredients.displayIngredients() + "Directions:\n" + directions + "\nuserNote="
					+ userNote + ", isGF=" + isGF + ", isVegan=" + isVegan + ", isVegetarian=" + isVegetarian + "]";
		}
}
