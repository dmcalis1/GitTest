/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncc.nbad;
import java.io.Serializable;

/**
 *
 * @author lsafarne
 */
public class User implements Serializable{
    
    private String firstName;
    private String lastName;
    public User(){
        this.firstName=null;
        this.lastName=null;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setFirstName(String first){
        this.firstName=first;
    }
    public void setLastName(String last){
        this.lastName=last;
    }
    
}
