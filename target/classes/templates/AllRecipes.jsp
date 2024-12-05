
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<html>
<head>
<meta charset="UTF-8">
<title>Recipes</title>
</head>
<body>
	Your recipes:
	<form>
	<table>
		<tr th:each="currentRecipe : $({recipes}">
			<td th:text="${currentRecipe.id} }">
				<td th:text="${currentRecipe.title}" />
				<td><a th:href="@{/ViewRecipe/{id}(id=${currentRecipe.id} )}">View Recipe</a>
			</tr>
		</tr>
	</table>
	</form>
	</br>
	<a href="Index">Home</a>
	<a href="AddRecipe">Add A New Recipe</a>
</body>
</html>