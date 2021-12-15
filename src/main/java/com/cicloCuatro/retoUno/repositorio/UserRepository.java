package com.cicloCuatro.retoUno.repositorio;

import com.cicloCuatro.retoUno.model.User;
import com.cicloCuatro.retoUno.repository.crud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * @author Jhon Fredy Lizarazo Torres
 */
@Repository
public class UserRepository {
     @Autowired
    private UserCrudRepository userCrudRepository;
     
     public List <User> getAll(){
     return (List<User>) userCrudRepository.findAll();
     }
     
    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }
       
    public User save(User user) {
        return userCrudRepository.save(user);
    }
   
    public boolean existeEmail(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }
    
     public Optional<User> autenticarUsuario(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
     
}
