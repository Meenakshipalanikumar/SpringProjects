<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<f:form name="regform" action="regAction" method="post">
Enter your id: <input type="text" name="uid" />
Enter your Email :   <input type="text" name="uemail" />
Enter your Username: <input type="text" name="uname" />
Enter your Password: <input type="password" name="upass" />
Enter your Mobile:   <input type="text" name="umob" />
<input type="submit" name="enter" />
</f:form> 
</body>
</html>