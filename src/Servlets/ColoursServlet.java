package Servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ihor Solohub.
 */
public class ColoursServlet extends HttpServlet {
    private static AtomicInteger colourRed = new AtomicInteger(0);
    private static AtomicInteger colourGreen = new AtomicInteger(0);
    private static AtomicInteger colourBlue = new AtomicInteger(0);
    private static AtomicInteger rainbow5 = new AtomicInteger(0);
    private static AtomicInteger rainbow6 = new AtomicInteger(0);
    private static AtomicInteger rainbow7 = new AtomicInteger(0);
    private static AtomicInteger mixedBlue = new AtomicInteger(0);
    private static AtomicInteger mixedBlack = new AtomicInteger(0);
    private static AtomicInteger mixedPurple = new AtomicInteger(0);

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String colour = req.getParameter("colour");
        String rainbowColours = req.getParameter("rainbow");
        String mixed = req.getParameter("mixed");

        if (colour.equals("red"))
            colourRed.incrementAndGet();
        else if (colour.equals("green"))
            colourGreen.incrementAndGet();
        else {
            colourBlue.incrementAndGet();
        }

        if (rainbowColours.equals("5"))
            rainbow5.incrementAndGet();
        else if (rainbowColours.equals("6"))
            rainbow6.incrementAndGet();
        else {
            rainbow7.incrementAndGet();
        }

        if (mixed.equals("blue"))
            mixedBlue.incrementAndGet();
        else if (mixed.equals("black"))
            mixedBlack.incrementAndGet();
        else {
            mixedPurple.incrementAndGet();
        }
        resp.sendRedirect("http://localhost:18080/loggedPage.jsp");
    }

    public static AtomicInteger getColourRed() {
        return colourRed;
    }

    public static AtomicInteger getColourGreen() {
        return colourGreen;
    }

    public static AtomicInteger getColourBlue() {
        return colourBlue;
    }

    public static AtomicInteger getRainbow5() {
        return rainbow5;
    }

    public static AtomicInteger getRainbow6() {
        return rainbow6;
    }

    public static AtomicInteger getRainbow7() {
        return rainbow7;
    }

    public static AtomicInteger getMixedBlue() {
        return mixedBlue;
    }

    public static AtomicInteger getMixedBlack() {
        return mixedBlack;
    }

    public static AtomicInteger getMixedPurple() {
        return mixedPurple;
    }
}
