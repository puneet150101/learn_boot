<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.learn.demodb.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Students</title>
</head>
<body>
<button type="button" onclick="document.location='/'">Home</button><br><br>
<%
    Iterable<Student> s = (Iterable<Student>)request.getAttribute("s");
    for(Student i:s){%>
ID = <%=i.getSid()%> , Name = <%=i.getSname()%> ,  Class = <%=i.getSclass()%><br>

<%}%>
</body>
</html>