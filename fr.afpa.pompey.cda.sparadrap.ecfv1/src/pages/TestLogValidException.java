/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;
import java.util.logging.LogManager;
import java.util.logging.Filter;

// Classe TestLogValidException qui représente un utilisateur avec un nom d'utilisateur et un mot de passe

/**
 *
 * @author bulen
 */
public class TestLogValidException {

    // Logger pour enregistrer les messages
    private static final Logger LOGGER = Logger.getLogger(TestLogValidException.class.getName());

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
    public TestLogValidException(String username, String password) throws Exception {
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
    public final void setUsername(String username) throws Exception {
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
        // Vérifier que le nom d'utilisateur est alphabétique
        if (!Pattern.matches("[a-zA-Z]+", username)) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Username is not alphabetic");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le nom d'utilisateur doit être alphabétique");
            // Lancer une exception avec un message explicite
            throw new Exception("Username must be alphabetic");
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
    public final void setPassword(String password) throws Exception {
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
        // Vérifier que le mot de passe est alphanumérique
        if (!Pattern.matches("[a-zA-Z0-9]+", password)) {
            // Enregistrer un message de niveau warning pour signaler le problème
            LOGGER.warning("Password is not alphanumeric");
            // Afficher un message d'erreur à l'utilisateur pour qu'il puisse rectifier
            System.out.println("Le mot de passe doit être alphanumérique");
            // Lancer une exception avec un message explicite
            throw new Exception("Password must be alphanumeric");
        }
        // Affecter l'attribut avec le paramètre
        this.password = password;
    }

    // Méthode qui affiche le nom d'utilisateur et le mot de passe

    /**
     *
     */
    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    // Méthode principale qui demande à l'utilisateur de saisir son nom d'utilisateur et son mot de passe
    /**
     *
     * @throws java.io.IOException
     */
    public class LoggingExample {

    static Logger logger = Logger.getLogger(LoggingExample.class.getName());

    

        // Close the file handler
       // fileHandler.close();
    
}
}

             
                
                
                
