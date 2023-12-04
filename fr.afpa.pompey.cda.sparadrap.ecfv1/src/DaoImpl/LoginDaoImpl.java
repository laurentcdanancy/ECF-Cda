package DaoImpl;

import Dao.LoginDao;
import Model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bulen
 */
public class LoginDaoImpl implements LoginDao {

    private final Connection connection;

    /**
     *
     * @param connection
     */
    public LoginDaoImpl(Connection connection) {
        this.connection = connection;
    }

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
public Login get(int id) throws SQLException {
    String query = "SELECT * FROM login WHERE id = ?";
    try (PreparedStatement pst = connection.prepareStatement(query)) {
        pst.setInt(1, id);

        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                int userId = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");

                return new Login(userId, username, password);
            }
        }
    }
    return null;
}

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
public List<Login> getAll() throws SQLException {
    List<Login> logins = new ArrayList<>();
    String query = "SELECT * FROM login";
    try (Statement stmt = connection.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()) {
            int userId = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            int id = rs.getInt("id");
            logins.add(new Login(id, username, password));
        }
    }
    return logins;
}

    /**
     *
     * @param login
     * @return
     * @throws SQLException
     */
    @Override
    public int create(Login login) throws SQLException {
        String query = "INSERT INTO login (username, password) VALUES (?, ?)";
        try (PreparedStatement pst = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            pst.setString(1, login.getUsername());
            pst.setString(2, login.getPassword());

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected == 1) {
                try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return generatedKeys.getInt(1);
                    }
                }
            }
        }
        return 0;
    }

    /**
     *
     * @param login
     * @return
     * @throws SQLException
     */
    @Override
    public int update(Login login) throws SQLException {
        String query = "UPDATE login SET username = ?, password = ? WHERE id = ?";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, login.getUsername());
            pst.setString(2, login.getPassword());
            pst.setInt(3, login.getId());

            return pst.executeUpdate();
        }
    }

    /**
     *
     * @param login
     * @return
     * @throws SQLException
     */
    @Override
    public int delete(Login login) throws SQLException {
        String query = "DELETE FROM login WHERE id = ?";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setInt(1, login.getId());
            return pst.executeUpdate();
        }
    }

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    @Override
    public int read(Login t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
