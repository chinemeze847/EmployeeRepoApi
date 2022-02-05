/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;


/**
 *
 * @author Eze
 */
public class EmployeeNotFoundException extends Exception
{
   private String message;
   
   public EmployeeNotFoundException() {
        this.message = "ISBN not found";
    }

    public EmployeeNotFoundException(String message) {
        this.message = message;
    }
}
