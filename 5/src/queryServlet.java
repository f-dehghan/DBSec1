import dao.dataAccess;
import model.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;

/**
 * Created by Fatemeh on 11/21/2018.
 */

@WebServlet(name = "queryServlet" , urlPatterns = {"/queryServlet"})
public class queryServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        users user = (users)session.getAttribute("user");
        String query = request.getParameter("query");

        System.out.println(query);
        dataAccess da = new dataAccess();
        ResultSet rs = da.executeQuery(query);

        response.sendRedirect("/query.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }



}
