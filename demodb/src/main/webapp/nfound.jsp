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
<h3>Search student by name here:</h3>
<form action = "search">
<label for="sname">Enter student name:</label>
<input type="text" id="sname" name="sname" pattern="[A-Za-z]{0-50}" title="Enter full name in alphabets"><br>
<input type="submit" value="Find">
</form>
</body>
</html>