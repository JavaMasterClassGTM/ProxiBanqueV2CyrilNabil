package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe DAO de connexion à la base de donnees
 * @author Cy-Na
 */
public class DialogueBdd {
    
    public static String url = "jdbc:mysql://localhost/proxibanquev2.sql";
    public static String user = "root";
    public static String pwd = "";
    /**
     * Méthode permettant de se connecter à la base de donnees
     * @param url: Lien http de la base de données
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
     * Méthode pour se déconnecter de la base de données
     * @param con : l'object "connexion" à fermer
     */
    
    public static void seDeconnecter(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
