<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 27.06.2016
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Servlets.ColoursServlet" %>
<html>
  <head>
    <title>Colours statistics</title>
  </head>
    <body bgcolor="#d3d3d3"> <br><br><br>
    <center>
        <table border="1" width="707" height="81">
        <tr>
            <td colspan="3" valign="center" align="center"><font size="5.5"><b>Question 1. What colour do you like more?</b></font></td>
        </tr>
        <tr>
            <td valign="center" align="center" width="33%"> Red - <%=ColoursServlet.getColourRed()%><br></td>
            <td valign="center" align="center" width="33%"> Green - <%=ColoursServlet.getColourGreen()%><br></td>
            <td valign="center" align="center" width="34%"> Blue - <%=ColoursServlet.getColourBlue()%><br></td>
        </tr>
            </table><br><br>
        <table border="1" width="707" height="81">
        <tr>
            <td valign="center" align="center" colspan="3"><font size="5.5"><b>Question 2. How many colours has rainbow?</b> </font></td>
        </tr>
        <tr>
            <td valign="center" align="center" width="33%"> Rainbow has 5 colous - <%=ColoursServlet.getRainbow5()%><br></td>
            <td valign="center" align="center" width="33%"> Rainbow has 6 colours - <%=ColoursServlet.getRainbow6()%><br></td>
            <td valign="center" align="center" width="34%"> Rainbow has 7 colours - <%=ColoursServlet.getRainbow7()%><br></td>
        </tr>
            </table> <br><br>
        <table border="1" width="707" height="81">
        <tr>
            <td colspan="3" valign="center" align="center"><font size="5.5"><b> Question 3. What colour you will get after mixing green and yellow?</b></font></td>
        </tr>
        <tr>
            <td valign="center" align="center" width="33%"> Blue - <%=ColoursServlet.getMixedBlue()%><br></td>
            <td valign="center" align="center" width="33%"> Black - <%=ColoursServlet.getMixedBlack()%><br></td>
            <td valign="center" align="center" width="34%"> Purple - <%=ColoursServlet.getMixedPurple()%><br></td>
        </tr>
    </table><br>
<a href="loggedPage.jsp"> Return to your room. </a>
    </center>
    </body>
</html>
