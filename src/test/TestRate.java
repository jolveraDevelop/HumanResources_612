package test;

import employees.Department;
import employees.Employee;
import employees.Job;
import employees.Location;
import employees.Manager;
import utils.CalculateRateEmployee;

/**
 *
 * @author Roberto Olveras
 */
public class TestRate {

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

        Employee e1 = new Employee("Karen", "Colmenares",
                "KCOLMENA", jSecretary);
        e1.setDepartment(dAdministration);

        // Se usa polimorfismo para invocar virtualmente el método getDetails
        Employee m1 = new Manager("Pedro", "Gonzalez", "pGonzal", jAdministrationManager);
        //m1.setSecretary(e1);
        m1.setDepartment(dAdministration);
        
        
        Manager m2 = new Manager("Juan", "Perez", "jPerez", jProgrammer);
        m2.setSecretary(e1);
        m2.setDepartment(dIT);
        
        
        CalculateRateEmployee cal = new CalculateRateEmployee();
        System.out.println("Impuesto para "+e1.getLastName()+" : "+cal.calculateRate(e1));;
        System.out.println("Impuesto para "+m1.getLastName()+" : "+cal.calculateRate(m1));;
        System.out.println("Impuesto para "+m2.getLastName()+" : "+cal.calculateRate(m2));
        
    }
}
