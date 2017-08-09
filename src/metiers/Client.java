/**
 * 
 */
package metiers;

/**
 * @author adminl
 *
 */
public class Client extends Personne {

	
	String idClient;
	String idConseiller;
	String email;
	String adresse;
	String codePostal;
	String ville;

	/**
	 * @param nom
	 * @param prenom
	 * @param idClient
	 * @param idConseiller
	 * @param email
	 * @param adresse
	 * @param codePostal
	 * @param ville
	 * @param telephone
	 */
	public Client(String idClient, String idConseiller, String nom, String prenom, String email, String adresse,
			String codePostal, String ville) {
		super(nom, prenom);
		this.idClient = idClient;
		this.idConseiller = idConseiller;
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Client() {
		super();
	}

	/**
	 * @return the idClient
	 */
	public String getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	/**
	 * @return the idConseiller
	 */
	public String getIdConseiller() {
		return idConseiller;
	}

	/**
	 * @param idConseiller the idConseiller to set
	 */
	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	
	

}
