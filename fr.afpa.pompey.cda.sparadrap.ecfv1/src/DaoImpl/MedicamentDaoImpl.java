/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImpl;

import Dao.MedicamentDAO;
import Database.Singleton;
import Model.Medicament;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bulen
 */
public class MedicamentDaoImpl implements MedicamentDAO {

    private Singleton instance;
    Connection conn;
    ResultSet rs;
    PreparedStatement ps;
    Statement stmt;

    /**
     *
     * @throws SQLException
     */
    public MedicamentDaoImpl() throws SQLException {
        this.instance = Singleton.getInstance();
    }

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Medicament get(int id) throws SQLException {
        Medicament medicament = null;
        conn = instance.getConnection();
        String sql = "SELECT ID_MEDICAMENT, NOM_MEDICAMENT2, CATEGORIE_MEDICAMENT, PRIX_MEDICAMENT, DATE_DE_MISE_EN_SERVICE_MEDICAMENT, QUANTITE_MEDICAMENT FROM medicament WHERE ID_MEDICAMENT = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        rs = ps.executeQuery();

        if (rs.next()) {
            int oid = rs.getInt("ID_MEDICAMENT");
            String nom = rs.getString("NOM_MEDICAMENT2");
            int quantite = rs.getInt("QUANTITE_MEDICAMENT");

            medicament = new Medicament(oid, nom, quantite);
        }

        return medicament;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Medicament> getAll() throws SQLException {
        conn = instance.getConnection();
        String sql = "SELECT ID_MEDICAMENT, NOM_MEDICAMENT2, CATEGORIE_MEDICAMENT, PRIX_MEDICAMENT, DATE_DE_MISE_EN_SERVICE_MEDICAMENT, QUANTITE_MEDICAMENT FROM medicament";
        List<Medicament> medicaments = new ArrayList<>();

        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int medicamentId = rs.getInt("ID_MEDICAMENT");
            String nom = rs.getString("NOM_MEDICAMENT2");
            int quantite = rs.getInt("QUANTITE_MEDICAMENT");

            Medicament medicament = new Medicament(medicamentId, nom, quantite);
            medicaments.add(medicament);
        }

        return medicaments;
    }

    /**
     *
     * @param medicament
     * @return
     * @throws SQLException
     */
    @Override
    public int create(Medicament medicament) throws SQLException {
        conn = instance.getConnection();
        String sql = "INSERT INTO medicament (NOM_MEDICAMENT2, CATEGORIE_MEDICAMENT, PRIX_MEDICAMENT, DATE_DE_MISE_EN_SERVICE_MEDICAMENT, QUANTITE_MEDICAMENT) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, medicament.getNom());
            ps.setString(2, medicament.getGrammage());
            ps.setDouble(3, medicament.getQuantite());

            int result = ps.executeUpdate();

            return result;
        }
    }

    /**
     *
     * @param medicament
     * @return
     * @throws SQLException
     */
    @Override
    public int update(Medicament medicament) throws SQLException {
        conn = instance.getConnection();
        String sql = "UPDATE medicament SET NOM_MEDICAMENT2 = ?, CATEGORIE_MEDICAMENT = ?, PRIX_MEDICAMENT = ?, DATE_DE_MISE_EN_SERVICE_MEDICAMENT = ?, QUANTITE_MEDICAMENT = ? WHERE ID_MEDICAMENT = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, medicament.getNom());
        ps.setInt(4, medicament.getQuantite());
        ps.setInt(5, medicament.getId());

        int result = ps.executeUpdate();
        ps.close();
        conn.close();
        return result;
    }

    /**
     *
     * @param medicament
     * @return
     * @throws SQLException
     */
    @Override
    public int delete(Medicament medicament) throws SQLException {
        conn = instance.getConnection();
        String sql = "DELETE FROM medicament WHERE ID_MEDICAMENT = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, medicament.getId());
            return ps.executeUpdate();
        }
    }

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    @Override
    public int read(Medicament t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
