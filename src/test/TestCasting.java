
package test;

import employees.Department;
import employees.Employee;
import employees.Job;
import employees.Location;
import employees.Manager;

/**
 *
 * @author Roberto Olveras
 */
public class TestCasting {
    public static void main(String[] args) {
        Location lAustralia = new Location("20 Rue des Corps-Saints", 1730, "Geneva", "Geneve", "Australia");

        Department dAdministration = new Department("Administration", lAustralia);
        Department dIT = new Department("IT", lAustralia);

        Job jAdministrationManager = new Job("Administration Manager", 15000, 30000);
        Job jProgrammer = new Job("Programmer", 4000, 15000);
        Job jDirector = new Job("Director", 55000, 105000);
        Job jSecretary = new Job("Secretary", 2500, 4500);

        Employee e1 = new Employee("Karen", "Colmenares",
                "KCOLMENA", jSecretary);
        e1.setDepartment(dAdministration);

        // Se usa polimorfismo para invocar virtualmente el método getDetails
        Employee m1 = new Manager("Pedro", "Gonzalez", "pGonzal", jAdministrationManager);
        ((Manager)m1).setSecretary(e1);
        m1.setDepartment(dAdministration);
        
        
        Manager m2 = new Manager("Juan", "Perez", "jPerez", jProgrammer);
        m2.setSecretary(e1);
        m2.setDepartment(dIT);
        
        Employee e3 = m2;
        Manager m3 = (Manager)m1;
        //Manager m4 = (Manager)e1;
        
        System.out.println(e1.toString());
        
        
    }
}
