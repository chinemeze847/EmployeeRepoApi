/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.resources;

import java.util.*;
import javax.ejb.Stateless;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eze
 */
@XmlRootElement
@Stateless
public class EmployeeService 
{
    private List<Employee> employees;
    private Iterator<Employee> iterator ;
    private static int id;
    
    public EmployeeService()
    {
        employees = new ArrayList<>();
        iterator = employees.iterator();
        id = 0;
    }
    
    public List<Employee> getEmployees()
    {
        return employees;
    }
    
    public void addEmployees(Employee employee)
    {
        ++id;
        employee.setId(id);
        employees.add(employee);
    }
    
    public Employee getEmployee(int id)
    {
        while(iterator.hasNext())
        {
            if(iterator.next().getId() == id)
            {
                return iterator.next();
            }
        }
        
        return null;
    }
}
