<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<h3>Add a member here:</h3>
<form action = "addS">
<label for="sclass">Student Class:  </label>
<input type="text" id="sclass" name="sclass" pattern="[0-12]" title="0-12 in numeric input"><br>
<label for="sname">Student Name:    </label>
<input type="text" id="sname" name="sname" pattern="[A-Za-z]{0-50}" title="Enter full name in alphabets"><br><br>
<input type="submit" value="Create Entry"><br><br><br>
</form>
<h3>Search student by Name here:</h3>
<form action = "search">
<label for="sname">Enter student name:</label>
<input type="text" id="sname" name="sname" pattern="[A-Za-z]{0-50}" title="Enter full name in alphabets"><br>
<input type="submit" value="Find"><br><br>
<h3>Search student by class:</h3>
<form action = "search">
<label for="sclass">Enter student class:</label>
<input type="text" id="sclass" name="sclass" pattern="[0-12]" title="0-12 in numeric input"><br>
<input type="submit" value="Find"><br><br>
<button type="button" onclick="document.location='/showall'">ShowAll</button><br><br>
</form>
</body>
</html>