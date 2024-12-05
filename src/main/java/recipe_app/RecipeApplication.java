/**
 * @author Rachel Schulz
 * @date Nov 30, 2024
 */
package recipe_app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RecipeApplication {

	public static void main(String[] args) {

		SpringApplication.run(RecipeApplication.class, args);

	}

}
