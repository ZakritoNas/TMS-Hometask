import domain.Flowers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    private final Database dataBase = new Database();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String color = req.getParameter("color");

        Flowers flower = new Flowers();
        flower.setName(name);
        flower.setColor(color);

        dataBase.create(flower);
        req.getRequestDispatcher("/home").forward(req, resp);
    }
}
