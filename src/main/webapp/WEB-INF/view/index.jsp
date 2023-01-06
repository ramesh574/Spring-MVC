<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>THis is My Home page</h1>
<h2>Your most welcome to My page</h2>

<%

String st=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("Id");
   //List<String> friends=(List<String>)request.getAttribute("f");
   Object frnd=request.getAttribute("f");
    
%>
<h1>My Name is Er.<%=st %></h1>
<h3>My card number is <%=id %></h3>
<!--  <h1>This is my friends/*</h1> -->
<h2>My friend List is this<%=frnd %></h2>
</body>
</html>