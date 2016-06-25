
package dao.impl;

import dao.exceptions.DaoException;
import dao.interfaces.IEmployeeDao;
import employees.Employee;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto Olveras
 */
public class EmployeeFileDaoImpl implements IEmployeeDao{

    @Override
    public void add(Employee employees) throws DaoException{
        try {
            FileInputStream fis = new FileInputStream("");
        } catch (FileNotFoundException ex) {
            throw new DaoException(ex);
        }
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

    @Override
    public void delete(Employee employe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
