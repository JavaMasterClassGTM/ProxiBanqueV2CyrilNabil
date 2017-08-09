/**
 * 
 */
package metiers;

/**
 * @author adminl
 *
 */
public class Compte {
	
	String idClient;
	String numCompte;
	Boolean isCompteCourant;
	Boolean isCompteEpargne;
	double solde;
	/**
	 * @param idClient
	 * @param numCompte
	 * @param isCompteCourant
	 * @param isCompteEpargne
	 * @param solde
	 */
	public Compte(String idClient, String numCompte, Boolean isCompteCourant, Boolean isCompteEpargne, double solde) {
		super();
		this.idClient = idClient;
		this.numCompte = numCompte;
		this.isCompteCourant = isCompteCourant;
		this.isCompteEpargne = isCompteEpargne;
		this.solde = solde;
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
	 * @return the numCompte
	 */
	public String getNumCompte() {
		return numCompte;
	}
	/**
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	/**
	 * @return the isCompteCourant
	 */
	public Boolean getIsCompteCourant() {
		return isCompteCourant;
	}
	/**
	 * @param isCompteCourant the isCompteCourant to set
	 */
	public void setIsCompteCourant(Boolean isCompteCourant) {
		this.isCompteCourant = isCompteCourant;
	}
	/**
	 * @return the isCompteEpargne
	 */
	public Boolean getIsCompteEpargne() {
		return isCompteEpargne;
	}
	/**
	 * @param isCompteEpargne the isCompteEpargne to set
	 */
	public void setIsCompteEpargne(Boolean isCompteEpargne) {
		this.isCompteEpargne = isCompteEpargne;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	

}
