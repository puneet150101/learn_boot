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
    ArrayList<Student> s = 
            (ArrayList<Student>)request.getAttribute("s");
    for(Student i:s){%>

Found <%=i.getSname()%> with class <%=i.getSclass()%> and ID <%=i.getSid()%>.<br>
<button type="button" onclick="document.location='/delete?sid=<%=i.getSid()%>'">Delete</button>
<button type="button" onclick="document.location='/update?sid=<%=i.getSid()%>'">Update</button><br><br>
<%}%>
</head>
<body>
</form>
</body>
</html>