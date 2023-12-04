/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImpl;

import Dao.ClientDAO;
import Database.Singleton;
import Model.Client;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bulen
 */
public class ClientDaoImpl implements ClientDAO {

    private Singleton instance;
    Connection conn;
    ResultSet rs;
    PreparedStatement ps;

    /**
     *
     */
    public ClientDaoImpl() {
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
    public Client get(int id) throws SQLException {
        Client client = null;

        String sql = "SELECT * FROM client WHERE ID_CLIENT = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            String firstname = rs.getString("NOM_PERSONNE");
            String lastname = rs.getString("PRENOM_PERSONNE");
            String mutuelle = rs.getString("MUTUELLE_CLIENT");
            double numSecuriteSocial = rs.getDouble("NUMERO_DE_SECURITE_SOCIAL_CLIENT");

            client = new Client(firstname, lastname, firstname, mutuelle, numSecuriteSocial);

        }
        // conn.close();
        return client;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Client> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param client
     * @return
     * @throws SQLException
     */
    @Override
    public int create(Client client) throws SQLException {
        conn = instance.getConnection();
        String sql = "INSERT INTO employees (employee_id, first_name, last_name, dept_id) VALUES (?,?,?,?)";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, client.getId());
        ps.setString(2, client.getPrenom());
        ps.setString(3, client.getNom());
        ps.setString(4, client.getEmail());

        int result = ps.executeUpdate();
        ps.close();
        conn.close();
        return result;
    }

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    @Override
    public int read(Client t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param client
     * @return
     * @throws SQLException
     */
    @Override
    public int update(Client client) throws SQLException {
        conn = instance.getConnection();

        String sql = "UPDATE `client`SET`NOM_PERSONNE` = ?,`PRENOM_PERSONNE` = ?, `NUMERO_DE_SECURITE_SOCIAL_CLIENT` = ?,`DATE_NAISSANCE_CLIENT` = ?,`MUTUELLE_CLIENT` = ?,`MEDECIN_TRAITANT_CLIENT` = ?,`MEDECIN_SPECIALIST_CLIENT` = ?WHERE`ID_CLIENT` = ?";

        ps = conn.prepareStatement(sql);

        ps.setString(1, client.getNom());
        ps.setString(2, client.getPrenom());
        ps.setDouble(3, client.getNumSecuriteSocial());
        ps.setDate(4, (Date) client.getDate());

        int result = ps.executeUpdate();

        ps.close();
        conn.close();
        return result;
    }

    /**
     *
     * @param client
     * @return
     * @throws SQLException
     */
    @Override
    public int delete(Client client) throws SQLException {
        conn = instance.getConnection();
        String sql = "DELETE FROM employees WHERE id =?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, client.getId());
        int result = ps.executeUpdate();
        ps.close();
        conn.close();
        return result;
    }

}
