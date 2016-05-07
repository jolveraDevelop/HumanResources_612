
package utils;

import employees.Director;
import employees.Employee;
import employees.Manager;

/**
 *
 * @author Roberto Olveras
 */
public class CalculateRateEmployee {
    public int calculateRate(Employee e){
        if(e instanceof Manager){
            return 15;
        }else if(e instanceof Director){
            return 20;
        }else if(e instanceof Employee){
            return 10;
        }else{
            return 0;
        }
    }
}
