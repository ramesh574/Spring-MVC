

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
<h1>Hi !<br> Good Morning Buddies!!</h1>
<%-- <%
 String name=(String)request.getAttribute("name");
  Integer i=(Integer)request.getAttribute("rollnumber");
  //LocalDateTime time=(LocalDateTime)request.getAttribute("time");

%> --%>
<h1>
    Hello My name is
  <%--<%=name %>  --%>
  ${name }
      
</h1>
<h1>
    My rollnumber is
    ${Id }
   
   <%--   <%=i %> --%>
</h1>

</body>
</html>