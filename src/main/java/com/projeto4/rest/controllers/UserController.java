package com.projeto4.rest.controllers;

import com.projeto4.rest.entity.User;
import com.projeto4.rest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        userRepository.deleteById(id);
    }

}
