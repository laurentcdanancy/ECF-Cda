/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Classe Singleton pour gérer une seule instance de la connexion à la base de données.
 * Les détails de connexion à la base de données sont chargés à partir d'un fichier de propriétés.
 * Cette classe garantit qu'une seule instance de la connexion est créée.
 * 
 * @author bulen
 */
public class Singleton {

    // Chemin vers le fichier de propriétés de configuration
    private static final String PATHCONF = "src\\ressources\\conf.properties";
    // Objet Properties pour stocker les propriétés de configuration
    private static final Properties props = new Properties();
    // Instance de connexion à la base de données
    private static Connection connection;

    // Bloc statique pour initialiser la connexion lorsque la classe est chargée
    static {
        try (FileInputStream fis = new FileInputStream(PATHCONF)) {
            // Charger les propriétés depuis le fichier de configuration
            props.load(fis);

            // Récupérer les détails de connexion depuis les propriétés
            String url = props.getProperty("jdbc.url");
            String user = props.getProperty("jdbc.username");
            String password = props.getProperty("jdbc.password");

            // Établir la connexion à la base de données
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            // Gérer les exceptions pendant l'initialisation
            System.out.println("Erreur : " + e);
            System.exit(0);
        }
    }

    /**
     *
     * @return
     */
    public static Singleton getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Constructeur privé pour empêcher une instanciation directe
    private Singleton() {
        // Empêcher une instanciation directe
    }

    /**
     * Obtient l'unique instance de la connexion à la base de données.
     * Si la connexion n'est pas encore établie, elle sera créée.
     * 
     * @return L'instance de la connexion à la base de données.
     */
    public static Connection getInstanceDB() {
        if (connection == null) {
            // Affiche un message indiquant l'établissement de la connexion (à des fins de test)
            System.out.println("RelationwithDB infos : Connexion établie " + connection + ": vérification du test");
        } else {
            // Affiche un message indiquant la connexion existante (à des fins de test)
            System.out.println("RelationWithDB infos : Connexion déjà existante " + connection + ": vérification du test");
        }
        return connection;
    }

    /**
     * Ferme l'instance de la connexion à la base de données.
     * 
     * @throws SQLException Si une erreur d'accès à la base de données se produit.
     */
    public static void closeInstanceDB() throws SQLException {
        try {
            // Ferme la connexion à la base de données
            getInstanceDB().close();
            // Affiche un message indiquant la fermeture de la connexion
            System.out.println("RelationwithDB infos : Connexion terminée");
        } catch (SQLException sqle) {
            // Gère les exceptions SQL lors de la fermeture de la connexion
            System.out.println("RelationwithDB erreur : "
                    + sqle.getMessage() + " [Code d'erreur SQL : " + sqle.getSQLState() + " ]");
        }
    }

    /**
     *
     * @return
     */
    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
