
package test;

import dao.impl.EmployeeFileDaoImpl;
import dao.impl.EmployeeMemoryDaoImpl;
import dao.interfaces.IEmployeeDao;
import employees.Department;
import employees.Employee;
import employees.Job;
import employees.Location;
import factory.EmployeeDaoFactory;

/**
 *
 * @author Roberto Olveras
 */
public class TestDaoOtro {
    public static void main(String[] args) {
   
        Location lAustralia = new Location("20 Rue des Corps-Saints", 1730, "Geneva", "Geneve", "Australia");

        Department dAdministration = new Department("Administration", lAustralia);
        Department dIT = new Department("IT", lAustralia);

        Job jAdministrationManager = new Job("Administration Manager", 15000, 30000);
        Job jAdministrationAssistant = new Job("Administration Assistant", 3000, 6000);
        Job jITManager = new Job("IT Manager", 15000, 35000);
        Job jProgrammer = new Job("Programmer", 4000, 15000);
        Job jGraphicDesigner = new Job("Graphic Designer", 3000, 12000);
        Job jDirector = new Job("Director", 55000, 105000);
        Job jSecretary = new Job("Secretary", 2500, 4500);
        
        Employee e1 = new Employee("Roberto", "Olvera", "rolvera",jAdministrationManager );
        e1.setDepartment(dAdministration);
        Employee e2 = new Employee("Pedro", "Casas", "pcasas",jAdministrationAssistant );
         e2.setDepartment(dAdministration);
        Employee e3 = new Employee("Mario", "Aguilar", "maguilar",jITManager );
        e3.setDepartment(dIT);
        
        EmployeeDaoFactory factoryEmplDao = new EmployeeDaoFactory();
        IEmployeeDao employeeDao = factoryEmplDao.createEmployeeDao();
        
        employeeDao.add(e1);
        employeeDao.add(e2);
        employeeDao.add(e3);
        System.out.println("Catalogo de empleados");
        System.out.println(employeeDao.getAllEmployees());
        System.out.println("Buscando employee id 1....");
        System.out.println(employeeDao.findById(1));
        employeeDao.delete(e2);
        System.out.println("Catalogo de empleados despues de eliminar al 2");
        System.out.println(employeeDao.getAllEmployees());
        
        
    }
}
