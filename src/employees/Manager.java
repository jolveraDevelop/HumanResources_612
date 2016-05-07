/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Humberto
 */
public class Manager extends Employee {

    private Employee secretary;

    public Manager() {
        //super();
    }

    public Manager(Employee secretary, String firstName, String lastName, String email, Job job) {
        this(firstName, lastName, email, job);
        this.secretary = secretary;
    }

    public Manager(String firstName, String lastName, String email, Job job) {
        super(firstName, lastName, email, job);
    }

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    public void setSalary(Employee employee, double salary) {
        if (employee instanceof Manager) {
            employee.setSalary(salary + (salary * .12));
            Manager manager = (Manager) employee;
            double empSal = manager.getSecretary().getSalary();
            manager.getSecretary().setSalary(empSal + (empSal * .12));
        } else {
            employee.setSalary(salary);
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails()
                + "Secretary Details: \n"
                + "Employee ID: " + secretary.getId() + "\n"
                + "First name:" + secretary.getFirstName() + "\n"
                + "Last name: " + secretary.getLastName() + "\n"
                + "Age: " + secretary.getAge() + "\n"
                + "Email: " + secretary.getEmail() + "\n"
                + "Phone number: " + secretary.getPhoneNumber() + "\n"
                + "Salary: " + secretary.getSalary() + "\n"
                + "Hire date: " + secretary.getHireDate() + "\n"
                + "Job: " + secretary.getJob().getTitle() + "\n"
                + "Department: " + secretary.getDepartment();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSecretary Details: \n"
                + "Employee ID: " + secretary.getId() + "\n"
                + "First name:" + secretary.getFirstName() + "\n"
                + "Last name: " + secretary.getLastName() + "\n"
                + "Age: " + secretary.getAge() + "\n"
                + "Email: " + secretary.getEmail() + "\n"
                + "Phone number: " + secretary.getPhoneNumber() + "\n"
                + "Salary: " + secretary.getSalary() + "\n"
                + "Hire date: " + secretary.getHireDate() + "\n"
                + "Job: " + secretary.getJob().getTitle() + "\n"
                + "Department: " + secretary.getDepartment();
    }

}
