/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DaoGeneric;

import java.sql.SQLException;
import java.util.List;

/**
 *generic interface 
 * remplacer T par la class model Employee T
 * et implementation employee remplacer par t
 * @author bulen
 * renommer le employee dao en dao parceque il devient generic
 * @param <T>
 * 
 */
public interface DAO<T> {

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    T get(int id) throws SQLException;

    /**
     *
     * @return
     * @throws SQLException
     */
    List<T> getAll() throws SQLException;

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    int create(T t) throws SQLException;

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    int read(T t) throws SQLException;

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    int update(T t) throws SQLException;

    /**
     *
     * @param t
     * @return
     * @throws SQLException
     */
    int delete(T t)throws SQLException;


}
