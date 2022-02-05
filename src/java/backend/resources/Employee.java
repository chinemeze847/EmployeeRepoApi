/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.resources;

import java.io.Serializable;

public class Employee extends Hypermedia implements Serializable
{
    
    private int id;
    private String firstname;
    private String email;
    private String password;
    

    public Employee(String firstname, String email, String password) 
    {
        this.firstname = firstname;
        this.email = email;
        this.password = password;
    }

    public String getFirsname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFirsname(String firsname) {
        this.firstname = firsname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    
    
}
