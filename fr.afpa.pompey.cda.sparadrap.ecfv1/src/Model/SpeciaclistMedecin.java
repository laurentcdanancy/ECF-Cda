/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author bulen
 */
public class SpeciaclistMedecin extends Personne {
    private String specialite;

    /**
     *
     * @param specialite
     * @param nom
     * @param prenom
     * @param adresse
     * @param codePostal
     * @param ville
     * @param telephone
     * @param email
     */
    public SpeciaclistMedecin(String specialite, String nom, String prenom, String adresse, int codePostal, String ville, int telephone, String email) {
        super(nom, prenom, adresse, codePostal, ville, telephone, email);
        this.specialite = specialite;
    }

  // Nouveau constructeur avec les paramètres 'nom', 'prenom', 'specialite'

    /**
     *
     * @param nom
     * @param prenom
     * @param specialite
     */
    public SpeciaclistMedecin(String nom, String prenom, String specialite) {
        super(nom, prenom, "", 0, "", 0, ""); // Valeurs par défaut pour les autres champs
        this.specialite = specialite;
    }

    /**
     *
     * @return
     */
    public String getSpecialite() {
        return specialite;
    }

    /**
     *
     * @param specialite
     */
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
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
        return "SpeciaclistMedecin{" + "specialite=" + specialite + '}';
    }
    
}
