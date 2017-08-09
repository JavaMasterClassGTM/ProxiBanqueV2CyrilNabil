package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe DAO de connexion à la base de donnees
 * 
 * @author Cyril-Nabil
 */
public class ConnectBdd {

	public static final String url = "jdbc:mysql://localhost:3306/proxibanquev2";
	public static final String user = "root";
	public static final String pwd = "";

	/**
	 * Méthode permettant de se connecter à la base de donnees. S'assurer, au
	 * préalable, d'avoir inclus le fichier "mysql-connector-java-5.1.37-bin.jar"
	 * dans le "Java Build Path".
	 * 
	 * @param url:
	 *            Lien http de la base de données
	 * @param user:
	 *            Nom utilisateur
	 * @param pwd:
	 *            Mot de passe
	 * @return retourne l'objet Connection
	 * @throws Exception
	 *             retournée : ClassNotFoundException
	 */
	public static Connection seConnecter(String url, String user, String pwd) throws ClassNotFoundException {
		Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println(" connecté");
		} catch (SQLException ex) {
			Logger.getLogger(ConnectBdd.class.getName()).log(Level.SEVERE, null, ex);
		}
		return con;
	}

	/**
	 * Méthode pour se déconnecter de la base de données
	 * 
	 * @param con
	 *            : l'object "connexion" à fermer
	 */

	public static void seDeconnecter(Connection con) {
		try {
			con.close();
		} catch (SQLException ex) {
			Logger.getLogger(ConnectBdd.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
