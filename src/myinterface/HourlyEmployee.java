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
public class HourlyEmployee implements Employee    {
 
      double rate;
    double hours;

    public HourlyEmployee(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }
   
    
    
    public void setRate(double rate) {
        this.rate = rate;
    }

    
  //  public double calcGrossPay() {
  //      return = rate * hours;
  //  }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSsn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
