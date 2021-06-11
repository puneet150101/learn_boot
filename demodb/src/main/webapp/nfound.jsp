<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Not Found</title>
</head>
<body>
<button type="button" onclick="document.location='/'">Home</button><br><br>
<h1>Student don't exist in DB</h1>
<h3>Search student by ID here:</h3>
<form action = "search">
<label for="sid">Enter student ID</label>
<input type="text" id="sid" name="sid"><br>
<input type="submit" value="Find">
</form>
</body>
</html>