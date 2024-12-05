/**
 * @author Rachel Schulz
 * @date Nov 30, 2024
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import recipe_app.beans.RecipeList;

/**
 * Uses built-in methods of JPA Repository interface
 */
public interface RecipeAppRepository extends JpaRepository<RecipeList, Integer>{
	/**
	 * Built in methods
	 * save()
	 * findAll()
	 * count()
	 * delete()
	 * findById()
	 */
}
