package com.example.tt.services;

import com.example.tt.entityes.UserEntity;
import com.example.tt.exceptions.AlreadyExistException;
import com.example.tt.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws AlreadyExistException {
        if(userRepo.findByUsername(user.getUsername()) != null){
            throw  new AlreadyExistException("Пользователь с таким именем уже существует");
        }
        return userRepo.save(user);
    }

}
