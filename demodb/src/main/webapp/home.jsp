<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<h3>Add a member here:</h3>
<form action = "addS">
<label for="sid">Student ID:        </label>
<input type="text" id="sid" name="sid"><br>
<label for="sclass">Student Class:  </label>
<input type="text" id="sclass" name="sclass"><br>
<label for="sname">Student Name:    </label>
<input type="text" id="sname" name="sname"><br><br>
<input type="submit" value="Create Entry"><br><br><br>
</form>
Added ${s.getSname()} with class ${s.getSclass()} and ID ${s.getSid()}.<br><br><br>
<h3>Search student by ID here:</h3>
<form action = "search">
<label for="sid">Enter student ID</label>
<input type="text" id="sid" name="sid"><br>
<input type="submit" value="Find">
</form>
</body>
</html>