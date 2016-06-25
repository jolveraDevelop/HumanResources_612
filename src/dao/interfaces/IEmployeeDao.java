
package dao.interfaces;

import dao.exceptions.DaoException;
import employees.Employee;
import java.util.List;

/**
 *
 * @author Roberto Olveras
 */
public interface IEmployeeDao {
    /**
     * Agrega un employee a la lista en memoria
     * @param employee para ser agregado
     */
    void add(Employee employee) throws DaoException;
    void delete(Employee employe);
    void update(Employee employee);
    Employee findById(Integer id);
    List getAllEmployees();
}
