/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author sendres1
 */
public class SalariedEmployee extends Employee {
 
      double salary;
    
    public SalariedEmployee(String name, int ssn) {
        super(name, ssn);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
}
