<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 27.06.2016
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Servlets.LoginServlet" %>
<html>
<head>
    <title>Your private room</title>
</head>
<body bgcolor="#d3d3d3">
<%String login = (String) session.getAttribute("user_login");%>
<%if (login == null || "".equals(login)) {
    response.sendRedirect("index.html");%>
<% }else {%>
<h2>You are logged in as:  <%=login%></h2>
    <a href="/login?a=exit">Click this link to logout</a><%}%> <br><br><br><br>
<center>
    <table border="1" width="400" height="160">
        <tr>
            <td colspan="3" valign="center" align="center"><center><font size="6"><b> Avaliable questionnaire</b></font></center></td>
        </tr>
        <tr>
            <td><center><a href="colours.html"><h2>Colours</h2></a>
                <a href="statColours.jsp">Statistics</a> </center></td>
            <td><center><a href="places.html"><h2>Places</h2></a>
                <a href="statPlaces.jsp">Statistics</a> </center></td>
            <td><center><a href="hobbies.html"><h2>Hobbies</h2></a>
                <a href="statHobbies.jsp">Statistics</a> </center></td>
        </tr>
    </table>
</center>
</body>
</html>
