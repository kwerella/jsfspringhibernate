/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.dao;

/**
 *
 * @author MRuser
 */
public interface UserDAO {

    boolean isValid(String username, String password);    
    
    
}
