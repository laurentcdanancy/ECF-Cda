/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

/**
 *
 * @author bulen
 */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author bulen
 */
public class logger_test_teminal {

    static final Logger logger = Logger.getLogger(class_enregistrement_logger.class.getName());

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        FileHandler fileHandler = null;
        try {
            // Créer un objet FileHandler pour écrire dans un fichier spécifique.
            fileHandler = new FileHandler("src\\ressources\\log.txt", true);

            // Définir un formateur simple pour le FileHandler.
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            // Définir le niveau de journalisation pour le FileHandler.
            fileHandler.setLevel(Level.ALL);

            // Ajouter le FileHandler au logger.
            logger.addHandler(fileHandler);

            // Écrire des messages de journalisation.
            logger.log(Level.INFO, "===============nouveau Log et niveau de log==================.");

            logger.log(Level.INFO, "Ceci est un un log fr niveau informztif.");
            logger.log(Level.WARNING, "Ceci est un un log fr niveau AVERTISSEMNT.");
            logger.log(Level.SEVERE, "Ceci est un un log fr niveau HAUTE CRITIQUE.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileHandler != null) {
                fileHandler.close();
            }
        }

    }
}
