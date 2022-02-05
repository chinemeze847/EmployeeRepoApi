/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 *
 * @author Eze
 */
public class EmployeeNotFoundExceptionManager implements ExceptionMapper<EmployeeNotFoundException> 
{

    @Override
    public Response toResponse(EmployeeNotFoundException exception) {
        return Response.status(Response.Status.NO_CONTENT).build();
    }
    
}
