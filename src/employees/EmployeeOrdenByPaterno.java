
package employees;

import java.util.Comparator;

/**
 *
 * @author Roberto Olveras
 */
public class EmployeeOrdenByPaterno implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        // o1 vs o2
        // o1 < o2 return -1
        // o1 > o2 return 1
        // o1 == o2 return 0
        return o1.getLastName().compareTo(o2.getLastName());
    }

}
