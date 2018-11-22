import dao.dataAccess;
import model.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * Created by Fatemeh on 12/8/2016.
 */
@WebServlet(name = "loginServlet" , urlPatterns = {"/loginServlet"})

public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        dataAccess da = new dataAccess();
        users find = null;
        find = da.findUser(username,password);

        if (find != null)
        {
            request.setAttribute("status", "success");
            System.out.println("success finding user");

            session.setAttribute( "user" , find );
            response.sendRedirect("/query.jsp");
        }else {

            request.setAttribute("status", "fail");
            System.out.println("deny");
            response.sendRedirect("/errorPage.jsp");

        }


        //request.getRequestDispatcher("index.jsp").forward(request, response);
        //response.sendRedirect("/index.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
