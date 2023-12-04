/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author bulen
 */
public class Ordonnance {
    private String id;
    private String NomClient;
    private Date date;
    private String NomMedecin;
    private String NomSpecialiste;
    private String NomMedicament;

    /**
     *
     * @param id
     * @param NomClient
     * @param date
     * @param NomMedecin
     * @param NomSpecialiste
     * @param NomMedicament
     */
    public Ordonnance(String id, String NomClient, Date date, String NomMedecin, String NomSpecialiste, String NomMedicament) {
        this.id = id;
        this.NomClient = NomClient;
        this.date = date;
        this.NomMedecin = NomMedecin;
        this.NomSpecialiste = NomSpecialiste;
        this.NomMedicament = NomMedicament;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNomClient() {
        return NomClient;
    }

    /**
     *
     * @param NomClient
     */
    public void setNomClient(String NomClient) {
        this.NomClient = NomClient;
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
     * @return
     */
    public String getNomMedecin() {
        return NomMedecin;
    }

    /**
     *
     * @param NomMedecin
     */
    public void setNomMedecin(String NomMedecin) {
        this.NomMedecin = NomMedecin;
    }

    /**
     *
     * @return
     */
    public String getNomSpecialiste() {
        return NomSpecialiste;
    }

    /**
     *
     * @param NomSpecialiste
     */
    public void setNomSpecialiste(String NomSpecialiste) {
        this.NomSpecialiste = NomSpecialiste;
    }

    /**
     *
     * @return
     */
    public String getNomMedicament() {
        return NomMedicament;
    }

    /**
     *
     * @param NomMedicament
     */
    public void setNomMedicament(String NomMedicament) {
        this.NomMedicament = NomMedicament;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Ordonnance{" + "id=" + id + ", NomClient=" + NomClient + ", date=" + date + ", NomMedecin=" + NomMedecin + ", NomSpecialiste=" + NomSpecialiste + ", NomMedicament=" + NomMedicament + '}';
    }

    void setDate(String date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
}
