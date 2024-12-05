
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
			<h2><p th:text=${viewRecipe.title} ></p></h2>
			<p>TODO display ingredients here</p>
			User note: <p th:text=${viewRecipe.userNote}></p>
			<p>TODO dynamically add whether recipe has attributes gf, vegan, etc</p>
	</div>
	
	<a href="Index">Home</a>
	<a href="AllRecipes">View All Recipes</a>
	<a href="AddRecipe">Add A New Recipe</a>
</body>
</html>