package Servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ihor Solohub.
 */
public class HobbiesServlet extends HttpServlet {
    private static AtomicInteger hobbyYes = new AtomicInteger(0);
    private static AtomicInteger hobbyNo = new AtomicInteger(0);
    private static AtomicInteger typeFootball = new AtomicInteger(0);
    private static AtomicInteger typeRunning = new AtomicInteger(0);
    private static AtomicInteger typeProgramme = new AtomicInteger(0);
    private static AtomicInteger progJava = new AtomicInteger(0);
    private static AtomicInteger progC = new AtomicInteger(0);
    private static AtomicInteger progPhp = new AtomicInteger(0);

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String haveHobby = request.getParameter("hobby");
        String typeHobby = request.getParameter("type");
        String progLanguage = request.getParameter("prog");

        if (haveHobby.equals("yes"))
            hobbyYes.incrementAndGet();
        else hobbyNo.incrementAndGet();

        if (typeHobby.equals("football"))
            typeFootball.incrementAndGet();
        else if (typeHobby.equals("running"))
            typeRunning.incrementAndGet();
        else typeProgramme.incrementAndGet();

        if (progLanguage.equals("java"))
            progJava.incrementAndGet();
        else if (progLanguage.equals("c++"))
            progC.incrementAndGet();
        else progPhp.incrementAndGet();

        response.sendRedirect("http://localhost:18080/loggedPage.jsp");
    }

    public static AtomicInteger getHobbyYes() {
        return hobbyYes;
    }

    public static AtomicInteger getHobbyNo() {
        return hobbyNo;
    }

    public static AtomicInteger getTypeFootball() {
        return typeFootball;
    }

    public static AtomicInteger getTypeRunning() {
        return typeRunning;
    }

    public static AtomicInteger getTypeProgramme() {
        return typeProgramme;
    }

    public static AtomicInteger getProgJava() {
        return progJava;
    }

    public static AtomicInteger getProgC() {
        return progC;
    }

    public static AtomicInteger getProgPhp() {
        return progPhp;
    }
}
