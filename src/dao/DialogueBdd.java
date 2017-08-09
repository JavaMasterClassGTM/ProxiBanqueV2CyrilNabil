package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe DAO de connexion � la base de donnees
 * @author Cy-Na
 */
public class DialogueBdd {
    
    public static String url = "jdbc:mysql://localhost/proxibanquev2.sql";
    public static String user = "root";
    public static String pwd = "";
    /**
     * M�thode permettant de se connecter � la base de donnees
     * @param url: Lien http de la base de donn�es
     * @param user: Nom utilisateur
     * @param pwd: Mot de passe
     * @return retourne l'objet Connection
     * @throws ClassNotFoundException 
     */
    public static Connection seConnecter(String url, String user, String pwd) throws ClassNotFoundException{
        Connection con = null;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBdd.class.getName()).log(Level.SEVERE, null, ex);
        }
            return con;
    }
    /**
     * M�thode pour se d�connecter de la base de donn�es
     * @param con : l'object "connexion" � fermer
     */
    
    public static void seDeconnecter(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
