/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;


import backend.resources.*;
import backend.resources.EmployeeService;
import javax.ws.rs.core.*;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;



@Path("api")
public class BookResource {

    @Context
    private UriInfo uriInfo;
    
    Response response ;
    Jsonb jsonb;
    
   
    EmployeeService service;

   
    public BookResource() 
    {
        jsonb = JsonbBuilder.create();
        service = new EmployeeService();
    }

    
    @Path("employees")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmpoyees() 
    {
        Employee employee = new Employee("John","john@gmail.com","kidkde");
        Link self = Link.fromUri(uriInfo.getBaseUriBuilder()
                    .path(getClass())
                    .path(getClass(), "getEmployees")
                    .build(employee.getId()))
                    .rel("self")
                    .type("GET")
                    .build();
        
        LinkResource selfLink = new LinkResource(self);
        
        employee.addLink(selfLink);
        
        String emp = jsonb.toJson(service.getEmployees());
        
        response = Response.ok(emp).build();
        
        return  response;
    }
    
    @Path("employees")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addEmployee(@NotNull @FormParam("firstname")String firstname,
            @NotNull @FormParam("email")String email,
            @NotNull @FormParam("password")String password) 
    {
        
        service.addEmployees(new Employee(firstname,email,password));
        //GenericEntity entity = new GenericEntity<List<Employee>>(service).build();
        
        String serviceStr = jsonb.toJson(service);
        
        response = Response.ok(serviceStr).build();
        
        
        return  response;
    }

   
}
