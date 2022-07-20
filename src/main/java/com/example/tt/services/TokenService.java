package com.example.tt.services;

import com.example.tt.entityes.TokenEntity;
import com.example.tt.exceptions.AlreadyExistException;
import com.example.tt.repositories.TokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TokenService {

    @Autowired
    TokenRepo tokenRepo;

    public TokenEntity add(TokenEntity token) throws AlreadyExistException {
        if (tokenRepo.findByNumber(token.getNumber()) != null) {
            throw new AlreadyExistException("Токен с таким номером уже существует");
        } else if (tokenRepo.findBySymbol(token.getSymbol()) != null) {
            throw new AlreadyExistException("Токен с таким символом уже существует");
        } else if (tokenRepo.findByName(token.getName()) != null) {
            throw new AlreadyExistException("Токен с таким именем уже существует");
        }
        return tokenRepo.save(token);
    }
    public Iterable<TokenEntity> show(){
        Iterable<TokenEntity> tokens = tokenRepo.findAll();
        return tokens;
    }
}
