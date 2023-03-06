package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/AuthentificationServlet")
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String login=request.getParameter("login");
		   String password=request.getParameter("password");
		   
		    if (login.equals("dsi") && password.equals("dsi")) {
		      

		      PrintWriter out = response.getWriter();
		      out.println("<html><body>");
		      out.println("<h2>Authentification réussie</h2>");
		      out.println("</body></html>");
		    } else {
		      
		      PrintWriter out = response.getWriter();
		      out.println("<html><body>");
		      out.println("<h2>Echec à l'authentification</h2>");
		      out.println("</body></html>");
		    }
		  
		






		    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
