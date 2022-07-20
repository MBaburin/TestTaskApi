package com.example.tt.repositories;

import com.example.tt.entityes.TokenEntity;
import org.springframework.data.repository.CrudRepository;

public interface TokenRepo extends CrudRepository<TokenEntity, Long> {
    TokenEntity findByNumber (int number);
    TokenEntity findBySymbol (String symbol);
    TokenEntity findByName (String name);

}
