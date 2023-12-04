/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

import java.util.Date;

/**
 *
 * @author afpa stagiaire laurent
 */
public class Medicament {
   private String name;
   private Date dateMiseService;
   private String categorie;
   private int quantite;
   private long prix ;

    /**
     *
     * @param name
     * @param categorie
     * @param quantite
     * @param prix
     */
    public Medicament(String name, String categorie, int quantite, double prix) {
        this.name = name;
        this.categorie = categorie;
        this.quantite = quantite;
        this.prix = (long) prix;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public Date getDateMiseService() {
        return dateMiseService;
    }

    /**
     *
     * @param dateMiseService
     */
    public void setDateMiseService(Date dateMiseService) {
        this.dateMiseService = dateMiseService;
    }

    /**
     *
     * @return
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     *
     * @param categorie
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
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
    public double getPrix() {
        return prix;
    }

    /**
     *
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = (long)  prix;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Medicament{" + "name=" + name + ", dateMiseService=" + dateMiseService + ", categorie=" + categorie + ", quantite=" + quantite + ", prix=" + prix + '}';
    }

}