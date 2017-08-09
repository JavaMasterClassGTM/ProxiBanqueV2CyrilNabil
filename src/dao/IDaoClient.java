/**
 * 
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import metiers.Client;

/**
 * Interface DAO Client avec les méthodes CRUD
 * @author Cyril-Nabil
 *
 */
public interface IDaoClient {
	
	void creerClient(String idConseiller, String nom, String prenom, String email, String adresse, String codePostal,
			String ville) throws ClassNotFoundException, SQLException;
    
	void editerClient();
    
	ArrayList<Client> listerClients(String idConseiller) throws SQLException;
	
	void supprimerClient();
}
