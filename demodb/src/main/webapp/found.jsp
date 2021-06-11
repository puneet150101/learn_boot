<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${s.getSname()}</title>
<button type="button" onclick="document.location='/'">Home</button><br><br>
Welcome ${s.getSname()} with class ${s.getSclass()} and ID ${s.getSid()}.<br>
<button type="button" onclick="document.location='/delete?sid=${s.getSid()}'">Delete</button><br><br>
</head>
<body>
</form>
</body>
</html>