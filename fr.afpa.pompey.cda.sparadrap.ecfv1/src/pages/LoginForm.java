/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bulen
 */
public class LoginForm extends JFrame implements ActionListener {
    private final JTextField usernameField;
    private final JPasswordField passwordField;
    private final JButton loginButton;

    /**
     *
     */
    public LoginForm() {
        super("Login Form");

        // Create the username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        // Create the password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        // Create the login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        // Create the panel to hold the components
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        // Add the panel to the frame
        add(panel);

        // Set the size and show the frame
        setSize(300, 150);
        setVisible(true);
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        try {
            // Validate the username and password
            if (username == null) {
                throw new IllegalArgumentException("Username cannot be null.");
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
                throw new IllegalArgumentException("Password cannot be null.");
            }

            if (password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be empty.");
            }

            if (!isAlphanumeric(password)) {
                throw new IllegalArgumentException("Password must be alphanumeric.");
            }

            // Perform the login
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                throw new SecurityException("Invalid username or password.");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SecurityException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isAlpha(String s) {
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    private boolean isAlphanumeric(String s) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        LoginForm form = new LoginForm();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}