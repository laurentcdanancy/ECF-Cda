/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

/**
 *
 * @author bulen
 */
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;
import pages.TestLogValidException.LoggingExample;

// Classe Logger_Test_SurClass qui représente un utilisateur avec un nom d'utilisateur et un mot de passe
/**
 *
 * @author bulen
 */
public final class Logger_Test_SurClass {

    // Logger pour enregistrer les messages
    private static final Logger LOGGER = Logger.getLogger(Logger_Test_SurClass.class.getName());

    // Attributs privés de la classe
    private String username;
    private String password;

    // Constructeur de la classe qui prend en paramètre un nom d'utilisateur et un mot de passe

    /**
     *
     * @param username
     * @param password
     * @throws Exception
     */
    public Logger_Test_SurClass(String username, String password) throws Exception {
        // Appeler les setters pour affecter les attributs
        setUsername(username);
        setPassword(password);
        // Enregistrer un message de niveau info pour indiquer la création de l'utilisateur
        LOGGER.log(Level.INFO, "User created with username: {0}", username);
    }

    // Méthode qui retourne le nom d'utilisateur

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    // Méthode qui modifie le nom d'utilisateur

    /**
     *
     * @param username
     * @throws Exception
     */
    public void setUsername(String username) throws Exception {
        // Vérifier que le nom d'utilisateur n'est pas null
        if (username == null) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Username is null");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le nom d'utilisateur ne peut pas être null");
            // Lancer une exception avec un message explicite
            throw new Exception("Username cannot be null");
        }
        // Vérifier que le nom d'utilisateur n'est pas vide ou ne contient que des espaces blancs
        if (username.isEmpty() || username.isBlank()) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Username is empty or blank");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le nom d'utilisateur ne peut pas être vide ou ne pas contenir d'espaces");
            // Lancer une exception avec un message explicite
            throw new Exception("Username cannot be empty or blank");
        }
        // Vérifier que le nom d'utilisateur a au moins 3 caractères
        if (username.length() < 3) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Username is too short");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le nom d'utilisateur doit avoir au moins 3 caractères");
            // Lancer une exception avec un message explicite
            throw new Exception("Username must have at least 3 characters");
        }
        // Affecter l'attribut avec le paramètre
        this.username = username;
    }

    // Méthode qui retourne le mot de passe

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    // Méthode qui modifie le mot de passe

    /**
     *
     * @param password
     * @throws Exception
     */
    public void setPassword(String password) throws Exception {
        // Vérifier que le mot de passe n'est pas null
        if (password == null) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Password is null");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le mot de passe ne peut pas être null");
            // Lancer une exception avec un message explicite
            throw new Exception("Password cannot be null");
        }
        // Vérifier que le mot de passe n'est pas vide ou ne contient que des espaces blancs
        if (password.isEmpty() || password.isBlank()) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Password is empty or blank");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le mot de passe ne peut pas être vide ou ne pas contenir d'espaces");
            // Lancer une exception avec un message explicite
            throw new Exception("Password cannot be empty or blank");
        }
        // Vérifier que le mot de passe a au moins 8 caractères
        if (password.length() < 8) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Password is too short");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le mot de passe doit avoir au moins 8 caractères");
            // Lancer une exception avec un message explicite
            throw new Exception("Password must have at least 8 characters");
        }
        // Affecter l'attribut avec le paramètre
        this.password = password;
    }

    // Méthode qui affiche le nom d'utilisateur et le mot de passe

    /**
     *
     */
    public void display() {
        System.out.println("j essaie de coprendre Username: " + username);
        System.out.println("j essaoe de comprendre Password: " + password);
    }
// Méthode principale qui demande à l'utilisateur de saisir son nom d'utilisateur et son mot de passe

    static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        FileHandler fileHandler = null;
        try {
            // Créer un objet FileHandler pour écrire dans un fichier spécifique.
            fileHandler = new FileHandler("log.txt");

            // Définir un formateur simple pour le FileHandler.
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            // Définir le niveau de journalisation pour le FileHandler.
            fileHandler.setLevel(Level.ALL);

            // Ajouter le FileHandler au logger.
            logger.addHandler(fileHandler);

            // Écrire des messages de journalisation.
            logger.log(Level.INFO, "Ceci est un message de journalisation.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileHandler != null) {
                fileHandler.close();
            }
        }
    }
}
