/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImpl;

import Dao.MedecinSpecialistDAO;
import Database.Singleton;
import Model.SpeciaclistMedecin;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Implementation de l'interface MedecinSpecialistDAO pour l'accès aux données
 * des médecins spécialistes. Cette classe utilise des opérations CRUD (Create,
 * Read, Update, Delete) pour interagir avec la base de données.
 *
 * @author bulen
 */
public class MedecinSpecialistDaoImpl implements MedecinSpecialistDAO {

    private final Singleton instance = null;
    Connection conn;
    ResultSet rs;
    PreparedStatement ps;
    Statement stmt;

    /**
     *
     */
    public MedecinSpecialistDaoImpl() {
        // Obtenez une instance de la connexion à partir du Singleton

        this.conn = instance.getConnection();
    }

    /**
     *
     * @param ID_SPECIALISTE
     * @return
     * @throws SQLException
     */
    @Override
    public SpeciaclistMedecin get(int ID_SPECIALISTE) throws SQLException {
        SpeciaclistMedecin spm = null;
        String sql = "SELECT `ID_PERSONNE`, `ID_SPECIALISTE`, `NOM_PERSONNE`, `PRENOM_PERSONNE`, `SPECIALITE_SPECIALISTE` FROM `specialiste` WHERE ID_SPECIALISTE=?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, ID_SPECIALISTE);
        rs = ps.executeQuery();
        if (rs.next()) {

            String nom = rs.getString("NOM_PERSONNE");
            String prenom = rs.getString("PRENOM_PERSONNE");
            String specialite = rs.getString("SPECIALITE_SPECIALISTE");

            spm = new SpeciaclistMedecin(nom, prenom, specialite);
        }

        return spm;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<SpeciaclistMedecin> getAll() throws SQLException {
        SpeciaclistMedecin spm = null;
        List<SpeciaclistMedecin> specialistMedecins = new ArrayList<>();
        String sql = "SELECT `ID_PERSONNE`, `ID_SPECIALISTE`, `NOM_PERSONNE`, `PRENOM_PERSONNE`, `SPECIALITE_SPECIALISTE` FROM `specialiste`";

        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                
                String nom = rs.getString("NOM_PERSONNE");
                String prenom = rs.getString("PRENOM_PERSONNE");
                String specialite = rs.getString("SPECIALITE_SPECIALISTE");

               spm = new SpeciaclistMedecin(nom, prenom, specialite);
        }
                specialistMedecins.add( spm);
            }
        

        return specialistMedecins;
    }

    /**
     *
     * @param specialist
     * @return
     * @throws SQLException
     */
    @Override
    public int create(SpeciaclistMedecin specialist) throws SQLException {
        String sql = "INSERT INTO specialiste (NOM_PERSONNE, PRENOM_PERSONNE, SPECIALITE_SPECIALISTE) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, specialist.getNom());
            ps.setString(2, specialist.getPrenom());
            ps.setString(3, specialist.getSpecialite());
            // Ajoutez d'autres paramètres si nécessaire
            int result = ps.executeUpdate();

            return result;
        }
    }

    /**
     *
     * @param specialist
     * @return
     * @throws SQLException
     */
    @Override
    public int read(SpeciaclistMedecin specialist) throws SQLException {
        // Not sure what this method is supposed to do, please clarify
        return 0;
    }

    /**
     *
     * @param specialist
     * @return
     * @throws SQLException
     */
    @Override
    public int update(SpeciaclistMedecin specialist) throws SQLException {
        String sql = "UPDATE specialiste SET NOM_PERSONNE=?, PRENOM_PERSONNE=?, SPECIALITE_SPECIALISTE=? WHERE ID_SPECIALISTE=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, specialist.getNom());
            ps.setString(2, specialist.getPrenom());
            ps.setString(3, specialist.getSpecialite());

            return ps.executeUpdate();
        }
    }

    /**
     *
     * @param specialist
     * @return
     * @throws SQLException
     */
    @Override
    @SuppressWarnings("null")
    public int delete(SpeciaclistMedecin specialist) throws SQLException {
         SpeciaclistMedecin spm = null;
        String sql = "DELETE FROM specialiste WHERE ID_SPECIALISTE=?";
     ps = conn.prepareStatement(sql);
            ps.setInt(1, spm.getTelephone());
            return ps.executeUpdate();
        }
    }

