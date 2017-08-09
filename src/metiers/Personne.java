/**
 * Classe Personne avec les champs Nom et Prénom
 */
package metiers;

/**
 * @author Cyril_Nabil
 *
 */
class Personne {
	
	String Nom;
	String Prenom;
	/**
	 * @param nom
	 * @param prenom
	 */
	Personne(String nom, String prenom) {
		super();
		Nom = nom;
		Prenom = prenom;
	}
	public Personne() {
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		Nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return Prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	
	

}
