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
    Student s = (Student)request.getAttribute("s");%>
Updated new <%=s.getSname()%> with class <%=s.getSclass()%> and ID <%=s.getSid()%>.<br>
</head>
<body>
</form>
</body>
</html>