/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import employees.Department;
import employees.Director;
import employees.Employee;
import employees.Job;
import employees.Location;
import employees.Manager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author Humberto
 */
public class TestEmployee {

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

        Employee e2 = new Employee("Pat", "Fay", "PFAY",
                jGraphicDesigner);
        e2.setDepartment(dIT);

        Employee e3 = new Employee("Sigal", "Tobias",
                "STOBIAS", jProgrammer);
        e3.setDepartment(dIT);

        Employee e4 = new Employee("Karen", "Colmenares",
                "KCOLMENA", jSecretary);
        e4.setDepartment(dAdministration);

        Manager m1 = new Manager(e1, "Humberto", "Banuelos", "HBANUELOS", jITManager);
        m1.setDepartment(dIT);
        m1.setSalary(e1, 3500);
        m1.setSalary(m1, 25000);

        System.out.println(m1);
        if (e1.equals(e4)) {
            System.out.println("EQUALS");
        }

        /*System.out.println(e2.getDetails());
         System.out.println(e3.getDetails());
         System.out.println(e4.getDetails());
         System.out.println(m1.getDetails());*/
        int x = new int[][]{
            {1, 2, 3}, 
            {4, 5, 6}, 
            {8, 9, 10, 11}}[1][2];
        System.out.println(x);
    }

}
