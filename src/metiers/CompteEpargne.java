/**
 * 
 */
package metiers;

/**
 * @author adminl
 *
 */
public class CompteEpargne extends Compte {
	
	String idCompteEpargne;
	double soldeCE;
	
	/**
	 * @param idClient
	 * @param numCompte
	 * @param isCompteCourant
	 * @param isCompteEpargne
	 * @param solde
	 * @param idCompteEpargne
	 * @param soldeCE
	 */
	public CompteEpargne(String idClient, String numCompte, Boolean isCompteCourant, Boolean isCompteEpargne,
			double solde, String idCompteEpargne, double soldeCE) {
		super(idClient, numCompte, isCompteCourant, isCompteEpargne, solde);
		this.idCompteEpargne = idCompteEpargne;
		this.soldeCE = soldeCE;
	}
	/**
	 * @return the idCompteEpargne
	 */
	public String getIdCompteEpargne() {
		return idCompteEpargne;
	}
	/**
	 * @param idCompteEpargne the idCompteEpargne to set
	 */
	public void setIdCompteEpargne(String idCompteEpargne) {
		this.idCompteEpargne = idCompteEpargne;
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
	 * @return the soldeCE
	 */
	public double getSoldeCE() {
		return soldeCE;
	}
	/**
	 * @param soldeCE the soldeCE to set
	 */
	public void setSoldeCE(double soldeCE) {
		this.soldeCE = soldeCE;
	}
	
	

}
