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
public class MutuelleIT {

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

  
    public void testGetNom() {

        System.out.println("getNom");
        Mutuelle instance = new Mutuelle(1, "LMDE", "12 rue des Lilas", 75000, "Paris", "0123456789");
        String expResult = "LMDE";
        String result = instance.getNom();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNom method, of class Mutuelle.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Mutuelle instance = new Mutuelle(1, "LMDE", "12 rue des Lilas", 75000, "Paris", "0123456789");
        instance.setNom(nom);

    }

    /**
     * Test of setAdresse method, of class Mutuelle.
     */
    @Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        String adresse = "12 rue des Lilas";
        Mutuelle instance = new Mutuelle(1, "LMDE", "12 rue des Lilas", 75000, "Paris", "0123456789");
        instance.setAdresse(adresse);

    }

 

    /**
     * Test of setCodePostal method, of class Mutuelle.
     */
    @Test
    public void testSetCodePostal() {
        System.out.println("setCodePostal");
        int codePostal = 75000;
        Mutuelle instance = new Mutuelle(1, "LMDE", "12 rue des Lilas", 75000, "Paris", "0123456789");
        instance.setCodePostal(codePostal);

    }

    @Test
    public void testSetVille() {
        System.out.println("setVille");
        String ville = "";
        Mutuelle instance = new Mutuelle(1, "LMDE", "12 rue des Lilas", 75000, "Paris", "0123456789");
        instance.setVille(ville);

    }

    /**
     * Test of getTelephone method, of class Mutuelle.
     */
  

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Mutuelle instance = new Mutuelle(1, "LMDE", "12 rue des Lilas", 75000, "Paris", "0123456789");
        instance.setEmail(email);

    }

    /**
     * Test of setDepartement method, of class Mutuelle.
     */
    @Test
    public void testSetDepartement() {
        System.out.println("setDepartement");
        int Departement = 0;
        Mutuelle instance = new Mutuelle(1, "LMDE", "12 rue des Lilas", 75000, "Paris", "0123456789");
        instance.setDepartement(Departement);

    }

}
