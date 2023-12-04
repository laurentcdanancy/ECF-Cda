/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

/**
 *
 * @author bulen
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe LoginFormLogger pour créer une fenêtre de formulaire de connexion.
 */
public class LoginFormLogger extends JFrame implements ActionListener {
    private final JTextField usernameField;
    private final JPasswordField passwordField;
    private final JButton loginButton;
    private static final Logger LOGGER = Logger.getLogger(LoginFormLogger.class.getName());

    /**
     * Constructeur de la classe LoginFormLogger.
     */
    public LoginFormLogger() {
        super("Login Form");

        // Créer le label et le champ pour le nom d'utilisateur
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        // Créer le label et le champ pour le mot de passe
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        // Créer le bouton de connexion
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        // Créer le panneau pour contenir les composants
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        // Ajouter le panneau à la fenêtre
        add(panel);

        // Définir la taille et afficher la fenêtre
        setSize(300, 150);
        setVisible(true);
    }

    /**
     * Méthode actionPerformed pour gérer l'événement de clic sur le bouton de connexion.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        try {
            // Valider le nom d'utilisateur et le mot de passe
            if (username == null) {
                throw new NullPointerException("Username cannot be null.");
            }

            if (username.isEmpty()) {
                throw new IllegalArgumentException("Username cannot be empty.");
            }

            if (username.isBlank()) {
                throw new IllegalArgumentException("Username cannot be blank.");
            }

            if (!isAlpha(username)) {
                throw new IllegalArgumentException("Username must be alphabetical.");
            }

            if (password == null) {
                throw new NullPointerException("Password cannot be null.");
            }

            if (password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be empty.");
            }

            if (password.isBlank()) {
                throw new IllegalArgumentException("Password cannot be blank.");
            }

            if (!isAlphanumeric(password)) {
                throw new IllegalArgumentException("Password must be alphanumeric.");
            }

            // Effectuer la connexion
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                LOGGER.log(Level.INFO, "Login successful for user: {0}", username);
            } else {
                throw new SecurityException("Invalid username or password.");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            LOGGER.warning(ex.getMessage());
        } catch (SecurityException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            LOGGER.warning(ex.getMessage());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            LOGGER.warning(ex.getMessage());
        }
    }

    /**
     * Méthode isAlpha pour valider si une chaîne est alphabétique.
     *
     * @param s La chaîne à valider.
     * @return true si la chaîne est alphabétique, sinon false.
     */
    private boolean isAlpha(String s) {
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    /**
     * Méthode isAlphanumeric pour valider si une chaîne est alphanumérique.
     *
     * @param s La chaîne à valider.
     * @return true si la chaîne est alphanumérique, sinon false.
     */
    private boolean isAlphanumeric(String s) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    /**
     * Méthode main pour lancer l'application.
     *
     * @param args Les arguments de la ligne de commande.
     */
    public static void main(String[] args) {
        LoginFormLogger form = new LoginFormLogger();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
