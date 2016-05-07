package employees;

import java.util.ArrayList;

public class Department {

    private String name;
    private Employee manager;
    private Location location;
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public Department() {
    }

    public Department(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Manager:" + manager);
        System.out.println("Location: " + location.getStreetAddress());
    }

    @Override
    public String toString() {
        return name; 
    }
}
