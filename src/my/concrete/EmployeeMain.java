package my.concrete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sendres1
 */
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
    int hours;
    String name;
    String ssn;
   //  hourly;
    
//  Create a Scanner object for  keyboard input.
        Scanner keyboard = new Scanner(System.in);

// Get the number
 //       System.out.print("Please Enter the SSN number: ");
 //       ssn = keyboard.nextInt();
 //    
 //       System.out.println(ssn);
 //       
 //       
 //       System.out.print("Please Enter the Name: ");
 //       name = keyboard.nextLine();
 //       
 //       System.out.print("Enter 'H' for hourly an 'S' for Slaried Employee: ");
 //       hourly = keyboard.nextLine();
        

        // Create instances of Employee Class
        Employee Emp1 = new Employee("Susan Meyers", 111111111);

        Employee Emp2 = new Employee("Mark Jones", 222222222);

        Employee Emp3 = new Employee("Joy Rogers", 333333333);

        // Get the data from the class and display it
        System.out.println();
        System.out.println(Emp1.getName() + "\t" + Emp1.getSsn() + "\t");
        System.out.println(Emp2.getName() + "\t" + Emp2.getSsn() + "\t");
        System.out.println(Emp3.getName() + "\t" + Emp3.getSsn() + "\t");
        System.out.println();
            
}
}
