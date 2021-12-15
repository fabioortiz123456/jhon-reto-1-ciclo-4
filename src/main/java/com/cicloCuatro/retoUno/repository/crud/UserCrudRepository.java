/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cicloCuatro.retoUno.repository.crud;

import com.cicloCuatro.retoUno.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Jhon Fredy Lizarazo Torres
 */
public interface UserCrudRepository extends CrudRepository <User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
