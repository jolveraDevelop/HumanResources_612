/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Date;

/**
 *
 * @author Humberto
 */
public class Contract {

    private Date hireDate;
    private Date endDate;

    public Contract(Date hireDate, Date endDate) {
        this.hireDate = hireDate;
        this.endDate = endDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
