/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author stagiaire cda laurent
 */
public class Medicament {

    private int id;
    private String nom;
    private String grammage;
    private String modemploi;
    private int quantite;

    /**
     *
     * @param id
     * @param nom
     * @param quantite
     */
    public Medicament(int id, String nom, int quantite) {
        this.id = id;
        this.nom = nom;
        this.grammage = grammage;
        this.modemploi = modemploi;
        this.quantite = quantite;
        

        
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
    public String getGrammage() {
        return grammage;
    }

    /**
     *
     * @param grammage
     */
    public void setGrammage(String grammage) {
        this.grammage = grammage;
    }

    /**
     *
     * @return
     */
    public String getModemploi() {
        return modemploi;
    }

    /**
     *
     * @param modemploi
     */
    public void setModemploi(String modemploi) {
        this.modemploi = modemploi;
    }

    /**
     *
     * @return
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     *
     * @param quantite
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Medicament{" + "id=" + id + ", nom=" + nom + ", grammage=" + grammage + ", modemploi=" + modemploi + ", quantite=" + quantite + '}';
    }

}