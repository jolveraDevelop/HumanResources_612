
package dao.impl;

import dao.exceptions.DaoException;
import dao.interfaces.IEmployeeDao;
import employees.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto Olveras
 */
public class EmployeeJDBCDaoImpl implements IEmployeeDao{

    @Override
    public void add(Employee employees) throws DaoException {
        try {
            Connection conn = DriverManager.getConnection("");
        } catch (SQLException ex) {
            throw new DaoException(ex);
        }
    }

    @Override
    public void delete(Employee employe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Employee employees) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAllEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
