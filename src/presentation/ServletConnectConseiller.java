package presentation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ConnectBdd;

/**
 * Servlet implementation class ServletConnectConseiller
 */
@WebServlet("/ServletConnectConseiller")
public class ServletConnectConseiller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletConnectConseiller() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		


		String idConseiller = request.getParameter("idConseiller");
		String login = request.getParameter("loginConseiller");
		String password = request.getParameter("pwdConseiller");
        
		String loginCons = null;
		 String pwdCons = null;
		
		// Obtenir une connexion
		Connection cnx =null;
		ResultSet rs = null;
		try {
			cnx = ConnectBdd.seConnecter(ConnectBdd.url, ConnectBdd.user, ConnectBdd.pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// obtenir le mot de passe et mot de passe conseiller
				
		String requete = "select login, password from Conseiller where idConseiller ="+idConseiller;
		PreparedStatement pstmt= null;
		
	
		try {
			pstmt = cnx.prepareStatement(requete);
			try {
				rs = pstmt.executeQuery();
				 loginCons = null;
				 pwdCons = null;
				while (rs.next()) {
					 loginCons = rs.getString("login");
					 pwdCons = rs.getString("password");
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
			
		RequestDispatcher dispatcher;

		if ((loginCons.equals(login)) && (pwdCons.equals(password))) {
			dispatcher = request.getRequestDispatcher("Home.jsp");

		} else {
			dispatcher = request.getRequestDispatcher("Erreur.jsp");
		}
		dispatcher.forward(request, response);

	}

}
