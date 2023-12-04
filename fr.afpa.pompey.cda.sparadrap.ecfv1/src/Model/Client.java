/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.Date;
import java.util.regex.Pattern;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import pages.Logger_Test_SurClass;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;
import pages.TestLogValidException.LoggingExample;

/**
 *
 * @author bulen
 */
public class Client extends Personne{
   private int id; 
   private double numSecuriteSocial;
   private Date date;
   private String mutuelle;
   private static final Logger LOGGER = Logger.getLogger(Logger_Test_SurClass.class.getName());

    /**
     *
     * @param nom
     * @param prenom
     * @param adresse
     * @param codePostal
     * @param ville
     * @param telephone
     * @param email
     */
    public Client(String nom, String prenom, String adresse, int codePostal, String ville, int telephone, String email) {
        super(nom, prenom, adresse, codePostal, ville, telephone, email);
    }
    
    /**
     *
     * @param nom
     * @param lastname
     * @param firstname1
     * @param mutuelle1
     * @param numSecuriteSocial1
     */
    public Client(String nom, String lastname, String firstname1, String mutuelle1, double numSecuriteSocial1) {
        super(nom, "", "", 0, "", 0, ""); // Vous devrez peut-être ajuster les valeurs par défaut pour les autres champs
        this.mutuelle = ""; // Vous pouvez ajuster la valeur par défaut pour 'mutuelle'
    }
// Le constructeur avec deux paramètres 'nom' et 'prenom'

    /**
     *
     * @param nom
     * @param prenom
     */
    public Client(String nom, String prenom) {
        super(nom, prenom, "", 0, "", 0, ""); // Vous devrez peut-être ajuster les valeurs par défaut pour les autres champs
        this.mutuelle = ""; // Vous pouvez ajuster la valeur par défaut pour 'mutuelle'
    }

    /**
     *
     * @param nom
     * @param prenom
     * @param mutuelle
     * @param numSecuriteSocial
     */
    public Client(String nom, String prenom, String mutuelle,double numSecuriteSocial) {
        super(nom, prenom,"" , 0, "", 0, ""); // Vous devrez peut-être ajuster les valeurs par défaut pour les autres champs
        this.mutuelle = mutuelle; // Vous pouvez ajuster la valeur par défaut pour 'mutuelle'
        this.numSecuriteSocial=numSecuriteSocial;
    }
 // Le constructeur avec quatre paramètres 'nom', 'prenom', 'adresse' et 'ville'
   
    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public double getNumSecuriteSocial() {
        return numSecuriteSocial;
    }

    /**
     *
     * @param numSecuriteSocial
     */
    public void setNumSecuriteSocial(double numSecuriteSocial) {
        this.numSecuriteSocial = numSecuriteSocial;
    }

    /**
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public String getMutuelle() {
        return mutuelle;
    }

    /**
     *
     * @param mutuelle
     */
    public void setMutuelle(String mutuelle) {
        this.mutuelle = mutuelle;
    }

    /**
     *
     * @return
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    @Override
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        // Exemple de validation : Adresse ne doit pas être null ou vide
        if (adresse == null || adresse.isEmpty()) {
            LOGGER.log(Level.INFO, "Adresse ne peut pas être null ou vide");
            // throw new IllegalArgumentException("Adresse ne peut pas être null ou vide");
            return;
        }}

    /**
     *
     * @return
     */
    @Override
    public int getCodePostal() {
        return codePostal;
    }

    /**
     *
     * @param codePostal
     */
    @Override
    public void setCodePostal(int codePostal) {
      if (codePostal <= 0 || codePostal > 99999) {
            LOGGER.log(Level.INFO, "Le code postal doit être un nombre positif à 5 chiffres");
            // Vous pouvez lever une exception ici si vous le souhaitez
            // throw new IllegalArgumentException("Le code postal doit être un nombre positif à 5 chiffres");
            return; // Ou le traiter de n'importe quelle manière qui a du sens pour votre application
        }
      

        this.codePostal = codePostal;
    }

    /**
     *
     * @return
     */
    @Override
    public String getVille() {
        return ville;
    }

    /**
     *
     * @param ville
     */
    @Override
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     *
     * @return
     */
    @Override
    public int getTelephone() {
        return telephone;
    }

    /**
     *
     * @param telephone
     */
    @Override
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     *
     * @return
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

 


    
}
