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
public class Director extends Manager {

    public Director(Employee secretary, String firstName, String lastName, String email, Job job) {
        super(secretary, firstName, lastName, email, job);
    }
    
    public Director() {
        //super();
    }
}
