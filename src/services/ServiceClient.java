package services;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.DaoImplClient;
import metiers.Client;

/**
 * 
 * @author Adminl
 *
 */

public class ServiceClient implements IServiceClient {

	
	DaoImplClient dao = new DaoImplClient();
	
		
	public ServiceClient() {

	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.IDaoClient#editerClient()
	 */

	@Override
	public void creerClient(String idConseiller, String nom, String prenom, String email, String adresse,
			String codePostal, String ville) throws ClassNotFoundException, SQLException {
		dao.creerClient(idConseiller, nom, prenom, email, adresse, codePostal, ville);
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.IDaoClient#editerClient()
	 */

	@Override
	public ArrayList<Client> listerClients(String idConseiller) throws SQLException {
		return dao.listerClients(idConseiller);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.IDaoClient#editerClient()
	 */

	@Override
	public void editerClient() {
		// TODO Auto-generated method stub
		
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.IDaoClient#editerClient()
	 */

	@Override
	public void supprimerClient() {
		// TODO Auto-generated method stub
		
	}
}
