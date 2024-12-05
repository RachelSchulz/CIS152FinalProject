
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<html>
<head>
<meta charset="UTF-8">
<title>Add A Recipe</title>
</head>
<body>
<form th:action="@{/AddRecipe}">
	<label>Recipe Name: </label>
	<input type="text" name="title" size="35" th:name="${param.title}"/><br />
	
	<label>Ingredients: </label>
	<textarea type="paragraph_text" th:text="${param.userIng}" cols="50< rows="15></textarea><br />
	
	<label>Instructions: </label>
	<input name="directions" size="200" th:name="${param.directions}"><br />
	
	<label>User notes: </label>
	<input name="userNote" size="50" th:name="${param.userNote}"><br />
	
	<label>Gluten-Free: </label>
	<input type="checkbox" name="isGF" th:checked=${param.isGF}><br />
	
	<label>Vegan: </label>
	<input type="checkbox" name="isVegan" th:checked=${param.isVegan}><br />
	
	<label>Vegetarian: </label>
	<input type="checkbox" name="isVegetarian" th:checked=${param.isVegetarian}><br />
	
	
	<input type="submit" value="Submit" />
</form>

<a href="Index">Home</a>
<a href="AllRecipes">See All Recipes</a>
</body>
</html>