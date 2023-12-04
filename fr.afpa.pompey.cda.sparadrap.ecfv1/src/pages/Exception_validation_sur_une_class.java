/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

/**
 *
 * @author bulen
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

// Classe Logger_Test_SurClass qui représente un utilisateur avec un nom d'utilisateur et un mot de passe

/**
 *
 * @author bulen
 */
public final class Exception_validation_sur_une_class {

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
    public Exception_validation_sur_une_class(String username, String password) throws Exception {
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
        if (username.isEmpty() ) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Username is empty ");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le nom d'utilisateur ne peut pas être vide ");
            // Lancer une exception avec un message explicite
            throw new Exception("Username cannot be empty k");
        }
         if ( username.isBlank()) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Username is  blank");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le nom d'utilisateur ne peut pas être blank (d espace vide)");
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
        
         if (username.length() > 10) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Username is too short");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le nom d'utilisateur doit avoir au moins 3 caractères");
            // Lancer une exception avec un message explicite
            throw new Exception("Username cant  have at more than  10 characters");
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

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String username;
        String password;
        // Demander à l'utilisateur de saisir son nom d'utilisateur
        try ( // Créer un scanner pour lire l'entrée de l'utilisateur
                Scanner scanner = new Scanner(System.in)) {
            // Demander à l'utilisateur de saisir son nom d'utilisateur
            System.out.print("Enter your username: ");
            // Lire le nom d'utilisateur
            username = scanner.nextLine();
            // Demander à l'utilisateur de saisir son mot de passe
            System.out.print("Enter your password: ");
            // Lire le mot de passe
            password = scanner.nextLine();
            // Fermer le scanner
        }
        // Tenter de créer un objet Logger_Test_SurClass avec le nom d'utilisateur et le mot de passe saisis
        try {
            Exception_validation_sur_une_class user = new Exception_validation_sur_une_class(username, password);
            // Afficher les informations de l'utilisateur
            user.display();
        } catch (Exception e) {
            // Enregistrer un message de niveau severe pour signaler l'erreur
            LOGGER.log(Level.SEVERE, "An error occurred while creating the user", e);
            // Afficher un message d'erreur à l'utilisateur
            System.out.println("Invalid username or password");
        }
    }
}