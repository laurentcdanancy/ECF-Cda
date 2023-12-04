/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImpl;

import Dao.MutuelleDAO;
import Database.Singleton;
import Model.Mutuelle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bulen
 */
public class MutuelleDaoImpl implements MutuelleDAO {

    private Singleton instance;
    Connection conn;
    ResultSet rs;
    PreparedStatement ps;
    Statement stmt;

    /**
     *
     * @throws SQLException
     */
    public MutuelleDaoImpl() throws SQLException {
        this.instance = Singleton.getInstance();
    }

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Mutuelle get(int id) throws SQLException {
        Mutuelle mutuelle = null;
        conn = instance.getConnection();
        String sql = "SELECT ID_MUTUELLE, NOM_MUTUELLE_MUTUELLE, TAUX_DE_PRISE_EN_CHARGE_MUTUELLE FROM mutuelle WHERE ID_MUTUELLE = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        rs = ps.executeQuery();

        if (rs.next()) {
            int mutuelleId = rs.getInt("ID_MUTUELLE");
            String nomMutuelle = rs.getString("NOM_MUTUELLE_MUTUELLE");
            int tauxPriseEnCharge = rs.getInt("TAUX_DE_PRISE_EN_CHARGE_MUTUELLE");

            mutuelle = new Mutuelle(id, nomMutuelle, "12 rue des Lilas", tauxPriseEnCharge, "Paris", "0123456789");
        }

        return null;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Mutuelle> getAll() throws SQLException {
        conn = instance.getConnection();
        String sql = "SELECT ID_MUTUELLE, NOM_MUTUELLE_MUTUELLE, TAUX_DE_PRISE_EN_CHARGE_MUTUELLE FROM mutuelle";
        List<Mutuelle> mutuelles = new ArrayList<>();

        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int mutuelleId = rs.getInt("ID_MUTUELLE");
            String nomMutuelle = rs.getString("NOM_MUTUELLE_MUTUELLE");
            int tauxPriseEnCharge = rs.getInt("TAUX_DE_PRISE_EN_CHARGE_MUTUELLE");

            Mutuelle mutuelle = new Mutuelle(mutuelleId, nomMutuelle, "12 rue des Lilas", tauxPriseEnCharge, "Paris", "0123456789");
            mutuelles.add(mutuelle);
        }

        return mutuelles;
    }

    /**
     *
     * @param mutuelle
     * @return
     * @throws SQLException
     */
    @Override
    public int create(Mutuelle mutuelle) throws SQLException {
        conn = instance.getConnection();
        String sql = "INSERT INTO mutuelle (NOM_MUTUELLE_MUTUELLE, TAUX_DE_PRISE_EN_CHARGE_MUTUELLE) VALUES (?, ?)";

        ps = conn.prepareStatement(sql);
        ps.setString(1, mutuelle.getNom());

        int result = ps.executeUpdate();

        ps.close();
        conn.close();
        return result;

    }

    /**
     *
     * @param mutuelle
     * @return
     * @throws SQLException
     */
    @Override
    public int update(Mutuelle mutuelle) throws SQLException {

        conn = instance.getConnection();
        String sql = "UPDATE mutuelle SET NOM_MUTUELLE_MUTUELLE = ?, TAUX_DE_PRISE_EN_CHARGE_MUTUELLE = ? WHERE ID_MUTUELLE = ?";

        ps = conn.prepareStatement(sql);
        ps.setDouble(2, mutuelle.getId());
        ps.setString(1, mutuelle.getNom());

        return ps.executeUpdate();
    }

    /**
     *
     * @param mutuelle
     * @return
     * @throws SQLException
     */
    @Override
    public int delete(Mutuelle mutuelle) throws SQLException {
        conn = instance.getConnection();
        String sql = "DELETE FROM mutuelle WHERE ID_MUTUELLE = ?";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, mutuelle.getId());
        return ps.executeUpdate();
    }

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    @Override
    public int read(Mutuelle t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
