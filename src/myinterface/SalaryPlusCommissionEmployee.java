/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author sendres1
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee{

    
    double commission;

    public SalaryPlusCommissionEmployee(double salary) {
        super(salary);
    }


        public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }
}
