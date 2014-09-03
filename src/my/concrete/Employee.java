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
public class Employee {
    String name;
    int ssn;
   // double grosspay;

    public Employee(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSsn() {
        return ssn;
    }
    
        
    
}
