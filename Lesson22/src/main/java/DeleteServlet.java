import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private final Database dataBase = new Database();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String deleteId = req.getParameter("deleteId");
        if (deleteId !=null && !deleteId.isBlank()){
            UUID uuid = UUID.fromString(deleteId);
            dataBase.delete(uuid);
        }
        req.getRequestDispatcher("/home").forward(req, resp);
    }
}
