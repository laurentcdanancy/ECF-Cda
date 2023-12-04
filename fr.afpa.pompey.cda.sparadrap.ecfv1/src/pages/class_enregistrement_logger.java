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
public class class_enregistrement_logger {
 static final Logger logger = Logger.getLogger(class_enregistrement_logger.class.getName());

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        FileHandler fileHandler = null;
        try {
            // Créer un objet FileHandler pour écrire dans un fichier spécifique.
           
            fileHandler = new FileHandler("src\\pages\\log.txt");
            
            // Définir un formateur simple pour le FileHandler.
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            // Définir le niveau de journalisation pour le FileHandler.
            fileHandler.setLevel(Level.ALL);

            // Ajouter le FileHandler au logger.
            logger.addHandler(fileHandler);

            // Écrire des messages de journalisation.
            logger.log(Level.INFO, "Ceci est un message de journalisation.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileHandler != null) {
                fileHandler.close();
            }
        }
    }
}
