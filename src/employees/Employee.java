package employees;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Employee {

    private final int ID;
    private String firstName;
    private String lastName;
    private int age;
    private String email, phoneNumber = "000-000-0000";
    private double salary;
    private Date hireDate;
    private Department department;
    private Job job;
    public static int count = 1;

    public Employee() {
        this.ID = count++;
    }
    
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = count++;
    }

    public Employee(String firstName, String lastName,
            String email, Job job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.job = job;
        hireDate = new Date();
        this.ID = count++;
    }

    public int getId() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        if (salary > this.getJob().getMaxSalary()) {
            salary = this.getJob().getMaxSalary();
        } else if (salary < this.getJob().getMinSalary()) {
            salary = this.getJob().getMinSalary();
        }
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
        ArrayList<Employee> employees = department.getEmployeeList();
        employees.add(this);
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getDetails() {
        return "Employee Details: \n"
                + "Employee ID: " + ID + "\n"
                + "First name:" + firstName + "\n"
                + "Last name: " + lastName + "\n"
                + "Age: " + age + "\n"
                + "Email: " + email + "\n"
                + "Phone number: " + phoneNumber + "\n"
                + "Salary: " + salary + "\n"
                + "Hire date: " + hireDate + "\n"
                + "Job: " + job.getTitle() + "\n"
                + "Department: " + department.getName();
    }

    @Override
    public String toString() {
        return "Employee Details: \n"
                + "Employee ID: " + ID + "\n"
                + "First name:" + firstName + "\n"
                + "Last name: " + lastName + "\n"
                + "Age: " + age + "\n"
                + "Email: " + email + "\n"
                + "Phone number: " + phoneNumber + "\n"
                + "Salary: " + salary + "\n"
                + "Hire date: " + hireDate + "\n"
                + "Job: " + job.getTitle() + "\n"
                + "Department: " + department.getName();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.firstName);
        hash = 23 * hash + Objects.hashCode(this.lastName);
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
       if(obj == null){
          return false;
       }
       if(!(obj instanceof Employee)){
          return false; 
       }
       Employee aux = (Employee)obj;
       if(this.firstName.equals(aux.firstName)
               && this.lastName.equals(aux.lastName)){
           return true;
       }else{
            return false;
       }
    }
    
    public  static int getCount(){
        return count;
    }

}
