<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>


<%
String name = (String)request.getAttribute("name");
Integer id = (Integer)request.getAttribute("id");
String f = (String)request.getAttribute("f");
List<String> friends = (List<String>) request.getAttribute("friends");
%>

<h1>Name is <%=name %></h1>
<h1>Id is <%=id %></h1>

<%
if (friends != null) {
    for (String s : friends) {
%>
<h1><%= s %></h1>
<%
    }
}
%>

<h1>This is our home page</h1>
<h1>This is called by home url</h1>

</body>
</html>
