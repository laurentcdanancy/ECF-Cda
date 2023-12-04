/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImpl;

import Dao.OrdonnanceDAO;
import Database.Singleton;
import Model.Ordonnance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author bulen
 */
public class OrdonnanceDaoImpl implements OrdonnanceDAO {
 private Singleton instance;
    Connection conn;
    ResultSet rs;
    PreparedStatement ps;
    Statement stmt;

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Ordonnance get(int id) throws SQLException {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Ordonnance> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    @Override
    public int create(Ordonnance t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    @Override
    public int read(Ordonnance t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    @Override
    public int update(Ordonnance t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    @Override
    public int delete(Ordonnance t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
