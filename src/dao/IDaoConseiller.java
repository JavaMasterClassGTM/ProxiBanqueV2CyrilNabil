package dao;

import metiers.CompteCourant;
import metiers.CompteEpargne;
import metiers.Conseiller;

public interface IDaoConseiller {
	
	public Conseiller seConnecter(String idConseiller);
	public CompteCourant creerCompteCourant(String idClient);
	public CompteEpargne creerCompteEpargne(String idClient);

}
