
package test;

import employees.Department;
import employees.Employee;
import employees.EmployeeOrdenByPaterno;
import employees.Job;
import employees.Location;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Roberto Olveras
 */
public class TestTreeSetEmployee {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>(new EmployeeOrdenByPaterno());
        
        Location lAustralia = new Location("20 Rue des Corps-Saints", 1730, "Geneva", "Geneve", "Australia");
        
        Department dIT = new Department("IT", lAustralia);
        Job jSecretary = new Job("Secretary", 2500, 4500);

        Employee e1 = new Employee("Roberto", "Olvera",
                "rolvera", jSecretary);
        Employee e2 = new Employee("Karens", "Colmenares",
                "KCOLMENA", jSecretary);
        Employee e3 = new Employee("Pedro", "Olvera",
                "polvera", jSecretary);
        e1.setDepartment(dIT);
        e2.setDepartment(dIT);
        e3.setDepartment(dIT);
        
        System.out.println("ID DE Roberto: " + e1.getId());
        System.out.println("ID DE Karens: " + e2.getId());
        System.out.println("ID DE Pedro: " + e3.getId());
        
        set.add(e2);
        set.add(e3);
        set.add(e1);
        
        //set.add("hola");
        
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("-------------DETALLES DEL EMPLEADO-----------------");
            System.out.println(iterator.next());
        }
    }
}