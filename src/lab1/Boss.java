/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.util.Date;

/**
 *
 * @author mdufek1
 */
public class Boss {
    public static void main(String[] args) {
        Employee employee = new Employee("Peter","Piper","333-1234",(new Date(1980,05,20)));
        
        employee.doOrientation("C123");
        
        System.out.println("The employee's status is: " + employee.getStatus());
    }
}