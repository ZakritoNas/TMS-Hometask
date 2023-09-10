import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/forma")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String language = req.getParameter("option");
        String information = req.getParameter("information");
        String secretWord = req.getParameter("secret");

        resp.getWriter().println("Name: " + name + "; " + "Language: " + language + "; " +
                "Additional Information: " + information + "; " + " Secret Word: " + secretWord);
    }
}

