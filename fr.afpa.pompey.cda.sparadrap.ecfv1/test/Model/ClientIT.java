/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.util.Date;
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
public class ClientIT {

    public ClientIT() {
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

    /**
     * Test of getId method, of class Client.
     */
    /**
     * Test of setId method, of class Client.
     */
 

    @Test
    public void testSetNom() {
        Client client = new Client("NomInitial", "Prenom", "Adresse", 12345, "Ville", 123456789, "test@example.com");
        client.setNom("NouveauNom");
        assertEquals("NouveauNom", client.getNom());
    }

    @Test
    public void testSetPrenom() {
        Client client = new Client("Nom", "PrenomInitial", "Adresse", 12345, "Ville", 123456789, "test@example.com");
        client.setPrenom("NouveauPrenom");
        assertEquals("NouveauPrenom", client.getPrenom());
    }

  

    @Test
    public void testSetCodePostal() {
        Client client = new Client("Nom", "Prenom", "Adresse", 12345, "Ville", 123456789, "test@example.com");
        client.setCodePostal(54321);
        assertEquals(54321, client.getCodePostal());
    }

    @Test
    public void testSetVille() {
        Client client = new Client("Nom", "Prenom", "Adresse", 12345, "VilleInitiale", 123456789, "test@example.com");
        client.setVille("NouvelleVille");
        assertEquals("NouvelleVille", client.getVille());
    }

    @Test
    public void testSetTelephone() {
        Client client = new Client("Nom", "Prenom", "Adresse", 12345, "Ville", 123456789, "test@example.com");
        client.setTelephone(987654321);
        assertEquals(987654321, client.getTelephone());
    }

    @Test
    public void testSetEmail() {
        Client client = new Client("Nom", "Prenom", "Adresse", 12345, "Ville", 123456789, "test@example.com");
        client.setEmail("nouveau@test.com");
        assertEquals("nouveau@test.com", client.getEmail());
    }

    @Test
    public void testSetMutuelle() {
        Client client = new Client("Nom", "Prenom", "Adresse", 12345, "Ville", 123456789, "test@example.com");
        client.setMutuelle("NouvelleMutuelle");
        assertEquals("NouvelleMutuelle", client.getMutuelle());
    }


    // Vous pouvez ajouter d'autres tests selon les validations spécifiques que vous avez dans vos setters.
}



