/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.regex.Pattern;

/**
 *
 * @author bulen
 */
class Personne {

    /**
     * declaration des attributs
     * Représente une personne.
     * Une personne est caractérisée par son nom, son prénom, son adresse, son code postal, sa ville, son numéro de téléphone et son adresse e-mail.
     * Le nom de la personne.
     */
    String nom;
    String prenom;
    String adresse;
    int codePostal;
    String ville;
    int telephone;
    String email;

    public Personne(String nom, String prenom, String adresse, int codePostal, String ville, int telephone,
            String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        // Vérifie que le nom n'est pas nulle.
        if (nom == null) {
            throw new IllegalArgumentException("Le nom ne peut pas être null");
        }

        // Vérifie que le nom n'est pas vide.
        if (nom.isBlank()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide");
        }

        // Vérifie que le nom contient au moins 3 caractères.
        if (nom.length() < 3) {
            throw new IllegalArgumentException("Le nom doit contenir au moins 3 caractères");
        }

        // Vérifie que le nom ne contient pas de caractères spéciaux.
        if (!nom.matches("[\\p{L}\\s]+")) {
            throw new IllegalArgumentException("Le nom ne peut pas contenir de caractères spéciaux");
        }

        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        // Vérifie que le nom n'est pas nulle.
        if (prenom == null) {
            throw new IllegalArgumentException("Le prenom ne peut pas être null");
        }

        // Vérifie que le nom n'est pas vide.
        if (prenom.isBlank()) {
            throw new IllegalArgumentException("Le prenom ne peut pas être vide");
        }

        // Vérifie que le nom contient au moins 3 caractères.
        if (prenom.length() < 3) {
            throw new IllegalArgumentException("Le prenom doit contenir au moins 3 caractères");
        }

        // Vérifie que le nom ne contient pas de caractères spéciaux.
        if (!prenom.matches("[\\p{L}\\s]+")) {
            throw new IllegalArgumentException("Le prenom ne peut pas contenir de caractères spéciaux");
        }

        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        // Vérifie que l'adresse n'est pas nulle.
        if (adresse == null) {
            throw new IllegalArgumentException("L'adresse ne peut pas être null");
        }

        // Vérifie que l'adresse n'est pas vide.
        if (adresse.isBlank()) {
            throw new IllegalArgumentException("L'adresse ne peut pas être vide");
        }

        // Vérifie que l'adresse contient au moins 5 caractères.
        if (adresse.length() < 5) {
            throw new IllegalArgumentException("L'adresse doit contenir au moins 5 caractères");
        }

        // Vérifie que l'adresse ne contient pas de caractères spéciaux.
        if (!adresse.matches("[\\p{L}0-9\\s]+")) {
            throw new IllegalArgumentException("L'adresse ne peut pas contenir de caractères spéciaux");
        }

        // Affecte l'adresse à l'instance.
        this.adresse = adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {

        // Vérifie que le code postal ne contient pas de caractères spéciaux.
       
        // Vérifie que le code postal n'est pas null.

        // Affecte le code postal à l'instance.
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {

        // Vérifie que la ville n'est pas nulle.
        if (ville == null) {
            throw new IllegalArgumentException("La ville ne peut pas être null");
        }

        // Vérifie que la ville n'est pas vide.
        if (ville.isBlank()) {
            throw new IllegalArgumentException("La ville ne peut pas être vide");
        }

        // Vérifie que la ville contient au moins 3 caractères.
        if (ville.length() < 3) {
            throw new IllegalArgumentException("La ville doit contenir au moins 3 caractères");
        }

        // Vérifie que la ville ne contient pas de caractères spéciaux.
        if (!ville.matches("[\\p{L}\\s]+")) {
            throw new IllegalArgumentException("La ville ne peut pas contenir de caractères spéciaux");
        }

        // Affecte la ville à l'instance.
        this.ville = ville;

    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        String regex = "^(\\+33|0)?[1-9]\\d{8}$"; // le motif regex correct

        // Vérifie si le numéro de téléphone correspond à l'expression régulière.
       

        // Affecte le numéro de téléphone à l'instance.
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        // Vérifie que l'adresse e-mail n'est pas nulle ou vide.
        if (email == null || email.isBlank() || email.isEmpty()) {
            throw new IllegalArgumentException("L'adresse e-mail ne peut pas être nulle ou vide");
        }

        // Vérifie que l'adresse e-mail est valide.
        if (!email.matches("[\\p{L}0-9\\._%+-]+@[\\p{L}0-9\\.-]+\\.[a-z]{2,6}")) {
            throw new IllegalArgumentException("L'adresse e-mail doit être valide");
        }

        // Affecte l'adresse e-mail à l'instance.
        this.email = email;

    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal
                + ", ville=" + ville + ", telephone=" + telephone + ", email=" + email + '}';
    }

}
