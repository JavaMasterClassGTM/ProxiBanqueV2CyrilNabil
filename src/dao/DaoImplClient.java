/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import metiers.Client;

/**
 * @author Cyril-Nabil
 * 
 */
public class DaoImplClient implements IDaoClient {


	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.IDaoClient#creerClient()
	 */

	@Override
	public void creerClient(String idConseiller, String nom, String prenom, String email, String adresse,
			String codePostal, String ville) throws ClassNotFoundException, SQLException {

		// Obtenir une connexion

		Connection cnx = ConnectBdd.seConnecter(ConnectBdd.url, ConnectBdd.user, ConnectBdd.pwd);
        
		// pour obtenir la taille de la table Client 
		String queryString = "select * from Client";
		PreparedStatement pstmt1 = cnx.prepareStatement(queryString);
		ResultSet rs = pstmt1.executeQuery();
		int sizeTabCli = 0;
		while (rs.next()) {
			++sizeTabCli;
		}
		++sizeTabCli;
        
		// Préparer la requête

		String requete = "insert into Client (idClient, idConseiller, nom, prenom, email, adresse,"
				+ "codePostal, ville) values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = cnx.prepareStatement(requete);   
		
		
		pstmt.setString(1, ""+sizeTabCli);
		pstmt.setString(2, idConseiller);
		pstmt.setString(3, nom);
		pstmt.setString(4, prenom);
		pstmt.setString(5, email);
		pstmt.setString(6, adresse);
		pstmt.setString(7, codePostal);
		pstmt.setString(8, ville);

		pstmt.execute();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.IDaoClient#editerClient()
	 */
	@Override
	public void editerClient() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.IDaoClient#listerClients()
	 */
	@Override
	public ArrayList<Client> listerClients(String idconseiller) throws SQLException {

		// Obtenir une connexion

		Connection cnx = null;

		try {
			cnx = ConnectBdd.seConnecter(ConnectBdd.url, ConnectBdd.user, ConnectBdd.pwd);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		// Preparer la requete

		String requete = "select idClient, idConseiller, nom, prenom, email, adresse,"
				+ " codePostal, ville from client where idConseiller = ?";

		PreparedStatement pstmt = cnx.prepareStatement(requete);
		pstmt.setString(1, idconseiller);
		ResultSet rs = pstmt.executeQuery();

		ArrayList<Client> listeClients = new ArrayList<>();
		try {

			while (rs.next()) {
				System.out.println(1);

				Client client = new Client();

				client.setIdClient(rs.getString("idClient"));
				client.setIdConseiller(rs.getString("idConseiller"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setEmail(rs.getString("email"));
				client.setAdresse(rs.getString("adresse"));
				client.setCodePostal(rs.getString("codePostal"));
				client.setVille(rs.getString("ville"));

				listeClients.add(client);

				System.out.println(2);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeClients;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.IDaoClient#supprimerClient()
	 */
	@Override
	public void supprimerClient() {

	}

}
