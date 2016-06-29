package Servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ihor Solohub.
 */
public class PlacesServlet extends HttpServlet {
    private static AtomicInteger fromVillage = new AtomicInteger(0);
    private static AtomicInteger fromTown = new AtomicInteger(0);
    private static AtomicInteger likeKievYes = new AtomicInteger(0);
    private static AtomicInteger likeKievNo = new AtomicInteger(0);
    private static AtomicInteger likeProgYes = new AtomicInteger(0);
    private static AtomicInteger likeProgNo = new AtomicInteger(0);
    private static AtomicInteger likeProgHz = new AtomicInteger(0);

    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
        String from = request.getParameter("from");
        String likeKiev = request.getParameter("like");
        String likeProg = request.getParameter("prog");

        if (from.equals("village"))
            fromVillage.incrementAndGet();
        else fromTown.incrementAndGet();

        if (likeKiev.equals("yes"))
            likeKievYes.incrementAndGet();
        else likeKievNo.incrementAndGet();

        if (likeProg.equals("yes"))
            likeProgYes.incrementAndGet();
        else if (likeProg.equals("no"))
            likeProgNo.incrementAndGet();
        else likeProgHz.incrementAndGet();

        response.sendRedirect("http://localhost:18080/loggedPage.jsp");
    }

    public static AtomicInteger getFromVillage() {
        return fromVillage;
    }

    public static AtomicInteger getFromTown() {
        return fromTown;
    }

    public static AtomicInteger getLikeKievYes() {
        return likeKievYes;
    }

    public static AtomicInteger getLikeKievNo() {
        return likeKievNo;
    }

    public static AtomicInteger getLikeProgYes() {
        return likeProgYes;
    }

    public static AtomicInteger getLikeProgNo() {
        return likeProgNo;
    }

    public static AtomicInteger getLikeProgHz() {
        return likeProgHz;
    }
}
