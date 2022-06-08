<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

The student is confirmed : ${student.firstName} ${student.lastName}
<br><br>

country : ${student.country}

<br><br>
operating system :

<ul>
<c:forEach var= "temp"  items = "${student.operatingSys}">
<li> ${temp} </li>

</c:forEach>
</ul>

<br><br>


Favorite language : ${student.favoriteLanguage}
</body>
</html>