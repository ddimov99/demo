package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    public User addUser(User user,Role roleName){
        Role role=roleRepository.findByName(roleName.getName());
        user.setPassword(hashPassword(user.getPassword()));
        user.getRoles().add(role);
        userRepository.save(user);
        return user;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    private String hashPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

}
