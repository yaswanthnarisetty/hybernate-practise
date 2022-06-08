<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">

		First name: <form:input path="firstName" />

		<br><br>

		Last name: <form:input path="lastName" />

		<br><br>

		Country:
		<form:select path = "country">
           <form:options items = "${student.countryOptions}" />


		</form:select>

			<br><br>
        	Favorite Language:
        	java <form:radiobutton path = "favoriteLanguage" value = "java"/>
            python <form:radiobutton path = "favoriteLanguage" value = "python"/>
        	c# <form:radiobutton path = "favoriteLanguage" value = "c#"/>
        	js <form:radiobutton path = "favoriteLanguage" value = "js"/>

            <br><br>

            Operating System:
            Linux <form:checkbox path = "operatingSys" value = "Linux"/>
            Windows <form:checkbox path = "operatingSys" value = "Windows"/>
            Mac <form:checkbox path = "operatingSys" value = "Mac"/>

            <br><br>

		<input type="submit" value="Submit" />

	</form:form>

</body>

</html>











