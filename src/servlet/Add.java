package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ab.Dao;

public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   request.getRequestDispatcher("WEB-INF/jsp/add.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   addItem(request);
	   response.sendRedirect("Search");
	}

   private void addItem(HttpServletRequest request) {
      try {
         new Dao().addItem(request.getParameter("name"), request.getParameter("code"));
      } catch(SQLException e) {
         throw new RuntimeException(e);
      }
   }
}