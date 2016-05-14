
package test;

import employees.Employee;

/**
 *
 * @author Roberto Olveras
 */
public class TestStatics {
    public static void main(String[] args) {
        System.out.println("Employee.getCount(): "+Employee.getCount());
        Employee e1 = new Employee("Roberto", "Olvera");
        System.out.println("Roberto getId(); "+e1.getId());
        System.out.println("Employee.getCount(): "+Employee.getCount());
        Employee e2 = new Employee("Diana", "Gonzalez");
        System.out.println("Diana getId(); "+e2.getId());
        System.out.println("Employee.getCount(): "+Employee.getCount());
        Employee e3 = new Employee("Pedro", "Ramirez");
        System.out.println("Pedro getId(); "+e3.getId());
        System.out.println("Employee.getCount(): "+e3.count);
        
        
    }
}
