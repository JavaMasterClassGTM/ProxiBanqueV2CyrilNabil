package presentation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metiers.Client;
import services.ServiceClient;


/**
 * Servlet implementation class ServletCreationClient
 */
@WebServlet("/ServletCreationClient")
public class ServletCreationClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceClient sClient = new ServiceClient();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreationClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try {
			traitement(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {

		String idConseiller=request.getParameter("idConseiller");
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String email=request.getParameter("email");
		String adresse=request.getParameter("adresse");
		String codePostal=request.getParameter("codePostal");
		String ville=request.getParameter("ville");

	     System.out.println(nom + "fice");
	     sClient.creerClient(idConseiller, nom, prenom, email, adresse, codePostal, ville);	

			
		RequestDispatcher dispatcher=request.getRequestDispatcher("AddClient.jsp");;

		dispatcher.forward(request, response);
	}

}
