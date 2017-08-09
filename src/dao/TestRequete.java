package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import metiers.Client;

/**
 *
 * @author Cyril-Nabil
 * 
 */

public class TestRequete {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		DaoImplClient dao = new DaoImplClient();
		
		ArrayList<Client> Liste=dao.listerClients("1");
		
		System.out.println(Liste);
		
		dao.creerClient("3", "rrrr", "dqe", "dbdg", "ssss", "234", "wsgefqz");		
		
		ArrayList<Client> Liste1=dao.listerClients("3");
		
		System.out.println(Liste1);
		
//		try {
//
//			// Connection con = ConnectBdd.seConnecter(ConnectBdd.url, ConnectBdd.user,
//			// ConnectBdd.pwd);
//			//
//			// String queryString = "select * from Client where idConseiller = 2";
//			//
//			// PreparedStatement pstmt = con.prepareStatement(queryString);
//			//
//			// ResultSet rs = pstmt.executeQuery();
//			// while (rs.next()) {
//			// String idClient = rs.getString("idClient");
//			// String idconseiller = rs.getString("idconseiller");
//			// String Nom = rs.getString("Nom");
//			// String Prenom = rs.getString("Prenom");
//			// String Email = rs.getString("Email");
//			// String adresse = rs.getString("Adresse");
//			// String ville = rs.getString("Ville");
//			// int CodePostal = rs.getInt("codePostal");
//			//
//			// System.out.println(idClient + ", " + idconseiller + ", " + Nom + ", " +
//			// Prenom + ", " + Email + ", "
//			// + adresse + ", " + ville + ", " + CodePostal);
//			//
//			// }
//			// System.out.println("données récupérées");
//			//
//			// String nom = "wqaxsz";
//			// String prenom = ",junhy";
//			// String idClient = "9";
//			// String idConseiller = "2";
//			// String email = "vfr";
//			// String adresse = "vr(";
//			// int codePostal = 1235;
//			// String ville = "ici";
//			//
//			// String requete = "insert into Client (idClient, idConseiller, nom, prenom,
//			// email, adresse,"
//			// + "codePostal, ville) values(?,?,?,?,?,?,?,?)";
//			// PreparedStatement pstmt1 = con.prepareStatement(requete);
//			// pstmt1.setString(1, idClient);
//			// pstmt1.setString(2, idConseiller);
//			// pstmt1.setString(3, nom);
//			// pstmt1.setString(4, prenom);
//			// pstmt1.setString(5, email);
//			// pstmt1.setString(6, adresse);
//			// pstmt1.setInt(7, codePostal);
//			// pstmt1.setString(8, ville);
//			//
//			// pstmt1.execute();
//
//		} catch (SQLException exc) {
//			System.out.println("la connexion a échoué");
//		}
//
	}

}
