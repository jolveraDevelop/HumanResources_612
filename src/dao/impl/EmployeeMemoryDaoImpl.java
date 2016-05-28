
package dao.impl;

import dao.interfaces.IEmployeeDao;
import employees.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberto Olveras
 */
public class EmployeeMemoryDaoImpl implements IEmployeeDao{
    
    private final static List catEmployees = new ArrayList();

    @Override
    public void add(Employee employee) {
        this.catEmployees.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        this.catEmployees.remove(employee);
    }

    @Override
    public void update(Employee employee) {
        this.catEmployees.remove(employee);
        this.catEmployees.add(employee);
    }

    @Override
    public Employee findById(Integer id) {
        for (Object catEmployee : catEmployees) {
            Employee tmp = (Employee)catEmployee;
            if(tmp.getId() == id.intValue()){
                return tmp;
            }
        }
        return null;
    }

    @Override
    public List getAllEmployees() {
        return this.catEmployees;
    }

}
