<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
    <%@page import="com.learn.demodb.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Found</title>    
<button type="button" onclick="document.location='/'">Home</button><br><br>
<%
    Student s1 = (Student) request.getAttribute("s1");%>
<h3>Enter new details</h3>
<form action = "updated">
<label for="sid">Student ID:  </label>
<input type="text" id="sid" name="sid" value="<%=s1.getSid()%>" readonly><br>
<label for="sclass">New Student Class:  </label>
<input type="text" id="sclass" name="sclass" value="<%=s1.getSclass()%>" pattern="[0-12]" title="0-12 in numeric input"><br>
<label for="sname">New Student Name:    </label>
<input type="text" id="sname" name="sname" value="<%=s1.getSname()%>" pattern="[A-Za-z]{0-50}" title="Enter full name in alphabets"><br><br>
<input type="submit" value="Update"><br><br><br>
</form>
</head>
<body>
</form>
</body>
</html>