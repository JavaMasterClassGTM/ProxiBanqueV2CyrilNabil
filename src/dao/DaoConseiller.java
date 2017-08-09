/**
 * 
 */
package dao;

import metiers.CompteCourant;
import metiers.CompteEpargne;
import metiers.Conseiller;

/**
 * @author adminl
 *
 */
public class DaoConseiller implements IDaoConseiller {

	/**
	 * 
	 */
	public DaoConseiller() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see dao.IDaoConseiller#seConnecter(java.lang.String)
	 */
	@Override
	public Conseiller seConnecter(String idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see dao.IDaoConseiller#creerCompteCourant(java.lang.String)
	 */
	@Override
	public CompteCourant creerCompteCourant(String idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see dao.IDaoConseiller#creerCompteEpargne(java.lang.String)
	 */
	@Override
	public CompteEpargne creerCompteEpargne(String idClient) {
		// TODO Auto-generated method stub
		return null;
	}

}
