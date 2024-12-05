
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<html>
<head>
<meta charset="UTF-8">
<title>View Recipe<title>
</head>
<body>
	<div class="container">
		<div>
			<h2 th:text=${viewRecipe.title} ></h2>
			<p th:each="ingredient : ${viewRecipe.ingredients}"
				th:text="${ingredient}"></p>
			Directions: <p th:text="${viewRecipe.directions}"></p>
			User note: <p th:text=${viewRecipe.userNote}></p>
			<p th:case="#{viewRecipe.isGF }">Gluten Free</p>
			<p th:case="#{viewRecipe.isVegan }">Vegan</p>
			<p th:case="#{viewRecipe.isVegetarian }">Vegetarian</p>
	</div>
	
	<a href="Index">Home</a>
	<a href="AllRecipes">View All Recipes</a>
	<a href="AddRecipe">Add A New Recipe</a>
</body>
</html>