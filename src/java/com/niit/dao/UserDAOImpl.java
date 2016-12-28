/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.dao;

import com.niiit.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MRuser
 */
public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }   
    
    @Override
   // @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
   public boolean isValid(String username, String password) {
        
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(User.class, username);
        if(user == null) {
            return false;
        }
        
        if(user.getPassword().equals(password)) {
            return true;
        }
        else {
            return false;
        }        
        
    }
    
    
    
}
