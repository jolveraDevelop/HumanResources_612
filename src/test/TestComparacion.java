
package test;

import employees.Employee;
import employees.Job;

/**
 *
 * @author Roberto Olveras
 */
public class TestComparacion {
    public static void main(String[] args) {
        Job jAdministrationManager = new Job("Administration Manager", 15000, 30000);
        Job jProgrammer = new Job("Programmer", 4000, 15000);
        Job jDirector = new Job("Director", 55000, 105000);
        Job jSecretary = new Job("Secretary", 2500, 4500);

        Employee e1 = new Employee("Karen", "Colmenares",
                "KCOLMENA", jSecretary);
        Employee e2 = e1; 
        Employee e3 = new Employee("Karens", "Colmenares",
                "KCOLMENA", jSecretary);
        
        System.out.println("e1==e2: "+(e1==e2));
        System.out.println("e1==e3: "+(e1==e3));
        
        System.out.println("e1.equals(e2): "+e1.equals(e2));
        System.out.println("e1.equals(e3): "+e1.equals(e3));
        
        System.out.println("e1.hashCode() == e2.hashCode() : "
                                    +(e1.hashCode() == e2.hashCode()));
        System.out.println("e1.hashCode() == e3.hashCode() : "
                                    +(e1.hashCode() == e3.hashCode()));
        System.out.println("e1.hashCode(): "+e1.hashCode());
        System.out.println("e2.hashCode(): "+e2.hashCode());
        System.out.println("e3.hashCode(): "+e3.hashCode());
       
    }
}
