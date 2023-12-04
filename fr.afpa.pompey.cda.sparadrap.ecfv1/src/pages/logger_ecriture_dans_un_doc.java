/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bulen
 */
public final class logger_ecriture_dans_un_doc {
    private static final String URL = "jdbc:mysql://localhost:3306/loginsystem";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static Connection connection;

    private logger_ecriture_dans_un_doc() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return
     */
    public static Connection getInstance() {
        if (connection == null) {
            new logger_ecriture_dans_un_doc();
            System.out.println("Connection established.");
        } else {
            System.out.println("Connection already exists.");
        }
        return connection;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Connection conn = logger_ecriture_dans_un_doc.getInstance();
        PreparedStatement pstmt;
        ResultSet rs;

        try {
            pstmt = conn.prepareStatement("SELECT * FROM usertable");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                System.out.println("Username: " + username + ", Password: " + password);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}