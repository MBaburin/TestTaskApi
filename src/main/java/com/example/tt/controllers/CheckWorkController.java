package com.example.tt.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CheckWorkController {

        @GetMapping("/check")
        public ResponseEntity getCheck(){
            try {
                return ResponseEntity.ok("Работает");
            }
            catch (Exception e){
                return ResponseEntity.badRequest().body("Ошибка");
            }
        }
}
