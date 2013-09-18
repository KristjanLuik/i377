package esimene.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionIdAtribute
 */
public class SessionIdAtribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Lisame algatuseks veidi viisakust
		response.getWriter().println("Tere!");
		
		response.getWriter().println("Sinu sessiooni ID juhtumisi saab olema: "+request.getSession().getId());
		response.getWriter().println("Müstilise atribuudi väärtus on : "+request.getParameter("param"));
		
		
		
	}

	

}
