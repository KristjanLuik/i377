package esimene;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomePage
 */
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("Tere! <br />");
		
		response.getWriter().println("Sinu sessiooni ID juhtumisi saab olema: "+request.getSession().getId()+"<br />");
		response.getWriter().println("M�stilise atribuudi v��rtus on : "+request.getParameter("param")+"<br />");
	}

}