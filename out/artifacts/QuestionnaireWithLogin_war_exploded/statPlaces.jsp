<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 27.06.2016
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Servlets.PlacesServlet" %>
<html>
   <head>
    <title>Places statistics</title>
   </head>
     <body bgcolor="#d3d3d3"><br><br><br>
     <center>
         <table border="1" width="707" height="81">
         <tr>
             <td colspan="2" valign="center" align="center"><font size="5.5"><b> Question 1. Where are you from?</b></font></td>
         </tr>
         <tr>
            <td valign="center" align="center" width="50%">I'm from village - <%=PlacesServlet.getFromVillage()%><br></td>
            <td valign="center" align="center" width="50%">I'm from town - <%=PlacesServlet.getFromTown()%><br></td>
         </tr>
         </table>

         <table border="1" width="707" height="81">
         <tr>
            <td colspan="2" valign="center" align="center"><font size="5.5"><b>Question 2. Do you like Kiev?</b></font></td>
         </tr>
         <tr>
             <td valign="center" align="center" width="50%">Yes! - <%=PlacesServlet.getLikeKievYes()%></td><br>
             <td valign="center" align="center" width="50%">No! - <%=PlacesServlet.getLikeKievNo()%></td><br>
         </tr>
         </table><br><br>
         <table border="1" width="707" height="81">
         <tr>
             <td colspan="3" valign="center" align="center"><font size="5.5"><b>Question 3. Do you like Prog.kiev.ua?</b></font></td>
         </tr>
         <tr>
            <td valign="center" align="center" width="33%">Yes! - <%=PlacesServlet.getLikeProgYes()%></td>
            <td valign="center" align="center" width="33%">No! - <%=PlacesServlet.getLikeKievNo()%></td>
            <td valign="center" align="center" width="34%">I don't know - <%=PlacesServlet.getLikeProgHz()%></td>
         </tr>
         </table><br>
<a href="loggedPage.jsp"> Return to your room. </a>
     </center>
</body>
</html>
