package store;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet(name = "logout", urlPatterns = {"/logout"})
public class logout extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
        		HttpSession session = request.getSession();
        		
        		DBConnection db = new DBConnection();
        		ResultSet rs = db.checkUserLogin(session.getAttribute("username").toString(), "");
        		
                session.setAttribute("username", null);
                response.sendRedirect("index.jsp");
                
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}