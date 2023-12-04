package DaoImpl;

import Dao.MedecinDAO;
import Database.Singleton;
import Model.Client;
import Model.Medecin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bulen
 */
public class MedecinDaoImpl implements MedecinDAO {

    private Singleton instance;
    Connection conn;
    ResultSet rs;
    PreparedStatement ps;
    Statement stmt;

    /**
     *
     */
    public MedecinDaoImpl() {
        // Obtenez une instance de la connexion à partir du Singleton
        this.conn = Singleton.getInstanceDB();
    }

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Medecin get(int id) throws SQLException {
        Medecin medecin = null;
        String sql = "SELECT `ID_PERSONNE`, `ID_MEDECIN`, `NOM_PERSONNE`, `PRENOM_PERSONNE`, `NUMERO_DE_AGREEMENT_MEDECIN` FROM `medecin`ID_MEDECIN = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int oid = rs.getInt("ID_PERSONNE");
            String firstname = rs.getString("PRENOM_PERSONNE");
            String lastname = rs.getString("NOM_PERSONNE");
            String numeroAgrement = rs.getString("NUMERO_DE_AGREEMENT_MEDECIN");

            medecin = new Medecin(firstname, lastname, numeroAgrement, oid, "Paris", 123456789, "jeandupont@email.com");

        }
        return medecin;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Medecin> getAll() throws SQLException {
        List<Medecin> medecins = new ArrayList<>();
        String sql = "SELECT `ID_PERSONNE`, `ID_MEDECIN`, `NOM_PERSONNE`, `PRENOM_PERSONNE`, `NUMERO_DE_AGREEMENT_MEDECIN` FROM `medecin`";

        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {

                int oid = rs.getInt("id");
                int medecinId = rs.getInt("ID_MEDECIN");
                String firstname = rs.getString("NOM_PERSONNE");
                String lastname = rs.getString("PRENOM_PERSONNE");
                String numeroAgrement = rs.getString("NUMERO_DE_AGREEMENT_MEDECIN");

                Medecin medecin = new Medecin(firstname, lastname, numeroAgrement, oid, "Paris", 123456789, "jeandupont@email.com");
                medecins.add(medecin);
            }
        }

        return medecins;
    }

    /**
     *
     * @param medecin
     * @return
     * @throws SQLException
     */
    @Override
    public int create(Medecin medecin) throws SQLException {
        conn = instance.getConnection();
        String sql = "INSERT INTO medecin (NOM_PERSONNE, PRENOM_PERSONNE, NUMERO_DE_AGREEMENT_MEDECIN) VALUES (?, ?, ?)";

        ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, medecin.getNom());
        ps.setString(2, medecin.getPrenom());
        ps.setString(3, medecin.getNumeroAgrement());
        // Ajoutez d'autres paramètres si nécessaire
        ps.executeUpdate();

        int result = ps.executeUpdate();
        ps.close();
        conn.close();
        return result;

    }

    /**
     *
     * @param medecin
     * @return
     * @throws SQLException
     */
    @Override
    public int read(Medecin medecin) throws SQLException {
        // Not sure what this method is supposed to do, please clarify
        return 0;
    }

    /**
     *
     * @param medecin
     * @return
     * @throws SQLException
     */
    @Override
    public int update(Medecin medecin) throws SQLException {
        conn = instance.getConnection();
        String sql = "UPDATE medecin SET NOM_PERSONNE=?, PRENOM_PERSONNE=?, NUMERO_DE_AGREEMENT_MEDECIN=? WHERE ID_MEDECIN=?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, medecin.getNom());
        ps.setString(2, medecin.getPrenom());
        ps.setString(3, medecin.getNumeroAgrement());
        ps.setInt(4, medecin.getId());

        int result = ps.executeUpdate();

        ps.close();
        conn.close();
        return result;

    }

    /**
     *
     * @param medecin
     * @return
     * @throws SQLException
     */
    @Override
    public int delete(Medecin medecin) throws SQLException {
        String sql = "DELETE FROM medecin WHERE ID_MEDECIN=?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, medecin.getId());
        return ps.executeUpdate();
    }

}
