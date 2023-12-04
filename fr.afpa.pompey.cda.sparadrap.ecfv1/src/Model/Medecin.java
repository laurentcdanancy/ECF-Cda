/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author stagiaire cda laurent
 */
public class Medecin extends Personne {

    private String numeroAgrement;

    /**
     *
     */
    public int id;

    /**
     *
     * @param numeroAgrement
     * @param id
     * @param nom
     * @param prenom
     * @param adresse
     * @param codePostal
     * @param ville
     * @param telephone
     * @param email
     */
    public Medecin(String numeroAgrement, int id, String nom, String prenom, String adresse, int codePostal, String ville, int telephone, String email) {
        super(nom, prenom, adresse, codePostal, ville, telephone, email);
        this.numeroAgrement = numeroAgrement;
        this.id = id;
    }

    /**
     *
     * @param nom
     */
    public Medecin(String nom) {
        super(nom, "", "", 0, "", 0, ""); // Valeurs par défaut pour les autres champs
        this.numeroAgrement = "";
        this.id = 0;
    }

    /**
     *
     * @param nom
     * @param prenom
     * @param numeroAgrement
     * @param id
     * @param paris
     * @param par1
     * @param jeandupontemailcom
     */
    public Medecin(String nom, String prenom, String numeroAgrement, int id, String paris, int par1, String jeandupontemailcom) {
        super(nom, prenom, "", 0, "", 0, ""); // Valeurs par défaut pour les autres champs
        this.numeroAgrement = numeroAgrement;
        this.id = id;
    }
    
    /**
     *
     * @return
     */
    public String getNumeroAgrement() {
        return numeroAgrement;
    }

    /**
     *
     * @param numeroAgrement
     */
    public void setNumeroAgrement(String numeroAgrement) {
        this.numeroAgrement = numeroAgrement;
    }

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
    @Override
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

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

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Medecin{" + "numeroAgrement=" + numeroAgrement + ", id=" + id + '}';
    }

  



   

 
}
