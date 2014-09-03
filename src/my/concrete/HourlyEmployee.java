/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author sendres1
 */
public class HourlyEmployee extends Employee {

    double rate;
    double hours;
   
    
    public HourlyEmployee(String name, int ssn) {
        super(name, ssn);
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    
  //  public double calcGrossPay() {
  //      return = rate * hours;
  //  }
    
    
}
