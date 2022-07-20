package com.example.tt.repositories;

import com.example.tt.entityes.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
    UserEntity findByPassword(String password);

}
