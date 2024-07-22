<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>This is Help Page</title>
</head>
<body>
<h1>This is Vishal</h1>
<h1>This is Help page </h1>
<%
	/* String name=(String) request.getAttribute("name");
	Integer rollNumber = (Integer)request.getAttribute("rollNumber");
	LocalDateTime time = (LocalDateTime)request.getAttribute("time"); */
%>
<h1>
Hello My Name is 
<%-- <%=name %> --%>

${name}

</h1>
<h1>This is Help Page</h1>
<h1>
My Roll Number is 
<%-- <%=rollNumber %> --%>
${rollNumber}
</h1>

<h1>
Date And Time is<%--  <%=time.toString() --%> %>
${time}
</h1>
<c:forEach var="item" items="${marks }">

<h1>${marks }</h1>


</c:forEach>

</body>
</html>