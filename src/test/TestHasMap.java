
package test;

import employees.Department;
import employees.Employee;
import employees.EmployeeOrdenByPaterno;
import employees.Job;
import employees.Location;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Roberto Olveras
 */
public class TestHasMap {
    public static void main(String[] args) {
        Map<String,Employee> map = new HashMap<>();
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
        
        map.put("uno", e1);
        map.put("dos", e2);
        map.put("dos", e3);
        map.put("tres", e3);
        map.put(null, e3);
        
        System.out.println("Employee dos: "+map.get("dos"));
        
        for (String key : map.keySet()) {
            System.out.println("--------EMPLOYEE KEY: "+key+"---------");
            System.out.println(map.get(key));
        }
        
//        Set<String> claves = map.keySet();
//        System.out.println("Claves del mapa:");
//        System.out.println(claves);
//        
//        Collection values = map.values();
//        System.out.println("Values del mapa:");
//        System.out.println(values);
        
        
    }
}
