/**
 * 
 */
package services;

import java.sql.SQLException;
import java.util.ArrayList;

import metiers.Client;

/**
 * 
 * @author adminl
 *
 */
public interface IServiceClient {

	/**
	 * 
	 * @param idConseiller
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adresse
	 * @param codePostal
	 * @param ville
	 */
	void creerClient(String idConseiller, String nom, String prenom, String email, String adresse, String codePostal,
			String ville) throws ClassNotFoundException, SQLException;

	/**
	 * 
	 * @param idConseiller
	 * @return
	 */

	ArrayList<Client> listerClients(String idConseiller) throws SQLException;

	/**
	 * 
	 * 
	 */
	void editerClient();

	/**
	 * 
	 * 
	 */
	public void supprimerClient();
}
