/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author bulen
 */
public class Mutuelle {
private int id;
    private String nom;
    private String adresse;
    private int codePostal;
    private String ville;
    private String telephone;
    private String email;
    private int Departement;
    private int tauxPriseEnCharge;
             
    /**
     *
     * @param id
     * @param nom
     * @param adresse
     * @param codePostal
     * @param ville
     */
    public Mutuelle(int id, String nom, String adresse, int codePostal, String ville) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.email = email;
        this.Departement = Departement;
        
    }
    
    /**
     *
     * @param id
     * @param nom
     * @param _rue_des_Lilas
     * @param tauxPriseCharge
     * @param paris
     * @param string
     */
    public Mutuelle(int id, String nom, String _rue_des_Lilas, int tauxPriseCharge, String paris, String string) {
        this.id = id;
        this.nom = nom;
        this.tauxPriseEnCharge=tauxPriseCharge;
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
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     *
     * @return
     */
    public int getCodePostal() {
        return codePostal;
    }

    /**
     *
     * @param codePostal
     */
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    /**
     *
     * @return
     */
    public String getVille() {
        return ville;
    }

    /**
     *
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     *
     * @return
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     *
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public int getDepartement() {
        return Departement;
    }

    /**
     *
     * @param Departement
     */
    public void setDepartement(int Departement) {
        this.Departement = Departement;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Mutuelle{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", telephone=" + telephone + ", email=" + email + ", Departement=" + Departement + '}';
    }

   

}
