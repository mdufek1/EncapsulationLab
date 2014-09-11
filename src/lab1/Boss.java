
package lab1;

import java.util.Date;

/**
 *
 * @author mdufek1
 */
public class Boss {
    public static void main(String[] args) {
       
        HumanResources hr = new HumanResources();
        
        Employee employee = new Employee("Peter","Piper","333-1234",(new Date(1980,05,20)));
        
        hr.StartOrientation(employee, "C123");
        
        System.out.println("The employee's status is: " + employee.getStatus());
    }
}
