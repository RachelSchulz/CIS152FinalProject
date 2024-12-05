<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recipes</title>
</head>
<body>
	Your recipes:
	<table>
		<c:forEach items ="${requestScope.allRecipes}" var="currentRecipe">
			<tr>
				<td>${currentRecipe.title} }</td>
			</tr>
		</c:forEach>
	</table>
	</br>
	<a href="Index.jsp">Home</a>
</body>
</html>