/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bulen
 */
public class MedecinIT {

    public MedecinIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String newPrenom = "Pierre";
        Medecin instance = new Medecin("Jean", "Dupont", "12 rue des Lilas", 75000, "Paris", 123456789, "jeandupont@email.com");
        instance.setPrenom(newPrenom);
        assertEquals(newPrenom, instance.getPrenom());
    }

    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String newNom = "Martin";
        Medecin instance = new Medecin("Jean", "Dupont", "12 rue des Lilas", 75000, "Paris", 123456789, "jeandupont@email.com");
        instance.setNom(newNom);
        assertEquals(newNom, instance.getNom());
    }

    @Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        String newAdresse = "21 rue de la Paix";
        Medecin instance = new Medecin("Jean", "Dupont", "12 rue des Lilas", 75000, "Paris", 123456789, "jeandupont@email.com");
        instance.setAdresse(newAdresse);
        assertEquals(newAdresse, instance.getAdresse());
    }

    @Test
    public void testSetCodePostal() {
        System.out.println("setCodePostal");
        int newCodePostal = 75001;
        Medecin instance = new Medecin("Jean", "Dupont", "12 rue des Lilas", 75000, "Paris", 123456789, "jeandupont@email.com");
        instance.setCodePostal(newCodePostal);
        assertEquals(newCodePostal, instance.getCodePostal());

    }
}
