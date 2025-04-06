package com.industriaspleneo.course.services;

import com.industriaspleneo.course.entities.User;
import com.industriaspleneo.course.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    @Autowired
    private IUserRepository repository;

    public List<User> findAll(){
        return  repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
