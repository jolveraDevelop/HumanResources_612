
package factory;

import dao.impl.EmployeeFileDaoImpl;
import dao.impl.EmployeeJDBCDaoImpl;
import dao.impl.EmployeeMemoryDaoImpl;
import dao.interfaces.IEmployeeDao;

/**
 *
 * @author Roberto Olveras
 */
public class EmployeeDaoFactory {
    
    public IEmployeeDao createEmployeeDao(){
        //return new EmployeeMemoryDaoImpl();
        return new EmployeeFileDaoImpl();
        //return new EmployeeJDBCDaoImpl();
    }
}
