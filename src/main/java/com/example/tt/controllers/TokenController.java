package com.example.tt.controllers;

import com.example.tt.entityes.TokenEntity;
import com.example.tt.exceptions.AlreadyExistException;
import com.example.tt.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tokens")
public class TokenController {

    @Autowired
    TokenService tokenService;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody TokenEntity token){
        try {
            tokenService.add(token);
            return ResponseEntity.badRequest().body("Токен добавлен");
        }catch (AlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());}
        catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка добавления токена");
        }
    }

    @GetMapping("/show")
    public ResponseEntity show(){
        try {
            return ResponseEntity.ok(tokenService.show());
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка вывода");
        }
    }


}
