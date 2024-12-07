/**
 * @author Rachel Schulz
 * @date Nov 30, 2024
 */
package recipe_app;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import recipe_app.beans.IngredientList;
import recipe_app.beans.Recipe;
import recipe_app.beans.RecipeList;

import java.util.Scanner;



//@SpringBootApplication
public class RecipeApplication {
	

	public static void main(String[] args) {

		//SpringApplication.run(RecipeApplication.class, args);
		
		String userInput;
		Scanner sc = new Scanner(System.in);
		
		//Seeding initial recipes
		String carrots = "1.5 cups carrots, diced";
		String onions = "1/4 cup onions, finely chopped";
		String celery = "celery";
		String lettuce = "3 cups lettuce";
		String ranch = "1.5 cups ranch dressing";
		IngredientList ingredients = new IngredientList();
		ingredients.addIngredient(carrots);
		ingredients.addIngredient(onions);
		ingredients.addIngredient(celery);
		ingredients.addIngredient(lettuce);
		ingredients.addIngredient(ranch);
		Recipe salad = new Recipe("Big Salad", ingredients, "Combine all ingredients in large bowl");
		Recipe soup = new Recipe("Yummy Soup");
		String soupCarrots = "1.5 cups carrots, diced";
		String soupOnions = "1 cups onions, chopped";
		String soupCelery = "celery";
		soup.addIngredient(soupCarrots);
		soup.addIngredient(soupOnions);
		soup.addIngredient(soupCelery);
		RecipeList myList = new RecipeList();
		myList.addRecipe(salad);
		myList.addRecipe(soup);
		Recipe tofuScramble = new Recipe("Tofu Scramble");
		tofuScramble.addIngredient("1 pound block extra-=firm tofu, drained and cubed");
		tofuScramble.addIngredient("2 cups baby bella mushrooms, sliced");
		tofuScramble.addIngredient("1 red bell pepper, chopped");
		tofuScramble.addIngredient("1/4 cup lemon juice");
		tofuScramble.addIngredient("1/4 cup nutritional yeast");
		tofuScramble.addIngredient("2 tsp cumin");
		tofuScramble.addIngredient("1 tsp paprika");
		tofuScramble.addIngredient("1 tsp salt");
		tofuScramble.addIngredient("1/4 tsp black salt aka kala namak");
		tofuScramble.setDirections("Saute mushrooms and bell pepper. Add spices and bloom for 30 seconds. Add lemon juice and nutritional yeast. Add tofu and cook another 10-15 minutes.");
		tofuScramble.setUserNote("Sooo good");
		tofuScramble.setGF(true);
		tofuScramble.setVegan(true);
		tofuScramble.setVegetarian(true);
		myList.addRecipe(tofuScramble);
		
		//Welcome user and get input
		System.out.println("Welcome to My Favorite Recipes!");
		System.out.println("Please choose from the following options: Enter 'V' to view all recipes, enter 'A' to add a recipe. 'Q' to quit");	
		userInput = sc.nextLine();
		while (userInput.toUpperCase().charAt(0) != 'Q') {
			//View List of Recipes
			while (userInput.toUpperCase().charAt(0) == 'V') {
				System.out.println(myList.displayAllRecipes());
				System.out.println("To view a specific recipe, please enter 'R'");
				System.out.println("To add a recipe enter 'A'");
				System.out.println("To quit enter 'Q'");
				userInput = sc.nextLine();
			}
			//View Specific Recipe
			while (userInput.toUpperCase().charAt(0) == 'R') {
				System.out.println("Enter the ID number for the recipe you want to view");
				int userInt = sc.nextInt();
				while (userInt < 0) {
					System.out.println("ID number cannot be negative. Please try again");
					userInt = sc.nextInt();
				}
				System.out.println(myList.displayRecipeByID(userInt));
				sc.nextLine();	//clearing scanner butter to prevent error on next read
				System.out.println("Please enter 'V' to view all recipes, enter 'A' to add a recipe, or enter 'Q' to quit.");
				userInput = sc.nextLine();
			}
			//Add A Recipe
			while (userInput.toUpperCase().charAt(0) == 'A') {
				String title;
				String directions;
				String userIng;
				IngredientList newIng = new IngredientList();
				String userNote;
				String input;
				boolean gf = false;
				boolean vegan = false;
				boolean vegetarian = false;
				System.out.println("Enter title of recipe: ");
				title = sc.nextLine();
				System.out.println("Enter ingredients one at a time. To stop entering ingredients, enter 'END'");
				userIng = sc.nextLine();
				while (!userIng.toUpperCase().equals("END")) {
					newIng.addIngredient(userIng);
					System.out.println("Enter next ingredients or 'END' to end");
					userIng = sc.nextLine();
				}
				System.out.println("Enter directions: ");
				directions = sc.nextLine();
				System.out.println("Enter user note: ");
				userNote = sc.nextLine();
				System.out.println("Is the recipe gluten-free? 'Y' or 'N' ");
				input = sc.nextLine();
				while (input.toUpperCase().charAt(0) != 'Y' && input.toUpperCase().charAt(0) != 'N') {
					System.out.println("Must enter Y or N");
					input = sc.nextLine();
				}
				if (input.toUpperCase().charAt(0) == 'Y') {
					gf = true;
				}
				System.out.println("Is the recipe vegan? 'Y' or 'N' ");
				input = sc.nextLine();
				while (input.toUpperCase().charAt(0) != 'Y' && input.toUpperCase().charAt(0) != 'N') {
					System.out.println("Must enter Y or N");
					input = sc.nextLine();
				}
				if (input.toUpperCase().charAt(0) == 'Y') {
					vegan = true;
				}
				
				System.out.println("Is the recipe vegetarian? 'Y' or 'N' ");
				input = sc.nextLine();
				while (input.toUpperCase().charAt(0) != 'Y' && input.toUpperCase().charAt(0) != 'N') {
					System.out.println("Must enter Y or N");
					input = sc.nextLine();
				}
				if (input.toUpperCase().charAt(0) == 'Y') {
					vegetarian = true;
				}
				//create recipe
				Recipe newRecipe = new Recipe(title, newIng, directions, userNote, gf, vegan, vegetarian);
				//Add recipe to list
				myList.addRecipe(newRecipe);
				System.out.println("Recipe added!");
				System.out.println("To view all recipes enter 'V'");
				System.out.println("To add another recipe enter 'A'");
				System.out.println("To quit enter 'Q'");
				userInput = sc.nextLine();
			}
			//Handle bad menu input
			while (userInput.toUpperCase().charAt(0) != 'Q' && userInput.toUpperCase().charAt(0) != 'R' && userInput.toUpperCase().charAt(0) != 'V'
					&& userInput.toUpperCase().charAt(0) != 'A') {
					System.out.println("Sorry, I didn't get that. Please choose from the following: ");
					System.out.println("To view all recipes enter 'V'");
					System.out.println("To add another recipe enter 'A'");
					System.out.println("To quit enter 'Q'");
					userInput = sc.nextLine();
			}
		}
		
		//Close out program
		System.out.println("Thank you for using the My Favorite Recipes app! Happy eating!");
		
	}

}
