/**
 * @author Rachel Schulz
 * @date Oct 29, 2024
 */
package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import recipe_app.Ingredient;

public class IngredientTests {
	@Test
	public void createIngredientNameOnly() {
		//ARRANGE
		Ingredient carrots = new Ingredient("Carrots");
		boolean actual;
		//ACT
		actual = carrots.getIngredName().equals("Carrots");
		//ASSERT
		assertTrue(actual);
	}
	
	@Test
	public void printIngredientAllFieldsAmtIsInt() {
		//ARRANGE
		Ingredient tempeh = new Ingredient("Tempeh", 1, "package", "sliced thinly");
		String printString= "1 package Tempeh, sliced thinly";
		String testString;
		//ACT
		testString = tempeh.toString();
		//ASSERT
		assertEquals(printString, testString);
	}
	
	@Test
	public void printIngredientNullPrepAmtIsInt() {
		//ARRANGE
		Ingredient mushrooms = new Ingredient("Mushrooms", 2, "Cups");
		String printString = "2 Cups Mushrooms";
		String testString;
		//ACT
		testString = mushrooms.toString();
		//ASSERT
		assertEquals(printString, testString);
	}
	
	@Test
	public void printIngredientNullUnitAndPrepAmtIsInt() {
		//ARRANGE
		Ingredient mushrooms = new Ingredient("Mushrooms", 3);
		String printString = "3 Mushrooms";
		String testString;
		//ACT
		testString = mushrooms.toString();
		//ASSERT		
		assertEquals(printString, testString);
	}
	
	@Test
	public void printIngredientsAllFieldAmtIsDouble() {
		//ARRANGE
		Ingredient onions = new Ingredient("Onions", 1.5, "Cups", "diced");
		String printString = "1.5 Cups Onions, diced";
		String testString;
		//ACT
		testString = onions.toString();
		//ASSERT
		assertEquals(printString, testString);
	}
	
	//ARRANGE
	//ACT
	//ASSERT
}
