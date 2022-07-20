package com.example.tt.entityes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TokenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;
    private String symbol;
    private String name;
    private double prise;

}
