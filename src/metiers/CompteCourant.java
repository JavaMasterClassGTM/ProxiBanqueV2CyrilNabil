/**
 * 
 */
package metiers;

/**
 * @author adminl
 *
 */
public class CompteCourant extends Compte {
	
	String idCompteCourant;
	double soldeCC;

	/**
	 * @param idClient
	 * @param numCompte
	 * @param isCompteCourant
	 * @param isCompteEpargne
	 * @param solde
	 * @param idCompteCourant
	 * @param soldeCC
	 */
	public CompteCourant(String idClient, String numCompte, Boolean isCompteCourant, Boolean isCompteEpargne,
			double solde, String idCompteCourant, double soldeCC) {
		super(idClient, numCompte, isCompteCourant, isCompteEpargne, solde);
		this.idCompteCourant = idCompteCourant;
		this.soldeCC = soldeCC;
	}

	/**
	 * @return the idCompteCourant
	 */
	public String getIdCompteCourant() {
		return idCompteCourant;
	}
	/**
	 * @param idCompteCourant the idCompteCourant to set
	 */
	public void setIdCompteCourant(String idCompteCourant) {
		this.idCompteCourant = idCompteCourant;
	}
	/**
	 * @return the soldeCC
	 */
	public double getSoldeCC() {
		return soldeCC;
	}
	/**
	 * @param soldeCC the soldeCC to set
	 */
	public void setSoldeCC(double soldeCC) {
		this.soldeCC = soldeCC;
	}
	

}
