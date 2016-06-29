package Servlets;

/**
 * @author Ihor Solohub.
 */
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginServlet extends HttpServlet {
    private static final Map<String, String> logins = new HashMap<>();
    private static String loginName;

    static {
        logins.put("Ihor", "admin");
        logins.put("user", "guest");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String temp = logins.get(login);

        if (password.equals(temp)){
            HttpSession session = req.getSession(true);
            session.setAttribute("user_login", login);
            resp.sendRedirect("http://localhost:18080/loggedPage.jsp");
        }else {
            resp.getWriter().println("Incorrect login or password! Try again.");
        }
    }

    public void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String a = req.getParameter("a");
        HttpSession session = req.getSession(false);

        if ("exit".equals(a) && (session != null))
            session.removeAttribute("user_login");

        resp.sendRedirect("index.html");
    }
    }

