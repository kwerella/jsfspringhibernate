/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.bean;

import com.niit.dao.UserDAO;
import java.io.Serializable;

/**
 *
 * @author MRuser
 */

public class LoginBean implements Serializable {
    
    
    private UserDAO userDAO;
    private String username;
    private String password;
    
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    public LoginBean() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String validate() {        
        
        if(userDAO.isValid(username, password)) {
            return "success";
        }
        return "failure";
        
    }
    
    
}
