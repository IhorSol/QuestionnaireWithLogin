<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 27.06.2016
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Servlets.HobbiesServlet" %>
<html>
<head>
    <title>Hobbies statistics</title>
</head>
    <body bgcolor="#d3d3d3"><br><br><br>
    <center>
        <table border="1" width="707" height="81">
            <tr>
                <td colspan="2" valign="center" align="center"><font size="5.5"><b> Question 1. Do you have hobby?</b></font></td>
            </tr>
            <tr>
                <td valign="center" align="center" width="50%">Yes I have - <%=HobbiesServlet.getHobbyYes()%><br></td>
                <td valign="center" align="center" width="50%"> No I haven't - <%=HobbiesServlet.getHobbyNo()%><br></td>
            </tr>
        </table><br><br>
        <table border="1" width="707" height="81">
            <tr>
                <td colspan="3" valign="center" align="center"> <font size="5.5"><b> Question 2. What kind of hobby do you have?</b></font></td>
            </tr>
            <tr>
                <td valign="center" align="center" width="33%">Football! - <%=HobbiesServlet.getTypeFootball()%><br></td>
                <td valign="center" align="center" width="33%">Runnong! - <%=HobbiesServlet.getTypeRunning()%><br></td>
                <td valign="center" align="center" width="34%">Programme! - <%=HobbiesServlet.getTypeProgramme()%><br></td>
            </tr>
        </table><br><br>
        <table border="1" width="707" height="81">
            <tr>
                <td colspan="3" valign="cebter" align="center"> <font size="5.5"><b> Question 3. What programming language do you want to learn?</b></font></td>
            </tr>
            <td valign="center" align="center" width="33%">Java! - <%=HobbiesServlet.getProgJava()%><br></td>
            <td valign="center" align="center" width="33%">C++! - <%=HobbiesServlet.getProgC()%><br></td>
            <td valign="center" align="center" width="34%">PHP! - <%=HobbiesServlet.getProgPhp()%><br></td>
        </table><br>
<a href="loggedPage.jsp">Return to your room.</a>
    </center>
</body>
</html>
