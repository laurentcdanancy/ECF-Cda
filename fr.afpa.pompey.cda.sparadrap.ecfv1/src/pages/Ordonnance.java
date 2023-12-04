/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

/**
 *
 * @author bulen
 */
public class Ordonnance {

    private String Name;
    private String Prenom;
    private String Adresse;
    private int codePostale;
    private String ville;
    private int tel;
    private String email;
    private String dateConsultation;
    private String listeMedicament;

    /**
     *
     * @param Name
     * @param Prenom
     * @param Adresse
     * @param codePostale
     * @param ville
     * @param tel
     * @param email
     * @param dateConsultation
     * @param listeMedicament
     */
    public Ordonnance(String Name, String Prenom, String Adresse, int codePostale, String ville, int tel, String email, String dateConsultation, String listeMedicament) {
        this.Name = Name;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.codePostale = codePostale;
        this.ville = ville;
        this.tel = tel;
        this.email = email;
        this.dateConsultation = dateConsultation;
        this.listeMedicament = listeMedicament;
    }

    /**
     *
     * @param Name
     * @param tel
     * @param email
     * @param dateConsultation
     */
    public Ordonnance(String Name, int tel, String email, String dateConsultation) {
        this.Name = Name;
        this.tel = tel;
        this.email = email;
        this.dateConsultation = dateConsultation;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return Prenom;
    }

    /**
     *
     * @param Prenom
     */
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    /**
     *
     * @return
     */
    public String getAdresse() {
        return Adresse;
    }

    /**
     *
     * @param Adresse
     */
    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    /**
     *
     * @return
     */
    public int getCodePostale() {
        return codePostale;
    }

    /**
     *
     * @param codePostale
     */
    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
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
    public int getTel() {
        return tel;
    }

    /**
     *
     * @param tel
     */
    public void setTel(int tel) {
        this.tel = tel;
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
    public String getDateConsultation() {
        return dateConsultation;
    }

    /**
     *
     * @param dateConsultation
     */
    public void setDateConsultation(String dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    /**
     *
     * @return
     */
    public String getListeMedicament() {
        return listeMedicament;
    }

    /**
     *
     * @param listeMedicament
     */
    public void setListeMedicament(String listeMedicament) {
        this.listeMedicament = listeMedicament;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Ordonnance{" + "Name=" + Name + ", tel=" + tel + ", email=" + email + ", dateConsultation=" + dateConsultation + '}';
    }

}
