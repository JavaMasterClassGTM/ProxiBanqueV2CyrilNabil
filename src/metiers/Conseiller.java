/**
 * 
 */
package metiers;

/**
 * @author adminl
 *
 */
public class Conseiller extends Personne {
	
	
	String idConseiller;
	String login;
	String password;
	/**
	 * @param nom
	 * @param prenom
	 * @param idConseiller
	 * @param login
	 * @param password
	 */
	public Conseiller(String nom, String prenom, String idConseiller, String login, String password) {
		super(nom, prenom);
		this.idConseiller = idConseiller;
		this.login = login;
		this.password = password;
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
