/**
 * @author Rachel Schulz
 * @date Nov 27, 2024
 */
package controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import recipe_app.RecipeList;
import recipe_app.Recipe;
import recipe_app.Ingredient;
import recipe_app.IngredientList;

/**
 * 
 */
public class RecipeHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Recipe App");
	
	public void persist(Recipe model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);;
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Recipe model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		//continue
	}
}
